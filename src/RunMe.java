import a.b.c.Boo;
import a.b.c.Foo;
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
        System.out.println("foo.p1 = " + foo.getP1());
        System.out.println("foo.p2() = " + foo.getP2());
        System.out.println("boo.ppp() = " + boo.getPpp());
    }
}
