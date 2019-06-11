package base;

import com.google.common.base.MoreObjects;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Objects;


/**
 * Created by Oliver on 2018/9/4.
 */
public class ObjectsTest {

    @Test
    public void equalsTest() {
        //此法可避免空指针
        Assert.assertTrue(Objects.equals(null, null));

        Assert.assertFalse(Objects.equals(null, 1));

    }

    @Test
    public void hashTest() {
        System.out.println(Objects.hash("a"));
    }

    @Test
    public void toStringTest() {
        String result = MoreObjects.toStringHelper("Oliver")
                .add("x", 1)
                .add("y", null)
                .toString();


        System.out.println(result);
    }

    @Test
    public void compareTest() {
        Person p1 = new Person("zhangsan", 22, "女");
        Person p2 = new Person("lisi", 22, "男");

        System.out.println(p1.compareTo(p2));
    }
}
