package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SearchUnique.search("1.txt", "2.txt", "Есть в файле 1, нет в файле 2.txt");
        SearchUnique.search("2.txt", "1.txt", "Есть в файле 2, нет в файле 1.txt");
    }
}
