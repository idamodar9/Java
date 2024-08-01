class Fizz
{
	public static void main(String[] args)
	{
	 int i = 60;
	
	 	if(i%3==0)
		{
		  System.out.println(i+"divisible by 3");
		  System.out.println("FIZZ");

		}

		else if(i%5==0)	
		{
		 System.out.println(i+"divisible by 5");
		 System.out.println("BUZZ");
		}

		else if(i%5==0 && i%3==0)	
		{
		 System.out.println(i+"divisible by 5 & 3");
		 System.out.println("FIZZBUZZ");
		}
		
		else if(i%5!=0 && i%3!=0)	
		{
		 System.out.println(i+" IS NOT divisible by 5 & 3");
		 System.out.println("BUZZFIZZ");
		}


	}
}