package entity;

import org.springframework.stereotype.Component;

/**
 * @ClassName Teacher
 * @Description: //TODO 教师实体类
 * @Author wyq
 * @Date 2022/9/4 20:58
 */
//Component表明该类作为一个Bean被注入工厂
@Component
public class Teacher implements IWork{
    private String tName;

    public String gettName() {
        return tName;
    }

    //必须提供 setter() 方法，因为 Spring 是根据反射机制通过实体类的 setter() 为对象赋值的
    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String work() {
        System.out.println("老师的工作是教书");
        return "教书";
    }
}
