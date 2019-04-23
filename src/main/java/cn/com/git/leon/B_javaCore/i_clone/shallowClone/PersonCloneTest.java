package cn.com.git.leon.B_javaCore.i_clone.shallowClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class PersonCloneTest {
    public static void main(String[] args) {
        Company company = new Company("华为",1000);
        Person person = new Person("小明",1,130,company);
        try {
            System.out.println(person);
            Person person2 = (Person) person.clone();
            System.out.println(person2);
            person.setName("小明改");
            person.setAge(11);
            person.setAge2(1301);
            company.setName("阿里");
            company.setSize(100);
            System.out.println(person);
            System.out.println(person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
