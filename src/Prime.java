
public class Prime {
public static void main(String[] args) {
	int c=0;
	for(int n=1;n<=100;n++)
	{
		boolean f=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			f=false;	
			}
		}
		if(f==true)
		{System.out.println(n +" is a prime number");
		c++;
		}
	}System.out.println(c);
	
}
}
