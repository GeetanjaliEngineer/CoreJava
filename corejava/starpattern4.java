

public class starpattern4 {
public static void main(String args[]) {
//    ****
//     ***
//      **
//       *
	for(int i=1; i<=4; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(" "); //for space
			
		}
		for(int k=4; k>=i; k--) {
			System.out.print("*"); //for stars
		}
		System.out.println(); //for next line 
	}
	}


}


