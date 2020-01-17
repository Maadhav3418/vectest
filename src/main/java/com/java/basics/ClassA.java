package com.java.basics;

public class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }

    public interface InterfaceB 
    {
        public void show();
    }
    public interface InterfaceC 
    {
        public void show();
    }
public static  class ClassD extends ClassA implements InterfaceB,InterfaceC
{
    public void show()
    {
        System.out.println("show() method implementation");
    }
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
}
public static void main(String args[])
    {
        ClassD d = new ClassD();
        d.dispD();
        d.show();
    }
}


