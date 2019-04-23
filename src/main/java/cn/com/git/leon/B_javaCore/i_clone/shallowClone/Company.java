package cn.com.git.leon.B_javaCore.i_clone.shallowClone;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class Company {

    private String name;

    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Company(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
