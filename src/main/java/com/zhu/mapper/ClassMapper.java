package com.zhu.mapper;

import com.zhu.pojo.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {

    //查询所有班级信息
    List<Class> getStudentClass();
}
