# Object Oriented Programming | P2
In this subject we will study Object Oriented Programming. This subject is from the Computer Science course at the Federal University of Alagoas. The course will be taught by professor Mário Hozano.
<p align="center">
  <img src="https://user-images.githubusercontent.com/91018438/204195385-acc6fcd4-05a7-4f25-87d1-cb7d5cc5c852.png" alt="animated" />
</p>

# OOP Fundamentals
OOP is a powerful paradigm that has become the dominant approach in modern software development. Its foundations are based on Inheritance, Polymorphism, Encapsulation and Abstraction. To do this, we will use the Java programming language.
 * Java JDK

## Inheritance
This OOP's principle allows us do not copy much of code and use different variables for example in our another classes which extends from this (parent) class. Imagine inheriting traits from your parents. Similarly, in OOP, objects can inherit data and behavior from other objects, known as their parent class. This reduces code duplication and simplifies development. Look example below:
```
class Human{
    int ages;
    int height;
}

class Dentist extends Human{
  clearTeeth(){
    //some code here
  }
}

class Programmer extends Human{
  public void makeProgram(){
    //some code here
  }
}
```
In this case we have too variables in our common class `Human`. But we can use this variables in our extended classes (`Dentist` and `Programmer`) and do not repeat yourself. 
______________________________________________________________________________________________________________________
## Encapsulation
By simple words *encapsulation* is hiding from outside world our structure, methods and so on of our program. Very good example is a car. We can sit inside and drive to destination we want, but you don't know how car actually do it. You just press gas and car is moving, but back-end-side of this pedal is hidden for you. Encapsulation: This means the data and behavior of an object are bundled together and protected from outside interference. You can only access them through the object's defined methods. This promotes data security and integrity.

In JAVA we use `public`,`private` and `protected` access modifiers. But if we don't use any of this modifiers it means that program will use `default` modifier.
Some examples here:
#### private
```
class Bullshit{
    private int love;
}
```
This example means that we can use `love` variable only on class' body. We can't get the value of this variable somewhere outside of this class (even from subclasses).
#### public
```
class Bullshit{
    public int love;
}
```
This example means that we can use `love` from any place of our program we want. 
#### no modifier (package-private)
```
class Bullshit{
    int love;
}
```
In this case we don't use any modifier so it's default and we can use this variable only on package level. For example if we will have another class inside of the same package as class `Bullshit`, we could use this variable. But if subclass of Bullshit class will be located in another package we couldn't use this variable.
#### protected
`protected` very similar with previous (package-level) modifier but we can use `love` variable in subclasses as well. 
______________________________________________________________________________________________________________________
## Polymorphism
Polymorphism means that objects with the same specification could have different realization. What does it mean? This allows objects of different types to respond to the same message in different ways. For example, you could send a "print" message to both a car and a document, but each would print their specific information in their own way. This adds flexibility and adaptability to your code
Let's lool to example below:
```
class Doc{
    public void treat(){
    
    }
}
class Dentist extends Doc{
    @Override
    public void treat(){
        //Código sobre seu dente
    }
}
class Surgeon extends Doc{
    @Override
    public void treat(){
        //code here
    }
}
```
Polymorphism means thet we will use the same method (`treat`), but in different moments it will do different things we need, because of overriding.
## Abstraction
Abstraction means look at the main traits of any objects. 
In example below we use most common traits of any human (not actually all, but doesn't matter). It's abstraction. We can describe by this variables any person.
```
class Human{
    int ages;
    int height;
    int name;
}
```
but we can describe behaviour any specifically person by using interfaces
```
interface Sportsman{
    public void running();
    public void showerAfterRunning();
}
```
