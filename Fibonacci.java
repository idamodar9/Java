class Fibonacci
{
	public static void main(String [] args)
	{
	  int n1 = 0;
	  int n2 = 1;
	  int temp;

	 System.out.println(n1);
	 System.out.println(n2);

	for(int i =1;i<=8;i++)
	{
	
	   temp = n2+n1;
	   n1=n2;
	   n2=temp;
	 System.out.println(temp);

	}

	}

}