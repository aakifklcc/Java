/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5algorthm;

import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class Lab3 {

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        scanner.close();
        towersOfHanoi.solve(discs, "A", "B", "C");

        System.out.println("New method:");
        int count = towersOfHanoi.solve2(discs, "A", "B", "C");
        System.out.println("number of moves= " + count);
    }

}
