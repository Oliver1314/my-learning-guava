package base;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Oliver on 2018/9/3.
 */
public class OptionalTest {


    @Test
    public void createTest(){
        Optional<Integer> opt=Optional.<Integer>absent();

        Assert.assertEquals(false,opt.isPresent());

        Optional<Integer> opt1=Optional.<Integer>of(1);

        Assert.assertEquals(true,opt1.isPresent());
    }

    @Test
    public void getTest(){
        Integer notNull=1;
        Optional<Integer> opt = Optional.fromNullable(notNull);

        Assert.assertEquals(1,opt.get().intValue());

        Integer isNull=null;
        Optional<Integer> nullOpt = Optional.fromNullable(isNull);

        Assert.assertEquals(1,nullOpt.or(1).intValue());

    }

    @Test
    public void transFormTest(){
        Optional<Integer> opt=Optional.<Integer>of(10);

        Function<Integer,String> function= i -> "hello: "+i.toString();


        Optional<String> transOpt=opt.transform(function);

        System.out.println(transOpt.get());

    }



}
