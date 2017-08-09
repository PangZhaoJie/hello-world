package com.Mapper;


import org.apache.ibatis.annotations.Select;

/**
 * Created by admin on 2016/10/29.
 */
public interface QueryMapper {
    @Select("select name from user order by test_id desc limit 1")
    String findById();
}
