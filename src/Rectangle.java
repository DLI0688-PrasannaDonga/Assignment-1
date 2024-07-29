import java.util.Scanner;

public class Rectangle {
    int length;
    int field;
    public float area(){
        return length*field;
    }
    public float perimeter(){
        return (length+field)*2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle re = new Rectangle();
        re.length=sc.nextInt();
        re.field=sc.nextInt();
        System.out.println("Area "+re.area());
        System.out.println("Perimeter "+re.perimeter());

    }
}
