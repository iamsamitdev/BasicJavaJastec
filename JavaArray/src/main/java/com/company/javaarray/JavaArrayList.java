/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.javaarray;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author samit
 */
public class JavaArrayList {
    public static void main(String[] args) {
        
        // ตัวอย่างการสร้าง ArrayList
        ArrayList myList = new ArrayList();
        // ตัวอย่าง ArrayList แบบกำหนด Type
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        
        // การเพิ่มสมาชิกเข้า ArrayList
        myList.add("Samit");
        myList.add(35);
        myList.add(18500.50);
        myList.add(true);
        
        myNumber.add(25);
        myNumber.add(75);
        myNumber.add(15);
        myNumber.add(65);
        
        // การอ่านข้อมูลจาก ArrayList
        System.out.println(myList);
        
        // การ loop อ่านสมาชิกจาก ArrayList
        for(Object data: myList){
            System.out.println(data);
        }
        
        System.out.println("--------------Sorting-----------------");
//        Collections.reverse(myNumber);
        Collections.sort(myNumber); // น้อยไปมาก
        Collections.sort(myNumber, Collections.reverseOrder()); // มากไปน้อย
        for(Object data: myNumber){
            System.out.println(data);
        }
        
        System.out.println("--------------Min/Max-----------------");
        // การหาค่าสูงสุด (max) และต่ำสุด
        System.out.println(Collections.max(myNumber));
        System.out.println(Collections.min(myNumber));
        
       System.out.println("--------------Remove-----------------");
       // การลบสมาชิกที่ต้องการ
       myNumber.remove(1);
       myNumber.remove("25"); // ต้องเป็น String ถึงจะดึงค่าออกได้
       myNumber.remove(Integer.valueOf(25)); // ดึงข้อมูลตัวเลขได้
       System.out.println(myNumber);
       
    }
}
