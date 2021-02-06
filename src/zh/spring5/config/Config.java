package zh.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"zh.spring5"})   //开启注解扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)    //开启Aspect生成代理对象
public class Config {
}
