import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {



       @Test
       public void test1(){

              ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

              BookService bookServiceImpl = (BookService) classPathXmlApplicationContext.getBean("BookServiceImpl");

              for (Books queryAllBook : bookServiceImpl.queryAllBooks()) {
                     System.out.println(queryAllBook);
              }
              
       }


}
