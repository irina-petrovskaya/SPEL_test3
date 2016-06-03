package a.b.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/3/2016.
 * Project: testColors
 * *******************************
 */
@Component
public class Compo1 {
    @Value("#{@compo2.CONST1}")
    String prop1;
    @Value("#{@compo2.f2}")
    String prop2;
    @Value("#{@compo2.p1}")
    String prop3;
    @Value("#{new a.b.c.Compo2().CONST1}")
    String prop4;
    @Value("#{T(a.b.c.Compo2).m3(new a.b.c.Compo2().f2)}")
    String prop5;

    public void displayProps(){
        System.out.println(prop1+" "+prop2+" "+prop3+" "+prop4+" "+prop5);
    }
}
