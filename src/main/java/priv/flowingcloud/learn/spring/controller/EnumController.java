/*
 * @Time    : 2019-11-05 19:42
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.flowingcloud.learn.spring.enums.EnumInRequestParam;

/**
 * @author guruihang@meituan.com
 * @date 2019-11-05
 */

@Controller
@RequestMapping("/enum")
public class EnumController {

    @RequestMapping(value = "/getvalue", method = RequestMethod.GET)
    @ResponseBody
    public EnumInRequestParam getEnumValue(@RequestParam("name") EnumInRequestParam param){
        return param;
    }

}
