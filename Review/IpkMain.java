/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1_KPLBO_Review;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class IpkMain {

    public static void main(String[] args) {
        int min = 0;
        int max = 4;

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int counterData = 0;
        int counterLulus = 0;
        double sumIpk = 0;

        CalculatorIPK ipk = new CalculatorIPK();
        while (x != -999) {
            if (ipk.isWithinRange(x, min, max)) {
                counterData++;
                sumIpk = sumIpk + x;
                if (ipk.isLulus()) {
                    counterLulus++;
                }
            }
            x = sc.nextDouble();
        }

        if (counterData > 0) {
            System.out.println("Banyak mahasiswa : " + counterData);
            System.out.println("Banyak lulus : " + counterLulus);
            System.out.println("Banyak yang tidak lulus : " + (counterData - counterLulus));
            System.out.println("IP rata-rata : " + sumIpk / counterData);

        } else {
            System.out.println("Tidak ada data");
        }
    }
}
