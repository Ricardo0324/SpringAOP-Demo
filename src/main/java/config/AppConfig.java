package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName AppConfig
 * @Description: //TODO 配置文件，相当于xml
 * @Author wyq
 * @Date 2022/9/4 21:06
 */
//标志为配置文件，相当于xml
@Configuration
//将指定路径的类注入容器
@ComponentScan(basePackageClasses = {entity.IWork.class})
//启用AOP功能
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
