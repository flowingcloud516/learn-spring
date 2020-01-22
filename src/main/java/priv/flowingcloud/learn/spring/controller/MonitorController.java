/*
 * @Time    : 2019-10-08 23:33
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author guruihang@meituan.com
 * @date 2019-10-08
 */
@Controller
@RequestMapping("/monitor")
public class MonitorController {

    @RequestMapping(value = "/alive")
    @ResponseBody
    public String isAlive(Model model){
        return "OK";
    }

}
