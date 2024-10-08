/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh quan ly cai ten");
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ho va ten: ");
        String hoten = sc.nextLine();
        
        System.out.print("Nhap nam sinh di bro: ");
        int namsinh = sc.nextInt();
        
        System.out.println("Chao ban" + hoten);
        int tuoi= 2024 - namsinh;
        System.out.println("Tuoi cua friend la "+tuoi);
    }
}
