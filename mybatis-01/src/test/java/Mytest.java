import com.dingtone.dao.UserDao;
import com.dingtone.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {

    @Test
    public void test01(){
//        获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        获取mapper对象,相当于
//        UserDao UserDao = sqlSession.getMapper(UserDao.class);
        UserDao mapper = sqlSession.getMapper(UserDao.class);
    }
}
