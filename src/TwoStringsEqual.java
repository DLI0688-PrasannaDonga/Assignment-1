import java.util.Scanner;

public class TwoStringsEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Both Strings are equal");
        }
        else{
            System.out.println("Both Strings are not equal");
        }
    }
}
