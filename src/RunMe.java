import a.b.c.Boo;
import a.b.c.Foo;
import a.b.c.Zoo;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * by Irina.Petrovskaya, on 02.12.11, 19:55
 */
public class RunMe {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring-config.xml");
        ctx.refresh();
        Foo foo = ctx.getBean(Foo.class);
        Boo boo = ctx.getBean(Boo.class);
        Zoo zoo = ctx.getBean(Zoo.class);
        System.out.println("foo.p1 = " + foo.getP1());
        System.out.println("foo.p2() = " + foo.getP2());
        System.out.println("boo.ppp() = " + boo.getPpp());
        System.out.println("zoo.getQwerty() = " + zoo.getQwerty());
        boo.displayProps();
    }
}
