package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader_1 = new BufferedReader(new FileReader("1.txt"));
        String s_1 = bufferedReader_1.readLine().trim();
        while (s_1 != null){
            BufferedReader bufferedReader_2 = new BufferedReader(new FileReader("21.txt"));
            String s_2 = bufferedReader_2.readLine().trim();
            boolean check = false;
            while (s_2 != null){
                if(s_1.equals(s_2)){
                    check = true;
                    break;
                }
                s_2 = bufferedReader_2.readLine().trim();
            }
            if(check = false){
                System.out.println(s_1);
            }
        }
    }
}
