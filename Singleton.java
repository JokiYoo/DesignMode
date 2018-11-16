package DesignMode;

public class Singleton {
    private Singleton(){}

    public static class SingletonBuilder{
        public static Singleton value = new Singleton();
    }
//    在内部创建一个实例，构造器全部设置为private，所有方法均在该实例上改动，在创建上要注意类的实例化只能执行一次
    public Singleton getInstance(){
        return  SingletonBuilder.value;
    }
}
