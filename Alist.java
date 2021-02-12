package assesment;
import java.util.*;
public class Alist {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			l.add(sc.nextInt());
		System.out.println("Arraylist:"+l);
		Collections.reverse(l);
		System.out.println("Reversed Arraylist:"+l);
		l.remove(2);
		Collections.reverse(l);
		System.out.print("Arraylist after removing the third element:"+l);
		}
	}
