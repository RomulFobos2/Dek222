package com.company;

import java.io.*;

public class SearchUnique {
    public static void search(String file_standard, String file_compare, String file_out) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file_out));
        BufferedReader bufferedReader_standard = new BufferedReader(new FileReader(file_standard));
        String str_standard = bufferedReader_standard.readLine();
        while (str_standard != null){
            BufferedReader bufferedReader_compare = new BufferedReader(new FileReader(file_compare));
            String str_compare = bufferedReader_compare.readLine();
            boolean match = false;
            while (str_compare != null){
                if(str_standard.trim().equals(str_compare.trim())){
                    match = true;
                    break;
                }
                str_compare = bufferedReader_compare.readLine();
            }
            if(!match){
                writer.write(str_standard + "\n");
            }
            bufferedReader_compare.close();
            str_standard = bufferedReader_standard.readLine();
        }
        bufferedReader_standard.close();
        writer.close();
    }
}
