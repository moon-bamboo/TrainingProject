package com.example.moon.controller;

import com.example.moon.DTO.PageDTO;
import com.example.moon.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/search")
    public String search(Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "8") Integer size,
                         @RequestParam(name = "search",defaultValue = "") String search) {
        if(search.equals("")){
            return "redirect:/";
        }
        PageDTO pageDTO = questionService.listBySearch(search,page,size);//获取首页问题列表信息
        model.addAttribute("pageDTO", pageDTO);//将pageDTO注入model，传入前端
        model.addAttribute("search",search);
        return "search";
    }
}
