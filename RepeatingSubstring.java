import java.util.*;
public class RepeatingSubstring {

    public static String getString(String str){
        int len = str.length();

        for(int i=1; i<=len/2; i++){
            if(len%i == 0){
                String subString = str.substring(0, i);
                StringBuilder concatString = new StringBuilder();
                for(int j=i; j<=len/i; j++){
                    concatString.append(subString);
                }
//                concatString.append(subString.repeat(len / i));

                if(str.contentEquals(concatString)){
                    return subString;
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String result = getString(str);
        System.out.println(result);
    }


}
