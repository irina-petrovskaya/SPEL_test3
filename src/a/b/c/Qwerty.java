package a.b.c;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/25/2016.
 * Project: test3
 * *******************************
 */
public class Qwerty {
    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @Value("aaa")
    String idStr;
    @Value("0")
    int num;

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
    public int returnListSize(List list){
        return list.size();
    }
}
