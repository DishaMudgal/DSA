import java.util.Scanner;
public class pattern4 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
		for(int y=1;y<=(i+i)-1;y++) {
		System.out.print("*");
		}
			
		System.out.println();	 
		}


		}
	}

	/*
n=6
     *
    ***
   *****
  *******
 *********
***********
*/