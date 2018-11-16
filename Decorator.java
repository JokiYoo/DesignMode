package DesignMode;
//装饰模式 给一个对象增加新的功能
interface Source{ void method();}
public class Decorator implements Source{
    private Source source;
    public void newMehode() {
        System.out.println("newMehode");
    }
    @Override
    public void method() {
        newMehode();
        source.method();
    }
}
