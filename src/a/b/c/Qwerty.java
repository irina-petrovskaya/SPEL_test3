package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/25/2016.
 * Project: test3
 * *******************************
 */
public class Qwerty {
    String idStr = "";

    int num = 0;

    public Qwerty(String idStr, int num) {
        this.idStr = idStr;
        this.num = num;
    }

    public Qwerty(String idStr) {
        this.idStr = idStr;
    }
    public String returnQweStr(String arg1, int arg2){
        return idStr +arg1+arg2;
    }
}
