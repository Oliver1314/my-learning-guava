package base;

import com.google.common.collect.ComparisonChain;

/**
 * Created by Oliver on 2018/9/4.
 */
public class Person implements Comparable<Person> {

    private String name;

    private Integer age;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 比较链
     * @param o
     * @return
     */

    @Override
    public int compareTo(Person o) {
        return ComparisonChain.start()
                .compare(this.age,o.getAge())
                .compare(this.name,o.getName())
                .compare(this.sex,o.sex)
                .result();
    }
}
