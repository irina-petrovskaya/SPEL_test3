package a.b.c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/3/2016.
 * Project: testColors
 * *******************************
 */
@Component
public class Compo2 {
    public final static String CONST1 = "compo2const1";
    private final static String CONST2 = "compo2const2";
    static String CONST3 = "compo2const3";
    private String f1 = "f1";
    public String f2 = "f2";
    protected String f3 = "f3";
    String f4 = "f4";

    @Value("p1")
    private String p1;

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String m1(String arg1) {
        return "1" + " " + arg1;
    }
    public static String m3(String arg1) {
        return "1" + " " + arg1;
    }
    private String m2(String arg1) {
        return "1" + " " + arg1;
    }
}
