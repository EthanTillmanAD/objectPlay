State is an objects instance variable, attribute(object KNOWS)
methods are the behavior(object CAN DO)

classes are blueprints for an object

/* public class Dog {

    public String name;
    public int age;


    public void makeSound(){
    System.out.println("Woof Woof")
    }

public static void main(String[] args){

       Dog dog = new Dog();
~Declare^^  link^   ^^^reference~

            vv ~Reassigns object variable~
dog.name = "Sparky";
^^^^^
~grabs the String in Dog class file~

dog.makeSound();
~Prints out Woof Woof~

    }
}*/

~assign Dog object into an array~
Dog dog1 = new Dog();
dog1.name = "jerry";
Dog[] myDogs = new Dog[5];

myDogs[0] = dog1;
myDogs[1] = new Dog();

methods can go into other methods

private makes ony accessible through the same class
public makes it public accessible to all

array elements can be linked traits
such as adding in a size method

public int petSize(int size){
return size
}

myDogs[0].petSize(20);




