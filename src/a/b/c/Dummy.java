package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/26/2016.
 * Project: test3
 * *******************************
 */
public class Dummy<T> {
    private Class<T> type;

    public Dummy(Class<T> type) {
        this.type = type;
    }


    public Class<T> getType() {
        return type;
    }
    public void displayType(){
        System.out.println(getType().getCanonicalName());
    }
}
