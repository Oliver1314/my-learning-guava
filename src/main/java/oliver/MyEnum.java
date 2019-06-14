package oliver;

import oliver.OrderType.AA.Color;
/**
 * @auhor Oliver
 * @date 2019/6/14 15:30
 * 类里面定义接口
 */
public class MyEnum {

    final private Color color;

    public MyEnum(Color color){
        this.color = color;
    }

    public interface Constant{
        public final String name ="hello";
    }
}
