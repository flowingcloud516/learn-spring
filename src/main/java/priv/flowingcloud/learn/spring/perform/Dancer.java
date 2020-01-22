/*
 * @Time    : 2020-01-12 16:42
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.perform;

import org.springframework.stereotype.Service;

/**
 * @author guruihang@meituan.com
 * @date 2020-01-12
 */
@Service("Dancer")
public class Dancer implements Performance {


    @Override
    public void perform() {
        System.out.println("【真实逻辑】大家好我这就开始跳舞了");
    }
}
