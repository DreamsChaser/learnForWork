package cn.com.git.leon.B_javaCore.i_clone.shallowClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class Person implements Cloneable{

    private String name;

    private int age;

    private Integer age2;

    private Company company;

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


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person(String name, int age, Integer age2,Company company) {
        this.name = name;
        this.age = age;
        this.age2 = age2;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", age2=" + age2 +
                ", company=" + company +
                '}';
    }
}
