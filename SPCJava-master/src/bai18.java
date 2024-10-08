/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apcjava;
/**
 * 
 *
 * @author Administrator
 */
import java.util.ArrayList;
public class bai18 {
    public static void main(String[] args) {
        System.out.println("chuong trinh  ArrayList");
        ArrayList ds = new ArrayList();
        ArrayList b = new ArrayList();
        for ( int i = 1; i < 10; i++)
        {
        ds.add(i);  
        }
        ds.add("Duy");
        ds.remove(3);
        ds.removeLast();
        ds.removeFirst();
        for (int i = 0; i < ds.size(); i++){
        System.out.print(ds.get(i)+" ");
        }
    }
}
   
