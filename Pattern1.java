import java.util.Scanner;
/*
* 
***
*****
*******
*********
***********
*/
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(i+i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
	}

}
