package cn.com.git.leon.A_Algorithm.Bitmap;

/**
 * @author sirius
 * @since 2019/5/14
 */
public enum TagEnum {
    MAN(1,"男"),
    WOMEN(2,"女"),
    CXY(4,"程序员"),
    NOHAIR(8,"脱发"),
    NOMONEY(16,"没钱"),
    ALONE(32,"单身"),
    ;


    private Integer value;

    private String name;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    TagEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
