package Other;
import java.util.*;

public class Factorial {
    public static int calculate_fac(int num){
        return (num <= 1  ? num : num*calculate_fac(num-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = calculate_fac(num);
        System.out.println(fac);
    }
}
