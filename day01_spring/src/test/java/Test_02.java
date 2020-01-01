import com.itheima.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_02 {
    @Test
    public void test1(){
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_1.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_1.xml");
        UserDao userDao2 = (UserDao) app.getBean("userDao2");
        userDao2.save();
    }

}
