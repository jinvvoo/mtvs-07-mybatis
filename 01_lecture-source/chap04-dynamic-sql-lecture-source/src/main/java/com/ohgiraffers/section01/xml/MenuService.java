package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

public class MenuService {
    public void findMenuByPrice(int price){

        SqlSession sqlSession = getSqlSession();

        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        System.out.println("mapper = " + mapper);

    }
}
