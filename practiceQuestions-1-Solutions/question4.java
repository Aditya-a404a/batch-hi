import java.util.*;

public class question4 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a+b>c && b+c>a && c+a>b)
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("InValid");
        }
        sc.close();
    }
}
