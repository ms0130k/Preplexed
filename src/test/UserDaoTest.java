package test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context;
		context = new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		dao = (UserDao) context.getBean("userDao");
		dao.deleteAll();
		dao.deleteAll();
		dao.deleteAll();
		dao.deleteAll();
		dao.deleteAll();
		User user = new User();
		user.setId("아이디");
		user.setName("이름");
		user.setPassword("비밀번호");
		dao.add(user);
		System.out.println(dao.get("아이디"));
	}
}
