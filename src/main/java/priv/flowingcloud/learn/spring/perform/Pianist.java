/*
 * @Time    : 2020-01-12 15:59
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.perform;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author guruihang@meituan.com
 * @date 2020-01-12
 */

@Service("Pianist")
public class Pianist implements Performance{

    @Override
    public void perform() {
        System.out.println("[真实代码] 大家好，我叫×××，现在开始演奏钢琴");

        if (System.currentTimeMillis() % 2 == 0) {
            System.out.println("然后表演失败了");
            throw new RuntimeException("然后表演失败了");
        }
    }
}
