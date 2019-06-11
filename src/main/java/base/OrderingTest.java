package base;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.List;

/**
 * Created by Oliver on 2018/9/4.
 */
public class OrderingTest {

    /**
     * 对可排序类型做自然排序，如数字按大小，日期按先后排序
     */
    @Test
    public void naturalTest(){


        List<String> list= Lists.newArrayList("a","A","b","c","B");


        System.out.println(Ordering.natural().sortedCopy(list));
        System.out.println(Ordering.natural().reverse().sortedCopy(list));

        list.add(null);
        System.out.println(Ordering.natural().nullsFirst().sortedCopy(list));
        System.out.println(Ordering.natural().nullsLast().sortedCopy(list));
    }

    @Test
    public void useTest(){

        List<Integer> list= Ints.asList(12,21,11,32,42,54,33);


        System.out.println(Ordering.natural().greatestOf(list,7));

        System.out.println(Ordering.natural().isOrdered(Ordering.natural().sortedCopy(list)));

        System.out.println(Ordering.natural().min(list));
    }

}
