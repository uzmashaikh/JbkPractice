package com.jbk.myapp.constructor;

class A
{
    A()
   {
         System.out.println("In the class A() constructor");
   }
    
   static
   {
           System.out.println("In the static block");
   }
   {
            System.out.println("In the non-static block");
   } 
   {
	   System.out.println("sfSF");
   }
      public static void main(String args[])
     {
                         A a=new A();
     }

}