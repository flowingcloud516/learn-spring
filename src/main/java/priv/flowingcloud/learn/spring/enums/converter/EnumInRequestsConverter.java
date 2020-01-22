/*
 * @Time    : 2019-11-05 20:03
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.enums.converter;

import org.springframework.core.convert.converter.Converter;
import priv.flowingcloud.learn.spring.enums.EnumInRequestParam;

/**
 * @author guruihang@meituan.com
 * @date 2019-11-05
 */
public class EnumInRequestsConverter implements Converter<String, EnumInRequestParam> {

    @Override
    public EnumInRequestParam convert(String s) {
        try {
            return EnumInRequestParam.getEnumValueByName(s);
        }catch (Exception e){
            return EnumInRequestParam.One;
        }
    }

}
