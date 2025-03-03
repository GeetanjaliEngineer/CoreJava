package sort;

public class SelectionSort {
public static void main(String args[]) {
	
	int[] a = {38,52,9,56,95,100,62,13};
	int temp;
	int min = 0;
	for(int i=0; i<a.length; i++) {
		for(int j =i+1;j<a.length;j++) {
			if(a[j]<a[min]) {
				min=j;
				
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	for(int i=0; i<a.length; i++) {	
		System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
}