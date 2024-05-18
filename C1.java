
// *******Only one constructor can be created, but we can call 2 time as we want to.*********
package Java_practice2;

public class C1 {
    int a;
    String date;
    String name;

    public C1(String date, int a, String name) {
        this.date = date;
        this.a = a;
        this.name = name;
        System.out.println(date +"\t"+ a +"\t"+ name);
    }


    //Constructor (Default)  only one constructor can be created.
    C1(){
        System.out.println("This will print everytime whenever you call C1 class");
        date = "31 march";
    }
// This is normal method.
//    void C1(){
//        System.out.println("Not a constructor");
//    }

    //Parameterized Constructor
    C1(String Given_name){
        System.out.println("This is Parameterized Constructor");
        this.name = Given_name;
    }
}