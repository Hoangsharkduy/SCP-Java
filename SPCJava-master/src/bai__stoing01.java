/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai__stoing01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        String hovaten = sc.nextLine();
       //Hoang ngoc duy
        System.out.println("ho" + hovaten.substring(0,5));
        System.out.println("chu lot" + hovaten.substring(4,10));
        System.out.println("ten" + hovaten.substring(3,13));
        System.out.println(" ngoc: " + hovaten.substring(3,10));
        System.out.println(" duy: "+ hovaten.substring(3,13));
        System.out.println(" ho va ten" +  hovaten.toUpperCase());
        System.out.println("do dai"+ hovaten.length());
    }
}
