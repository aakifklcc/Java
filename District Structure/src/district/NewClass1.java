/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package district;

/**
 *
 * @author akifkilic
 */
public class NewClass1 {
    public static void main(String[] args) {
		String num = "11101011";
		num = add(num);
		System.out.println(num);
	}

	public static String add(String num) {
		String zeroes = "";
		for (int i = num.length() - 1; 0 <= i; i--) {
			if (num.charAt(i) == '0') {
				num = num.substring(0, i) + "1" + zeroes;
				break;
			}
			zeroes += "0";
		}
		return num;
	}
    
    
    
}
