package edu.sio.randomG;

import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		int unePropos;
		
		Aleatoire r1 = new Aleatoire(3, 0, 10);
		System.out.println(r1);
		
		do {
			
			unePropos = sca.nextInt();
			System.out.println(r1.proposerNombre(unePropos));
			
		}while(r1.getTentative() != 0);
		sca.close();

	}

}
