package DesignMode;


public class AbstractFactory {
    interface food{}

    class A implements food{}
    class B implements food{}

    interface product {
        food get();
    }

    class FactoryForA implements product{
        @Override
        public food get() {
            return new A();
        }
    }

    class FactoryForB implements product{
        @Override
        public food get() {
            return new B();
        }
    }
//    抽象工厂的灵活性就体现在这里，无需改动原有的代码，毕竟对于客户端来说，静态工厂模式在不改动StaticFactory类的代码时无法新增产品，如果采用了抽象工厂模式，就可以轻松的新增拓展类。
    public class NewAbstractFactory{
        public void ClientCode(){
            food x = new FactoryForA().get();

            x = new FactoryForB().get();
        }
    }
}
