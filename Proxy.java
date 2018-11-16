package DesignMode;

//这种模式可以对旧功能进行代理，用一个代理类调用原有的方法，且对产生的结果进行控制。
interface Source1{ void method();}
 class Oldclass implements Source1{
    @Override
    public void method() {
    }

    public void method1(){

    }
}

 class Proxy implements Source1{
    private Source1 source1 = new Oldclass();
    void doSomething(){}

    @Override
    public void method() {
        new Oldclass().method1();
        source1.method();
        new Proxy().doSomething();
        doSomething();
    }
}
