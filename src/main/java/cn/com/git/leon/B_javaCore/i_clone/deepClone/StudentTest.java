package cn.com.git.leon.B_javaCore.i_clone.deepClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class StudentTest {
    public static void main(String[] args) {
        Name name = new Name("小","明");
        name.setFirstName("小");
        name.setSecondName("明");
        Student student = new Student();
        student.setName(name);
    }
}
