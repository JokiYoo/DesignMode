package DesignMode;
// 饿汉模式
public class HungrySingle {
    public static final HungrySingle newInstance = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){
        return newInstance;
    }
}
