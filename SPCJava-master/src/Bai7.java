/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai7 {
    public static void main(String[] args) {
        System.out.println("Tinh hinh tron");
        Scanner sc = new Scanner(System.in);
        double bankinh, duongkinh, chuvi, dientich;
        System.out.print("Nhap ban kinh:");
        bankinh = sc.nextDouble();
        duongkinh = bankinh * 2; 
        chuvi=duongkinh * 3.14;
        dientich=bankinh*bankinh*3.14;
        System.out.println("Duong kinh la:"+duongkinh);
        System.out.println("Chu vi la:"+chuvi);
        System.out.println("Dien tich la:"+dientich);
        
    }
}
