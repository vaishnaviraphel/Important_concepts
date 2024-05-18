package Java_practice2;

public class Super {
    public static void main(String[] args) {
        Car c = new Car();
//        c.display();
//        c.message();
    }
}


class Car extends Vehicle {
    int max_speed = 180;
    Car(){
        System.out.println("Car's DC");
       super(22);
    }
    Car(int b){
        System.out.println(b);
    }
    void display(){
        System.out.println("Max speed of car is: "+this.max_speed);
        System.out.println("Max speed of Vehicle is: "+super.max_speed);
        super.display();
    }
    void message(){
        this.display();
    }
}



class Vehicle{
    int max_speed = 100;

    Vehicle(){
        System.out.println("Vehicle's DC");
    }

    Vehicle(int a){
        System.out.println(a);
    }

    void message(){
        System.out.println("This is Vehicle class");
    }
    void display(){
        System.out.println("Vehicle's display method");
    }
}

// Constructor gets called by itself, we don't have to use super keyword.
// While to call (variables)attributes and (functions)method, we have to use super keyword.