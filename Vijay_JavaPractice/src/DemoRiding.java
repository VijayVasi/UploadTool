//package com.qspiders.pack1;

class DemoRiding
{
    void print()
    {
      System.out.println("print() with no arguments");
     }

   String print(int i)
   {
      System.out.println("print() with string arguments");
      return "Success";
   }

   String print(int i,int j)
   {
      System.out.println("print() with 2 int arguments");
      return "Success1";
   }

   String print(long m,long n)
   {
      System.out.println("print() with 2 long arguments");
      return "Success2";
    }

    String print(int i,String s)
    {
       System.out.println("print() with 1 int and 1 string args");
       return "Success3";
     }

   String print(String s, int i)
   {
      System.out.println("print() sequence is changed");
      return "Success4";
    }


  public static void main(String...args)
  {
    String res;
    DemoRiding d = new DemoRiding();

     d.print();

    res = d.print(100);
     System.out.println(res);

    res = d.print(200,300);
      System.out.println(res);

    res = d.print(500l,600l);
      System.out.println(res);
     
    res = d.print(10,"hello");
      System.out.println(res);

    res =d.print("anu", 20);
     System.out.println(res);
   }

}    