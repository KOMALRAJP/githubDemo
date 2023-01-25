package githubdemo;

public class test1 {

	public static void main(String[] args) {
		 //Fibonacci
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println(n1+" "+n2+" ");
		for(int i=1;i<=10;i++)
		{
			n3=n1+n2;
			if(n3<=100)
				
			{
				n1=n2;
				n2=n3;
			System.out.println(n3+" ");
			}
	}

	}

}
