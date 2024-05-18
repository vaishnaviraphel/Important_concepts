package Java_practice2;

public class C1_Calling {
    public static void main(String[] args) {
        C1 constructor = new C1();
        System.out.println(constructor.date);
        constructor.name = "Teachers";
        System.out.println(constructor.name);

        C1 constructor1 = new C1("Students");
        System.out.println(constructor1.name);

        C1 constructor2 = new C1("Principle");
        System.out.println(constructor2.name);

        C1 constructor3 = new C1("3 dec",23,"School");
    }
}
