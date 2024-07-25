package allpattern;
import java.util.Scanner;
class pattern1 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class pattern2 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
PAATTERN1

6
******
******
******
******
******
******

PATTERN2

7
*
**
***
****
*****
******
*******
PATTERN3


8
1
21
321
4321
54321
654321
7654321
87654321
PATTERN4

6
A
BB
CCC
DDDD
EEEEE
FFFFFF

pattern5 
7
A
BC
CDE
DEFG
EFGHI
FGHIJK
GHIJKLM

PATTERN7

6

GHIJKLM
FGHIJK
EFGHI
DEFG
CDE
BC
A
 pattern6
 7
HGFEDCBA
GFEDCBA
FEDCBA
EDCBA
DCBA
CBA
BA
A
 PATTERNN8
 5
55555
4444
333
22
1


PATTERN9
6
      1
     12
    123
   1234
  12345
 123456
 
 PATTERN10
 6
     *
    ***
   *****
  *******
 *********
***********

*/ 



class pattern3 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print(i-j);
			}
			System.out.println();
	
	}
}
}
class pattern7 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k;
		for(int i=0;i<=n;i++){
			k=n-i;
			for(int j=0;j<=(n-i);j++){
				System.out.print((char)(('A'+k)+j));
			}
			System.out.println();
	
	}
}
}


class pattern4 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)('A'+i));
			}
			System.out.println();
	
	}
}
}
class pattern5 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)(('A'+i)+j));
			}
			System.out.println();
	
	}
}
}
class pattern6{
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();

	
	for(int i=0;i<=n;i++){
		int k=n-i;
		for(int j=0;j<=(n-i);j++) {
			System.out.print((char)(('A'+k)-j));
		}
System.out.println();
}
}
}


class pattern8 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		
		for(int i=0;i<n;i++){
		
			for(int j=0;j<(n-i);j++){
				System.out.print(n-i);
			}
System.out.println();
}
	}
}
class pattern9 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		
		for(int i=0;i<n;i++){
		
			for(int j=0;j<(n-i);j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(k+1);
			}
System.out.println();
}
}
}
class pattern10 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
	
		for(int i=1;i<=n;i++){
		
			for(int j=0;j<(n-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(i+i)-1;k++) {
				System.out.print("*");
			}
System.out.println();
}
}
}
