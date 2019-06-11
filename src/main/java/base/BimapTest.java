package base;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * Created by Oliver on 2018/9/19.
 */
public class BimapTest {

    @Test
    public void put(){
        BiMap<String,Integer> biMap = HashBiMap.create();

        biMap.put("a",1);
        biMap.put("b",2);
        System.out.println(biMap.get("a"));
        System.out.println(biMap.inverse().get(1));
    }
}
