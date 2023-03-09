import java.io.*;
import java.util.Scanner;
class lab2task2 {

    public static String GetString(){
        String string;
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
       return string;
    }

    public static void main (String [] args) throws IOException
    {

        double celsius;
        System.out.print("Input Temperature in Farinheight!");
double fahrenheit = Double.parseDouble(GetString());

        celsius = (fahrenheit - 32)*5.0/9.0;
        System.out.println(fahrenheit +" by Farinheight");
        System.out.println(celsius + " by Celsius");
    }}