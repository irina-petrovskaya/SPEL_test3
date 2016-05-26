package a.b.c;

import java.util.List;

/**
 * by Irina.Petrovskaya, on 02.12.11, 19:49
 */
public class Zoo {
    public static String QWERTY = "QWERTY";
    private String zooString;
    private List list;
    private String qwerty;

    /**
     * @param zooStr
     */
    public void setZooStr(String zooStr) {
        this.zooString = zooStr;
    }

    /**
     * @return boo
     */
    public String getZooStr() {
        return zooString;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public void setQwerty(String qwerty) {
        this.qwerty = qwerty;
    }

    public String getQwerty() {
        return qwerty;
    }
}
