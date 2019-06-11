package base;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.List;

/**
 * Created by Oliver on 2018/9/19.
 */
public class TableTest {

    @Test
    public void table(){
        Table<String,String,String> table = HashBasedTable.create();

        table.put("IBM", "101","Mahesh");
        table.put("IBM", "102","Ramesh");
        table.put("IBM", "103","Suresh");
        table.put("a", "103","Suresh");


        System.out.println(table.columnKeySet());

        System.out.println(table.cellSet());
        System.out.println(table.row("a"));
        System.out.println(table.column("103"));


        List<IBMTest> list = Lists.newArrayList();
        list.add(new IBMTest(1,"zhangsan"));
        list.add(new IBMTest(2,"lisi"));

        Table<String,Object,Object> t = HashBasedTable.create();

        for(IBMTest test : list){
//            t.put("id",test.getId(),test.getId());
//            t.put("name",test.getName(),test.getName());
            t.put("test",test.getId(),test);
        }

        System.out.println(t.row("test"));
    }

    private static class IBMTest{
        private Integer id;
        private String name;

        public IBMTest(Integer id,String name){
            this.id = id ;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
