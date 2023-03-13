package com.dicoding.javafundamental.percabangan;

public class IfThenElseThenElse {
    public static void main(String[] args) {
        int skor = 80;
        char nilai;
        double indeksPrestasi;
        if (skor >= 90) {
            nilai = 'A';
            indeksPrestasi = 4.0;
        } else if (skor >= 80) {
            nilai = 'B';
            indeksPrestasi = 3.5;
        } else if (skor >=70) {
            nilai = 'C';
            indeksPrestasi = 3.0;
        } else if (skor >= 60) {
            nilai = 'D';
            indeksPrestasi = 2.5;
        } else if (skor >= 50) {
            nilai =  'E';
            indeksPrestasi = 2.0;
        } else {
            nilai = 'F';
            indeksPrestasi = 1.5;
        } 

        System.out.println("Nilai ujian akhir adalah "+nilai);
        System.out.println("Dengan Indeks Prestasi "+indeksPrestasi);
    }
}
