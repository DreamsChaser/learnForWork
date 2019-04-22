package cn.com.git.leon.B_javaCore.i_clone.shallowClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class PersonCloneTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        person.setAge2(130);
        person.setName("小明");
        try {
            Person person2 = (Person) person.clone();
            System.out.println(person2.getName()+"\n"+person2.getAge()+"\n"+person2.getAge2());
            System.out.println(person.getName()==person2.getName());
            System.out.println(person.getAge2()==person2.getAge2());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
