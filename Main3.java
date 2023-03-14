import java.util.Scanner;
public class Main3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a number(string):");
        String str = in.nextLine();
        int res = Integer.parseInt(str);
        System.out.printf("Integer value:%d",res);
        System.out.printf("\n");
    }
}