package com.mit;
//it's  a string buffer file
public class stringbuffer {
    public static void main(String[] args) {
    append();
    insert();
    replace();
    reverse();
    delete();
    capacity();
    }
    public  static  void append(){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Mit");
        System.out.println(sb);
    }
    public static void insert(){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(1,"Mit");
        System.out.println(sb);
    }
    public  static  void replace(){
        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,3,"Mit");
        System.out.println(sb);
    }
    public static void  delete(){
        StringBuffer sb=new StringBuffer("Hello");
        sb.delete(1,3);
        System.out.println(sb);
    }
    public static void reverse(){
        StringBuffer sb=new StringBuffer("MIT");
        sb.reverse();
        System.out.println(sb);
    }
    public static void capacity() {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("MIT");
        System.out.println(sb.capacity());//now 16
        sb.append("I LIKE KABADDI");
        System.out.println(sb.capacity());
    }
}
