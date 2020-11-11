/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.javaarray;

import java.util.HashMap;

/**
 *
 * @author samit
 */
public class JavaHashMap {
    public static void main(String[] args) {
        
        // สร้างข้อมูลแบบ HashMap
        HashMap<String, String> country = new HashMap<>();
        
        // การเพิ่มสมาชิกเข้าไปใน HashMap
        country.put("th", "Thailand");
        country.put("jp","Japan");
        country.put("de","German");
        
        // นับจำนวนสมาชิกของ HashMap
        System.out.println(country.size());
        
        // อ่านสมาชิกของ HashMap
        System.out.println(country.get("jp"));
        
        System.out.println("------------loop hashmap-----------------");
        
        // การ loop อ่านสมาชิกทั้งหมด
        for(HashMap.Entry<String,String> data: country.entrySet()){
            System.out.println(data.getKey() + "=" + data.getValue());
        }
        
    }
}
