package com.dicoding.javafundamental.array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        char[][] arrChar = new char[3][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // Dimesi 1 panjeng elemen 2
        arrChar[0][0] = 'X';
        arrChar[0][1] = 'Y';

        arrChar[1][0] = 'A';
        arrChar[1][1] = 'B';
        arrChar[1][2] = 'C';

         // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
         System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
         System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
         // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
         System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
         System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
         System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);

         System.out.println("Arraynya "+ arrChar);

    }
}
