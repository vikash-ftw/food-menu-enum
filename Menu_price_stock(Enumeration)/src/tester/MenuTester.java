package tester;

import java.util.Scanner;

import enumDef.Menu;

public class MenuTester {

	public static void main(String[] args) {
		double totalBill = 0;
		try(Scanner sc = new Scanner(System.in)){
			while(true) {
				System.out.println("MENU -----");
				for(Menu m : Menu.values()) {
					System.out.println(m);
				}
				System.out.println("Enter your item name with quantity or enter quit");
				Menu m = Menu.valueOf(sc.next().toUpperCase());
				int q = sc.nextInt();
				if(m.getQuantity() - q >= 0) {
					totalBill += m.getPrice() * q; 
					m.setQuantity(m.getQuantity() - q);
				}
				else
					System.out.println(m.name().toLowerCase()+" is out of stock !!.." + m.getQuantity() + " left");
			}
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Total Bill= "+totalBill);
		}
	}

}
