package cn.com.git.leon.B_javaCore.j_Polymorphism;

/**
 * this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
 * @author sirius
 * @since 2019/3/14
 */
public class ATest {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        //this.show(O)->this.show(super(O)) : A and A
        a1.show(b);
        //this.show(O)->this.show(super(O)) : A and A
        a1.show(c);
        //this.show(O) : A and D
        a1.show(d);
        //this.show(O) -> this.show(super(O)) ->引用指向子类对象B覆盖了  : B and A
        a2.show(b);
        // this.show(O) -> this.show(super(O)) ->引用指向子类对象B覆盖了  : B and A
        a2.show(c);
        // this.show(O) ->引用指向子类未覆盖 A and D
        a2.show(d);
        // this.show(O) -> B and B
        b.show(b);
        //this.show(O)->super.show(O)->this.show(super(O)) B and B
        b.show(c);
        //this.show(O)->super.show(O) A and D
        b.show(d);
    }
}
