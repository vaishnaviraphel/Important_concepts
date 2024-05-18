package Java_practice2;

public class Person_calling {
    public static void main(String[] args) {
        System.out.print("Hello ");
        Person p1 = new Person();   // calling the person class. p1 is person class's reference and new person is object.
        p1.name = "Bebo";
        System.out.println(p1.name);
        Person p2 = new Person();
        p2.name = "Chicko";
        System.out.println(p2.name);
        Person Kanika = null;
        //kanika.name = "Knika"; this, we cant use because we haven't created object of Kanika class.

        p1.eat("Pizza");
        System.out.println(p1.eat("Pizza"));
    }
}
