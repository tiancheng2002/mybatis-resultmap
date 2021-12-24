package com.zhu.mapper;

import com.zhu.pojo.Class;
import com.zhu.pojo.Student;
import com.zhu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestMapper {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);
        List<Class> classes = mapper.getStudentClass();
        for (Class studentClass:classes){
            System.out.println(studentClass);
        }
    }
}
