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
public class CalculatorIPK {

    private boolean lulus;
    private double batasLulus = 2.75;

    boolean isLulus() {
        return lulus;
    }

    boolean isWithinRange(double x, float min, float max) {
        if (x >= min && x <= max) {
            lulus = false;
            if (x >= batasLulus) {
                lulus = true;
            }
            return true;
        }
        return false;
    }

}
