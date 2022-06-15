package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Integer,City> hashMap=new HashMap();
        hashMap.put(1,new City(103,"Batken"));
        hashMap.put(2,new City(104,"Jalal-Abad"));
        hashMap.put(3,new City(101,"Bishkek"));
        hashMap.put(4,new City(102,"Osh"));
        hashMap.put(5,new City(105,"Naryn"));
        hashMap.put(6,new City(106,"Osh obl"));
        hashMap.put(7,new City(107,"Talashash"));
        hashMap.put(9,new City(108,"Chuy"));
        hashMap.put(8,new City(109,"Isyk-Kul"));

        Set<Integer>set=new TreeSet<>(Comparator.reverseOrder());
        for (City city :hashMap.values()) {
            if (city.getCode()%2==1){
                set.add(city.getCode());
            }else{
                System.out.println(city);
            }
        }
        System.out.println("___________________________\n\"Odd numbers here: \"");
        for (Integer in :set) {
            System.out.println(in);
        }
    }
}
