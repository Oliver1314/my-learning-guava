package oliver;

/**
 * @auhor Oliver
 * @date 2019/6/14 15:28
 *
 * 接口中定义枚举类，参考zookeeper Watcher
 */
public interface OrderType {

    public enum Type{
        zhifubao,
        weixin;
    }

    public interface AA{
        public enum Color{
            Red,Yellow,Blue;
        }
    }
}
