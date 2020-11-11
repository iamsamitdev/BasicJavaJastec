/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.javaarray;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author samit
 */
public class JavaArray {

    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        System.err.println("Test error");

        // ตัวอย่างการสร้างตัวแปร array
        int number[] = {2, 8, 7, 18, 22, 9, 10};
        String names[] = {"John", "Joe", "Jack", "Jane"};

        // การอ่านสมาชิกของ array ออกมาแสดง
        System.out.println(number[4]);
        System.out.println(names[2]);

        System.out.println("------------for loop------------------");

        // การวน loop เพื่ออ่านสมาชิกทั้งหมดของ array
        // ใช้ฟังก์ชัน for
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        System.out.println("-------------for loop-----------------");

        for (int row = 0; row < names.length; row++) {
            System.out.println(names[row]);
        }

        System.out.println("-------------for each-----------------");
        // ใช้ฟังก์ชัน foreach
        for (int data : number) {
            System.out.println(data);
        }

        // เปลี่ยนค่าสมาชิกของ array
        names[2] = "Jin";

        for (String data : names) {
            System.out.println(data);
        }

        System.out.println("-------------Array Sorting-----------------");
        // การจัดเรียงข้อมูลสมาชิกของ array
        Arrays.sort(number); // เรียงจากน้อยไปมาก
        for (int data : number) {
            System.out.println(data);
        }
        System.out.println("---------------------------------");
        String fullname[] = {"Joe", "Lisa", "Alina", "Marai"};
        String thainame[] = {"วิชัย", "กีรติ", "อภิวุธ", "วินัย", "โอภาส", "ขนิษฐา"};

//        Arrays.sort(fullname);
        Arrays.sort(fullname, Collections.reverseOrder());
        for (String data : fullname) {
            System.out.println(data);
        }

        System.out.println("---------------------------------");

//        Arrays.sort(thainame);
        Arrays.sort(thainame, Collections.reverseOrder());
        for (String data : thainame) {
            System.out.println(data);
        }

    }

}
