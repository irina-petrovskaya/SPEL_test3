package a.b.c;

import oracle.jrockit.jfr.StringConstantPool;
import org.springframework.beans.factory.annotation.Value;

/**
 * by Irina.Petrovskaya, on 02.12.11, 19:47
 */
public class Boo {
    @Value("#{new a.b.c.Qwerty('qwe')}")
    private Qwerty qwerty;
    @Value("#{new a.b.c.Qwerty('qwe').idStr}")
    private String qwertyProperty;
    @Value("#{new a.b.c.Qwerty('qwe',1).returnQweStr('foo',0)}")
    private String qwertyMethodCall;
    @Value("#{new a.b.c.Qwerty('qwe').returnListSize({T(a.b.c.Foo).PP2, T(a.b.c.Zoo).QWERTY, new java.lang.String('aaa')})}")
    private int listsize1;
    @Value("#{qwerty.returnListSize(new java.util.ArrayList({'aaa','bbb'}))}")
    private int listsize2;
    @Value("#{new a.b.c.DummyFactory().getDummy(T(java.lang.String))}")
    private Dummy<String> dummyType1;

    private String ppp;

    public void setPpp(String ppp) {
        this.ppp = ppp;
    }

    public String getPpp() {
        return ppp;
    }

    public void displayProps(){
        System.out.println(qwerty);
        System.out.println(qwertyProperty);
        System.out.println(qwertyMethodCall);
        System.out.println(listsize1);
        System.out.println(listsize2);
        System.out.println(dummyType1);
    }
}
