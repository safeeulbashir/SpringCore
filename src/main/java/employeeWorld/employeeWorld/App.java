package employeeWorld.employeeWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beans.Accountant;
import beans.Student;
import beans.Teacher;
import configuration.AppConfiguration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfiguration.class);
    	Student bean=(Student)applicationContext.getBean(Student.class);
    	bean.speak();
    	Accountant accountant = (Accountant) applicationContext.getBean("accountant");
		accountant.speak();
		Teacher teacher = (Teacher) applicationContext.getBean("teacher");
		teacher.speak();
		Teacher teacher2 = (Teacher) applicationContext.getBean("teacher");
		teacher2.speak();
		((AbstractApplicationContext) applicationContext).close();
    }
}
