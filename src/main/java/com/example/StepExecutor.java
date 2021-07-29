
package com.example;

import org.springframework.stereotype.Component;

/**
 * 需要执行的操作
 *
 * @author
 * @date
 */
@Component
public class StepExecutor implements Runnable {
    @Override
    public void run() {
        startStreamTask();

    }

    /**
     * 项目启动后打开1个页面
     */
    public void startStreamTask() {
        System.out.println("自动启动页面");
        try {
            Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8080/action");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}