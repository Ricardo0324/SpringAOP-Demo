import config.AppConfig;
import entity.Student;
import entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SpringAOPApplication
 * @Description: //TODO 启动类
 * @Author wyq
 * @Date 2022/9/4 21:16
 */
public class SpringAOPApplication {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        //通过注解配置工厂
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) factory.getBean("student");
        student.work();
        Teacher teacher = (Teacher) factory.getBean("teacher");
        teacher.work();
    }
}
