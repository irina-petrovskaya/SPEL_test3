package a.b.c;

import oracle.jrockit.jfr.StringConstantPool;
import org.springframework.beans.factory.annotation.Value;

/**
 * by Irina.Petrovskaya, on 02.12.11, 19:47
 */
public class Boo {
    @Value("#{new a.b.c.Qwerty()}")
    private Qwerty qwerty;
    @Value("#{new a.b.c.Qwerty().idStr}")
    private String qwertyProperty;
    @Value("#{new a.b.c.Qwerty().returnQweStr('foo',0)}")
    private String qwertyMethodCall;

    private String ppp;

    public void setPpp(String ppp) {
        this.ppp = ppp;
    }

    public String getPpp() {
        return ppp;
    }
}
