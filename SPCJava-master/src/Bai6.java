/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Tinh DT va Chu vi HCN");
        Scanner sc = new Scanner(System.in);
        double chieudai, chieurong, chuvi, dientich;
        System.out.print("Nhap chieu dai: ");
        chieudai=sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieurong=sc.nextDouble();
        chuvi = (chieudai + chieurong)*2;
        dientich=chieudai*chieurong;
        System.out.println("Chu vi la:"+ chuvi);
        System.out.println("Dien tich la:"+ dientich);
    }
}
