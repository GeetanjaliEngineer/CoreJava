
public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {5,1,6,2,4,3};
 for(int i=0; i<a.length; i++) {
	 int temp = a[i];
	 int j = i;
	 while(j>0 && a[j-1]>temp) {
		 a[j]=a[j-1];
		 j=j-1;
	 }
	 a[j] = temp;
 }
 for(int i1=0; i1<a.length; i1++)
	 {
	//	int i1 = 0;
		System.out.print(a[i1]+  " " );
 } System.out.println();
	}
}

