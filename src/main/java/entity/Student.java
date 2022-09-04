package entity;

import org.springframework.stereotype.Component;

/**
 * @ClassName Student
 * @Description: //TODO 学生实体类
 * @Author wyq
 * @Date 2022/9/4 20:58
 */
//Component表明该类作为一个Bean被注入工厂
@Component
public class Student implements IWork{
    private String sName;
    private int age;
    private Teacher teacher;

    public Student() {
        this.sName = "小王";
        this.age = 21;
    }

    public String getsName() {
        return sName;
    }

    //必须提供 setter() 方法，因为 Spring 是根据反射机制通过实体类的 setter() 为对象赋值的
    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String work() {
        System.out.println("学生的工作是上课");
        return "上课";
    }
}
