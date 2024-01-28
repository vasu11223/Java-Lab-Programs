public class Animal 
 {
  public void eat()
   {
    System.out.println("I can eat");
  }
  public void sound()
  {
    System.out.println("I can make a sound");
  }
}
class Dog extends Animal 
{
   public void sound() 
   {
    System.out.println("Bow Bow....");
   }
}
class Cat extends Animal
{
    public void sound()
    {
      System.out.println("sound....");
    }
}
class Tiger extends Animal
{
    public void sound()
    {
      System.out.println("Roaring.....");
    }
}
class Mainclass
 {
  public static void main(String[] args)
   {
    Animal a=new Animal();
    a.eat();
    a.sound();
    System.out.println("................");
    Dog d=new Dog();
    a.eat();
    d.sound();
    System.out.println("................");
    Cat c=new Cat();
    a.eat();
    c.sound();
    System.out.println("................");
    Tiger t=new Tiger();
    a.eat();
    t.sound();
    System.out.println("................");
   }
  }
