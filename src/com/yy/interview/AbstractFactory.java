package com.yy.interview;
/**
 *抽象工厂模式
 * **/

interface foodabstract{}

class D implements foodabstract{}
class E implements foodabstract{}

interface produce{ foodabstract get();}
class FactoryForD implements produce{
    @Override
    public foodabstract get() {
        return new D();
    }
}
class FactoryForE implements produce{
    @Override
    public foodabstract get() {
        return new E();
    }
}

public class AbstractFactory {
    public void ClientCode(String name){
        foodabstract x= new FactoryForD().get();
        x = new FactoryForE().get();
    }
}
