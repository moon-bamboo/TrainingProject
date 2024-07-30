package com.example.moon.mapper;

import com.example.moon.model.Notification;
import com.example.moon.model.NotificationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface NotificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    long countByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int deleteByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int insert(Notification row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int insertSelective(Notification row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    List<Notification> selectByExampleWithRowbounds(NotificationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    List<Notification> selectByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    Notification selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByExampleSelective(@Param("row") Notification row, @Param("example") NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByExample(@Param("row") Notification row, @Param("example") NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByPrimaryKeySelective(Notification row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Tue Jul 30 18:46:11 CST 2024
     */
    int updateByPrimaryKey(Notification row);
}