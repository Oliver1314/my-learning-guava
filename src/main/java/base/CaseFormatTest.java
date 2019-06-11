package base;

import com.google.common.base.CaseFormat;
import org.junit.Test;

/**
 * Created by Oliver on 2018/9/28.
 */
public class CaseFormatTest {

    @Test
    public void caseTest(){
        String data = "test_data";
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, data));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, data));
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, data));
    }
}
