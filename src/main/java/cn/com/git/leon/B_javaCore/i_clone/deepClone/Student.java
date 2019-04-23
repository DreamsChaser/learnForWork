package cn.com.git.leon.B_javaCore.i_clone.deepClone;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class Student implements Cloneable{

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Student student = (Student) object;
        student.name = (Name) name.clone();
        return object;
    }
}
