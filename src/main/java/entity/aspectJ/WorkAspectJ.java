package entity.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @ClassName WorkAspectJ
 * @Description: //TODO 定义一个工作切面
 * @Author wyq
 * @Date 2022/9/4 21:03
 */
//表示是一个切面
@Aspect
//表明该类作为一个Bean被装配
@Component
public class WorkAspectJ {
    //@Before表示将在方法执行前执行，参数"execution(* entity.IWork.work(..))"声明切点位置。
    @Before("execution(* entity.IWork.work(..))")
    public void test() {
        System.out.println("学生跟老师都有自己的职责");
    }
}
