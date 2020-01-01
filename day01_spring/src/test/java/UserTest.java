

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void  test(){
        //读取applicationContext.xml文件,并启动spring容器,并根据配置文件中的内容 在spring容器中相对应的对象
        ApplicationContext app =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");//如果是单例,创建对象,如果是多例模式.getBean()创建对象
       // 根据id获取,从spring容器中获取对象
        //UserService userService = (UserService) app.getBean("userService");
        // UserDao userDao1= (UserDao) app.getBean("userDaoImpl");
       // UserDao userDao2 = (UserDao) app.getBean("userDaoImpl");
        //System.out.println(userDao1==userDao2);//prototype:多例模式(false)  singleton:单例模式(true)
       // 执行方法
        //userService.save();
        UserDao userDao = (UserDao) app.getBean("userDao");
        System.out.println(userDao);
    }
}
