/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai14_TinhCanChi {
    public static void main(String[] args) {
                    System.out.println("chuong trinh tinh can chi nam");
            Scanner sc= new Scanner(System.in);
            System.out.println("nhap nam:");
            int nam=sc.nextInt();
           String can=tinhCan(nam);
           String chi=tinhChi(nam);
            System.out.println("Năm " + nam + " là: " + can + " " + chi);
    }
    
       public static String tinhCan(int nam){
        String can = "";
            switch (nam % 10) {
        case 0: 
            can="Canh"; 
            break;
        case 1: 
            can="Tân"; 
            break;
        case 2: 
            can="Nhâm"; 
            break;
        case 3: 
            can="Quý"; 
            break;
        case 4: 
            can="Giáp"; 
            break;
        case 5: 
            can="Ất"; 
            break;
        case 6: 
            can="Bính"; 
            break;
        case 7: 
            can="Đinh"; 
            break;
        case 8: 
            can="Mậu"; 
            break;
        case 9: 
            can="Kỷ"; 
            break;
           }
            
            return can;
       }
          
       
     public static String tinhChi(int nam){
        String chi = "";
    
            switch(nam % 12) {
        case 0: 
           chi="Tý"; 
            break;
        case 1: 
            chi="Sửu"; 
            break;
        case 2: 
            chi="Dần"; 
            break;
        case 3: 
            chi="Mão"; 
            break;
        case 4: 
            chi="Thìn"; 
            break;
        case 5: 
            chi="Tỵ"; 
            break;
        case 6: 
            chi="Ngọ"; 
            break;
        case 7: 
            chi="Mùi"; 
            break;
        case 8: 
            chi="Thân"; 
            break;
        case 9: 
            chi="Dậu"; 
            break;
        case 10: 
            chi="tuất"; 
            break;
        case 11: 
            chi="Hợi"; 
            break;
        
            }
 return chi;
     }
}
