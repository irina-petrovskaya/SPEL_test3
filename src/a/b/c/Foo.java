package a.b.c;

import org.springframework.beans.factory.annotation.Value;

/**
 * by Irina.Petrovskaya, on 02.12.11, 19:46
 */
public class Foo {
    
    public static String PP2 = "pp2";
    int p1;
    String p2;

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
    
    public String returnString(){
        return "foo";
    }

    public String returnFooString(String arg){
        return arg;
    }
}
