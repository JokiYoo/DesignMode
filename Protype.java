package DesignMode;
//原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
public class Protype implements Cloneable{
    String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    protected Object clone(){
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        finally {
            return null;
        }
    }
    public static void main (String [] args){
        Protype p = new Protype();
        Protype p1 = (Protype)p.clone();
    }
}
