/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai4_TinhTinhThuong {
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so a:");
        int a = sc.nextInt();
        System.out.print("Nhap so b:");
        int b = sc.nextInt();
        int hieu = a - b;
        System.out.println(a + "-"+b+"="+ hieu);
        System.out.println(a + "-"+b+"="+ hieu(a,b));
        int tong = a + b;
        System.out.println(a + "+"+b+"="+ tong);
        System.out.println(a + "+"+b+"="+ tong(a,b));
        double thuong = (double)a / b;
        System.out.println(a + ":"+b+"="+ thuong);
        System.out.println(a + ":"+b+"="+ thuong(a,b));
        int tich = a *b;
        System.out.println(a + "*"+b+"="+ tich);
        System.out.println(a + "*"+b+"="+ tich(a,b));
        
    }
    private static int tong(int a, int b)
    {
    return a + b;
    }
     private static int hieu (int a, int b)
    {
    return a - b;
    }
      private static int tich(int a, int b)
    {
    return a * b;
    }
       private static String thuong(int a, int b)
       {
       if (b==0){
       return "Khong the chia cho O";
       } else
       {
       return Double.toString((double)a/b);
       }
       }
}
       
