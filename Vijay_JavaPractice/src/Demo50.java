// demo for method overriding

class Animal
{
   void speak()
   {
     System.out.println("animal speaking");
   }
}

class Mammal extends Animal
{
   void speak()
   {
      System.out.println("Mammal Speaking");
   }
}

class Dog extends Mammal
{
   void speak()
   {
     System.out.println("bowbow");
    }
}

class Demo50
{
    public static void main(String args[])
    {
      Animal a = new Animal();
             a.speak();

      Mammal m = new Mammal();
          m.speak();
     
     Dog d = new Dog();
           d.speak();
   }
} 