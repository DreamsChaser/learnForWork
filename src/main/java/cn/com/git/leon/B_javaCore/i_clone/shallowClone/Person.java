package cn.com.git.leon.B_javaCore.i_clone.shallowClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class Person implements Cloneable{

    private String name;

    private int age;

    private Integer age2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
