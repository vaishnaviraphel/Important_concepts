package Java_practice2;
import java.util.Scanner;
public class mod {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i;
        System.out.print("Enter first number: ");
        int x = a.nextInt();
        System.out.print("Enter second number: ");
        int y = a.nextInt();
        System.out.print("Enter third number: ");
        int z = a.nextInt();
        System.out.println(mod1(x,y,z));
    }
    static int mod1(int x,int y, int z){
            if (x%z == 0){
                return (y/z-x/z+1);
            }
            else{
                return (y/z-x/z);
            }
    }
}
