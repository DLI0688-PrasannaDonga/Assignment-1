import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
         int m=(int)Math.pow(2,i);
            System.out.println(m);
        }
    }
}
