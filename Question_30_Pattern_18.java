package level_2_Pattern;

import java.util.Scanner;

public class Question_30_Pattern_18 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=n;
		int space=0;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=space;j++) {
				 System.out.print("\t");
			 }
			
			 for(int j=1;j<=star;j++) {
				 if(i>1&&i<=n/2&&j>1&&j<star) {
					 System.out.print("\t");
				 }
				 else {
					 System.out.print("*\t");
				 }
			 
			 }
			 

			 
			 if(i<=n/2) {
				 star -=2;
				 space++;
			 }else {
				 space--;
				 star +=2;
			 }
			 System.out.println();
			 
		 }

	}

}
