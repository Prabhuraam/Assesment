package assesment;
import java.util.*;
public class Prime {
public int checkPrime(int p) {
	int i,m=0,flag=0;  
	int r=0;
	m=p/2;      
	if(p==0||p==1)
		r=0;      
	else{  
		for(i=2;i<=m;i++){      
	    if(p%i==0){      
	    	r=0;     
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  
		   r=1;
	  }
	return r;
	} 
public void firsttenprime() {
	int count=0,n=1,i=1,j=1; 
	System.out.println("The first 10 prime numbers are:");
	while(n<=10){    
		while(j<=i){  
			if(i%j==0)  
				count++;  
			j++;   
			}  
	if(count==2){
		System.out.printf("%d ",i);
		n++;  
		}  
	i++; 
	j=1;  
	count=0;
	}  
	}
public static void main(String[] args) {
	Prime p=new Prime();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int m=sc.nextInt();
	int flag=p.checkPrime(m);
	if(flag==0)
		System.out.println(m+" is not a prime number");
	if(flag==1)
		System.out.println(m+" is a prime number");
	p.firsttenprime();
}
}
