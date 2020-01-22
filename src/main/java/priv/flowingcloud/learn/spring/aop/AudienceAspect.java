/*
 * @Time    : 2020-01-12 16:00
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author guruihang@meituan.com
 * @date 2020-01-12
 */
@Component
@Aspect
public class AudienceAspect {

    @Pointcut("execution(* priv.flowingcloud.learn.spring.perform.Performance.perform(..))")
    public void perform() {

    }

    @Before("perform()")
    public void turnOffCellPhones() {
        System.out.println("【Aspect】观众们把手机关了，准备好好享受表演");
    }

    @After("perform()")
    public void noticedShowFinished() {
        System.out.println("【Aspect】观众们发现表演结束了");
    }

    @AfterReturning("perform()")
    public void applause() {
        System.out.println("【Aspect】观众们很欣赏表演，给予演员热烈的掌声");
    }

    @AfterThrowing("perform()")
    public void fuckTheShow() {
        System.out.println("【Aspect】观众们表示表演太烂了完全不值得票价，并往舞台上砸烂菜臭鸡蛋（他们来看表演怎么带这些东西的），场面一度十分混乱");
    }

}
