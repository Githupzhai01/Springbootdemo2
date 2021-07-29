
package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * spring boot 容器加载完成后执行
 * @author
 * @date
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext ac = event.getApplicationContext();
        StepExecutor StepExecutor = ac.getBean(StepExecutor .class);
        Thread thread = new Thread(StepExecutor);
        thread.start();
    }
}
