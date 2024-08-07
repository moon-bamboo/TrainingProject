package com.example.moon.mapper;

import com.example.moon.model.Question;
import com.example.moon.model.QuestionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    long countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int insert(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int insertSelective(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    List<Question> selectByExampleWithBLOBsWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    List<Question> selectByExampleWithBLOBs(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    List<Question> selectByExampleWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    Question selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByExampleSelective(@Param("row") Question row, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("row") Question row, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByExample(@Param("row") Question row, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByPrimaryKeySelective(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByPrimaryKey(Question row);
}