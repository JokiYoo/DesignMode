package DesignMode;
//懒汉模式
public class LazySingle {
    private static LazySingle newinstance = null;

    private LazySingle(){}

    public static LazySingle getInstance(){
        if(newinstance == null){
            newinstance = new LazySingle();
        }
        return newinstance;
    }
}

//懒汉模式加锁

class LazySingle1{
    private  static  LazySingle1 newinstance = null;

    private LazySingle1(){};

    public static LazySingle1 getNewinstance(){
        if(newinstance == null){
            synchronized (LazySingle1.class){
                if (newinstance == null) newinstance = new LazySingle1();
            }
        }
        return newinstance;
    }

}

//饿汉模式

class HungrySingle1{
    private final static  HungrySingle1 newinstance = new HungrySingle1();

    private HungrySingle1(){}


    public static HungrySingle1 getNewinstance(){
        return newinstance;
    }


}
