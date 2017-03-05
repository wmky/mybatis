package com.example.mybatis;

import com.example.mybatis.entity.UserGroupCrit;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Created by wmky_kk on 2017/3/5.
 */
public class CritTest {
    public static void main(String args[]) throws IOException{
        InputStream inputStream = CritTest.class.getClassLoader().getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // statement 由映射文件namespace + 标签
        String statement = "com.example.mybatis.entity.UserGroupCrit.findUserGroupCritById";
        UserGroupCrit userGroupCrit = sqlSession.selectOne(statement,90L);
        List<UserGroupCrit> userGroupCrit1 = sqlSession.selectList("com.example.mybatis.entity.UserGroupCrit.findUserGroupCritByGroupId", 24L);

        System.out.println(userGroupCrit);
        System.out.println(userGroupCrit1);
    }
}
