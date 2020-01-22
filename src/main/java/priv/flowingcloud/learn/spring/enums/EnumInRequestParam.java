/*
 * @Time    : 2019-11-05 19:40
 * @Author  : guruihang
 */

package priv.flowingcloud.learn.spring.enums;

/**
 * @author guruihang@meituan.com
 * @date 2019-11-05
 */
public enum EnumInRequestParam {
    One("one", 1), Two("two", 2);

    private String name;
    private int num;

    EnumInRequestParam(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static EnumInRequestParam getEnumValueByName(String name) {
        for (EnumInRequestParam v : values()){
            if (v.getName().equals(name)){
                return v;
            }
        }
        return One;
    }
}
