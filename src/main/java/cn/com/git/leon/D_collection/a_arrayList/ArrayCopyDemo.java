package cn.com.git.leon.D_collection.a_arrayList;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        Name name = new Name("小","明");
        People people = new People("1",18,name);
        People[] peoples = new People[]{people};
        People[] peopleClone = peoples.clone();
        System.out.println(peoples[0]);
        System.out.println(peopleClone[0]);
        people.name.firstName = "大";
        people.name.lastName = "鹏";
        people.age = 20;
        people.id = "2";
        System.out.println(peoples[0]);
        System.out.println(peopleClone[0]);
        //--------------------------------------
        People[] peopleArraycopy = new People[1];
        System.arraycopy(peoples,0,peopleArraycopy,0,1);
        System.out.println(peoples[0]);
        System.out.println(peopleArraycopy[0]);
        people.name.firstName = "巨";
        people.name.lastName = "人";
        people.age = 200;
        people.id = "3";
        System.out.println(peoples[0]);
        System.out.println(peopleArraycopy[0]);
    }

}


class People{

    String id;

    int age;

    Name name;

    public People(String id, int age, Name name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}

class Name{
    String firstName;

    String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}