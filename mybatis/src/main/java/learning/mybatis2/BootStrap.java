package learning.mybatis2;

import learning.mybatis2.bean.Test;
import learning.mybatis2.config.Configuration;
import learning.mybatis2.executor.ExecutorFactory;
import learning.mybatis2.mapper.TestMapper;
import learning.mybatis2.session.SqlSession;

public class BootStrap {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Configuration config = new Configuration();
        config.setScanPath("learning.mybatis2.mapper");
        config.build();
        SqlSession sqlSession = new SqlSession(config,
                ExecutorFactory.get(ExecutorFactory.ExecutorType.CACHING, config));
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        Test test = testMapper.selectByPrimaryKey(2);
        System.out.println(test);
    }
}
