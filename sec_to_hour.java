package Java_practice2;
import java.util.Scanner;
public class sec_to_hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add the seconds: ");
        int sec = sc.nextInt();
        int m = sec/60;
        int h = m/60;
        System.out.println(m);
        System.out.println(h);
    }
}
