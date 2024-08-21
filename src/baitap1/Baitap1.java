package baitap1;
import java.util.Scanner;
public class Baitap1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        System.out.println("Tong 2 so a va b la: " + (a+b));
        System.out.println("Hieu 2 so a va b la: " + (a-b));
        System.out.println("Tich 2 so a va b la: " + a*b);
        if(b!=0){
            System.out.println("thuong cua 2 so a va b la: "+ a/b);
        }else {
            System.out.println("khong the chia cho so 0");
        }
        if(b!=0){
            System.out.println("thuong cua 2 so a va b la: "+ a%b);
        }else {
            System.out.println("khong the chia cho so 0");
        }    
    }  
}
