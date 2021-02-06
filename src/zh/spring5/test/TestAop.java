package zh.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zh.spring5.aopanno.User;
import zh.spring5.aopxml.Book;

public class TestAop {
    @Test
    public void testAopAnno(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        User user=context.getBean("user",User.class);
        user.add();
    }
    @Test
    public void testAopXml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book=context.getBean("book", Book.class);
        book.buy();
    }
}
