import java.util.Scanner;
public class Main8
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int tab = num.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(tab+" * "+i+" = "+(tab*i));
        }
    }
}