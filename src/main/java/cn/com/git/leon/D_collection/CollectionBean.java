package cn.com.git.leon.D_collection;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class CollectionBean {

    private String id;

    private String name;

    private int version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public CollectionBean(String id, String name, int version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }
}
