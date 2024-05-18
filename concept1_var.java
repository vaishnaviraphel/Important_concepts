package Java_practice2;

public class concept1_var {
    String name;
    int age;

    void person(){
        String last_name;
        //System.out.println(last_name);
    }

    public static void main(String[] args) {
        concept1_var var = new concept1_var();
        System.out.println(var.name);
    }
}

// *********** Local Variable must have some value otherwise it gives error while Instance Variable gives value
// without assigning any value.
// For example, last_name must have some valued and name doesn't require any value.