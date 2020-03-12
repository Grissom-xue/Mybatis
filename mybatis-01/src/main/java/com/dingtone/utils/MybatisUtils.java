package com.dingtone.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            // 使用Mybatis第一步 获取sqlSessionFactory
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 获取sqlSessionFactory之后，我们就可以通过工厂方法获取SqlSession的实例了
    // SqlSession 实例完全包含了面向数据库执行SQL命令的所有方法

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
