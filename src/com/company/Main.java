package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader_1 = new BufferedReader(new FileReader("1.txt"));
        String s_1 = bufferedReader_1.readLine().trim();
        while (s_1 != null){
            BufferedReader bufferedReader_2 = new BufferedReader(new FileReader("2.txt"));
            String s_2 = bufferedReader_2.readLine();
            boolean check = false;
            while (s_2 != null){
                if(s_1.trim().equals(s_2.trim())){
                    check = true;
                    break;
                }
                s_2 = bufferedReader_2.readLine();
            }
            if(!check){
                System.out.println(s_1);
            }
            s_1 = bufferedReader_1.readLine();
        }
    }
}
