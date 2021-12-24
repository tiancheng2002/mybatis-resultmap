package com.zhu.mapper;

import com.zhu.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    //查找所有学生信息
    List<Student> getStudent(@Param("cid") int cid);
}
