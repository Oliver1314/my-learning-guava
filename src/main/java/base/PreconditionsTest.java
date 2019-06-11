package base;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by Oliver on 2018/9/4.
 */
public class PreconditionsTest {

    /**
     * Guava在Preconditions类中提供了若干前置条件判断的实用方法，我们强烈建议在Eclipse中静态导入这些方法。每个方法都有三个变种：

     没有额外参数：抛出的异常中没有错误消息；
     有一个Object对象作为额外参数：抛出的异常使用Object.toString() 作为错误消息；
     有一个String对象作为额外参数，并且有一组任意数量的附加Object对象：这个变种处理异常消息的方式
     */

    @Test
    public void checkTest(){

        /**
         * checkArgument(boolean)
         * 检查boolean是否为true，用来检查传递给方法的参数。
         */
        Preconditions.checkArgument(6>7,"参数错误 %s < %s " ,6,7);
    }

    @Test
    public void checkTest1(){

        /**
         * 检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。
         */

        //Integer value=Preconditions.checkNotNull(null);
        Integer value=Preconditions.checkNotNull(6);

        System.out.println(value);

        /**
         * 用来检查对象的某些状态。
         */

        Boolean state=true;

        Preconditions.checkState(state);
    }

    @Test
    public void indexCheckTest(){

        /**
         * 检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size
         */

        Integer[] arr=new Integer[4];

        Preconditions.checkElementIndex(3,arr.length);

        /**
         * 检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *
         */

        Preconditions.checkPositionIndex(4,arr.length);


        /**
         * 检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*
         */
        Preconditions.checkPositionIndexes(0,4,arr.length);







    }
}
