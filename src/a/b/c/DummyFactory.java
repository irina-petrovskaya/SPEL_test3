package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/26/2016.
 * Project: test3
 * *******************************
 */
public class DummyFactory<T> {
    public Dummy<T> getDummy(Class<T> cls){
        Dummy<T> dummy = new Dummy<>(cls);
        return dummy;
    }

}
