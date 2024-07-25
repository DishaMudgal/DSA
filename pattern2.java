import java.util.Scanner;


public class pattern2 {

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

	
	for(int p=n-1;p>=1;p--) {
		for(int y=1;y<=(p+p)-1;y++) {
			System.out.print("*");
		}
	
	System.out.println();	
	}

}
}
/*HLAF DIAMOND;
8
*
**
***
****
*****
******
*******
********
*******
******
*****
****
***
**
*
*/