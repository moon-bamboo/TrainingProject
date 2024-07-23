package com.example.moon.controller;

import com.example.moon.DTO.QuestionDTO;
import com.example.moon.exception.CustomizeErrorCode;
import com.example.moon.exception.CustomizeException;
import com.example.moon.model.Question;
import com.example.moon.model.User;
import com.example.moon.service.QuestionService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PublishController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/publish")
    public String publish(){
        return "/publish";
    }

    @GetMapping("/publish/{id}")
    public String edit(@PathVariable(name="id") Integer id,
                       Model model,
                       HttpServletRequest request){
        QuestionDTO question = questionService.getById(id);
        if(!question.getCreator().equals(((User) request.getSession().getAttribute("user")).getId())){
            //登录的用户与文章作者不匹配
            throw new CustomizeException(CustomizeErrorCode.UNAUTHORIZED_ACCESS);
        }
        model.addAttribute("title",question.getTitle());
        model.addAttribute("description",question.getDescription());
        model.addAttribute("tag",question.getTag());
        model.addAttribute("id",question.getId());

        return "editPublish";
    }

    @PostMapping("/editPublish")
    public String editPublish(
            //编辑现有问题时，执行此方法
            @RequestParam("title")String title,
            @RequestParam("description")String description,
            @RequestParam("tag")String tag,
            @RequestParam("id")Integer id,
            HttpServletRequest request,
            Model model){

        model.addAttribute("title",title);
        model.addAttribute("description",description);
        model.addAttribute("tag",tag);
        if(title==null || title==""){
            model.addAttribute("error","标题不能为空");
            return "editPublish";
        }
        if(description==null || description==""){
            model.addAttribute("error","描述不能为空");
            return "editPublish";
        }
        if(tag==null || tag==""){
            model.addAttribute("error","标签不能为空");
            return "editPublish";
        }

        //获取向数据库中保存的Question对象，并对其赋值
        Question question = new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        User user=(User)request.getSession().getAttribute("user");
        //判断是否处于登录状态（该段代码待优化，增加页面访问控制，拦截器，避免未登录状态进入问题发布页面）
        if(user==null){
            model.addAttribute("error","用户未登录");
            return "redirect:/";
        }
        question.setCreator(user.getId());
        question.setId(id);
        //执行方法，向数据库中保存
        questionService.createOrUpdate(question);

        return "redirect:/";
    }


    @PostMapping("/publish")
    public String dopublish(
            //发布问题时，执行此方法
            @RequestParam("title")String title,
            @RequestParam("description")String description,
            @RequestParam("tag")String tag,
            HttpServletRequest request,
            Model model){

        model.addAttribute("title",title);
        model.addAttribute("description",description);
        model.addAttribute("tag",tag);
        if(title==null || title==""){
            model.addAttribute("error","标题不能为空");
            return "editPublish";
        }
        if(description==null || description==""){
            model.addAttribute("error","描述不能为空");
            return "editPublish";
        }
        if(tag==null || tag==""){
            model.addAttribute("error","标签不能为空");
            return "editPublish";
        }

        //获取向数据库中保存的Question对象，并对其赋值
        Question question = new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        User user=(User)request.getSession().getAttribute("user");
        //判断是否处于登录状态（该段代码待优化，增加页面访问控制，拦截器，避免未登录状态进入问题发布页面）
        if(user==null){
            model.addAttribute("error","用户未登录");
            return "redirect:/";
        }
        question.setCreator(user.getId());
        //执行方法，向数据库中保存
        questionService.createOrUpdate(question);

        return "redirect:/";
    }
}
