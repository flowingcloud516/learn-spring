/*
 * @Time    : 2020-01-12 16:04
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.flowingcloud.learn.spring.enums.EnumInRequestParam;
import priv.flowingcloud.learn.spring.perform.Performance;

import javax.annotation.Resource;

/**
 * @author guruihang@meituan.com
 * @date 2020-01-12
 */

@Controller
@RequestMapping("/aspect")
public class AspectLearningController {

    @Resource(name = "Pianist")
    private Performance pianist;

    @Resource(name = "Dancer")
    private Performance dancer;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping(value = "/perform/piano", method = RequestMethod.GET)
    @ResponseBody
    public String performPiano() {
        System.out.println(pianist.getClass());
        pianist.perform();
        return "Finish performing";
    }

    @RequestMapping(value = "/dance", method = RequestMethod.GET)
    @ResponseBody
    public String performDance() {
        System.out.println(dancer.getClass());
        dancer.perform();
        return "Finish performing";
    }
}
