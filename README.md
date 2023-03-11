# java-assignment-1
## 1. Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        System.out.println("sum:"+(num1+num2));
        System.out.println("mul:"+(num1*num2));
        System.out.println("sub:"+(num1-num2));
        System.out.println("div:"+(num1/num2));
        System.out.println("rem:"+(num1%num2));
    }
}
```
![image](https://user-images.githubusercontent.com/93427923/224473395-80feadf1-91f8-4ea5-ab0a-3b9018814fbc.png)

## 2. Write a Java program to compare two numbers
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if(num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 < num2)
        {
            System.out.println(num1 + " is less than " + num2);
        }
        else
        {
            System.out.println(num1 + " is equal to " + num2);
        }

    }
}
```
![image](https://user-images.githubusercontent.com/93427923/224473424-2a48c2a8-019c-4d01-95ba-4d2249b6a607.png)

## 3. Write a Java program to convert a string to an integer
```
import java.util.Scanner;
public class Main
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
```
![image](https://user-images.githubusercontent.com/93427923/224473450-85c29f2e-7833-4cbf-a2fc-338908d9ab4b.png)

## 4. Java Program to find area of rhombus
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Area of rhombus:"+((num1*num2)/2));
    }
}
```
![image](https://user-images.githubusercontent.com/93427923/224473465-2cb3e0d4-e898-4c84-a18c-276f6ba13b1b.png)

## 5. Write a Java program to find the number of days in a month
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        switch(str)
        {
            case "January":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28");
                break;
            case "March":
                System.out.println("31");
                break;
            case "April":
                System.out.println("30");
                break;
            case "May":
                System.out.println("31");
                break;
            case "June":
                System.out.println("30");
                break;
            case "July":
                System.out.println("31");
                break;
            case "August":
                System.out.println("31");
                break;
            case "September":
                System.out.println("30");
                break;
            case "October":
                System.out.println("31");
                break;
            case "November":
                System.out.println("30");
                break;
            case "December":
                System.out.println("31");
                break;
        }
    }
}
```
![image](https://user-images.githubusercontent.com/93427923/224473487-c587e2a0-3ec6-4736-b913-b182bcdb7c85.png)

## 6. Write a Java program to print the even numbers from 1 to 20
```
public class Main
{
    public static void main(String[] args)
    {
        int i;
        for(i=0;i<=20;i++)
        {
            System.out.print(+i+"\n");
            i+= 1;
        }
    }
}
```
![image](https://user-images.githubusercontent.com/93427923/224473507-7915116c-aa09-4120-91a9-056e8b0e982b.png)

## 7. Write a Java program to create a simple calculator
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int option = num.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("sum:" + (num1 + num2));
                break;
            case 2:
                System.out.println("mul:" + (num1 * num2));
                break;
            case 3:
                System.out.println("sub:" + (num1 - num2));
                break;
            case 4:
                System.out.println("div:" + (num1 / num2));
                break;
            case 5:
                System.out.println("rem:" + (num1 % num2));
                break;
        }
    }
}
```
![image](https://user-images.githubusercontent.com/93427923/224473615-44c31d8b-78ee-4400-b301-88df848f0eb4.png)
![image](https://user-images.githubusercontent.com/93427923/224473607-e26d5c9f-dbf8-4069-a9bb-e346fd27d89f.png)
![image](https://user-images.githubusercontent.com/93427923/224473635-7d0e944b-0f23-44c3-a9bd-2d6636e40d89.png)
![image](https://user-images.githubusercontent.com/93427923/224473676-b3caa9dd-3ed1-46e5-85e9-0652c8f0e637.png)
![image](https://user-images.githubusercontent.com/93427923/224473693-0127f1f7-4a92-42fe-bebb-0ed023ef48d4.png)

## 8. Write a Java program to print multiplication table of given number
```
import java.util.Scanner;
public class Main
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
```
![image](https://user-images.githubusercontent.com/93427923/224473740-bd9c8310-aedb-42ab-85a9-46f272c56358.png)



