package com.csrk.blocks;

public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("While Loop Conditions");
		System.out.println("Right angle triangle");
		int num = 1;
		while (num <= 5) {
			for (int u = 1; u <= num; u++) {
				System.out.print("*");
			}
			num++;
			System.out.println();
		}
		System.out.println("reverse order");
		int n=1;
		while(n<=5){
			/*for(int m=4;m>=n;m--){
				System.out.print(" ");
			}for(int o=1;o<=n;o++){
				System.out.print("*");
			}*/
			int m=4;
			while(m>=n){
				System.out.print("-");
				m--;
			}
			int o=1;
			while(o<=n){
				System.out.print("*");
				o++;
			}
			System.out.println();
			n++;
		}
		System.out.println("Triangle");
		int x=1;
		while(x<=5){
			int y=4;
			while(y>=x){
				System.out.print(" ");
				y--;
			}int z=1;
			while(z<=(2*x-1)){
				System.out.print(z);
				z++;
			}System.out.print("\n");
			x++;
		}
		System.out.println("Triangle with space between values");
		int a=1;
		while(a<=4){
			int b=3;
			while(b>=a){
				System.out.print("-");
				b--;
			}int c=1;
			while(c<=a){
				System.out.print(" "+c);
				c++;
			}System.out.println();
			a++;
		}
		
          
	}

}
