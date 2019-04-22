package cn.com.git.leon.B_javaCore.i_clone.deepClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class StudentTest {
    public static void main(String[] args) {
        Name name = new Name();
        name.setFirstName("小");
        name.setSecondName("明");
        Student student = new Student();
        student.setName(name);
        try {
            Student student1 = (Student) student.clone();
            System.out.println(student.getName() == student1.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
