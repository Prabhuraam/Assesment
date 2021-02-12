package assesment;
import java.util.*;
public class duplicate {
	public void dup(int[] a) {
		int flag=0;
		System.out.println();
		System.out.println("The duplicate number present in the array is/are ");
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+ " ");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("none");
	}
public static void main(String args[]) {
	duplicate d=new duplicate();
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	for(int i=0;i<10;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<10;i++)
		System.out.print(a[i]+" ");
	d.dup(a);
}
}
