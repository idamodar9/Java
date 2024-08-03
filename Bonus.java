class Bonus
{
	public static void main(String []args)
	{
	  double salary = 200000;
	  int exp    = 6;
	  double bonus;
          
		if(exp>=5)
		{
		   	   bonus  = 0.05*salary;
			 double net_salary = salary+bonus;
			System.out.println(bonus);

			System.out.println(net_salary);
	
		}
		else
		{
		System.out.println("Experience is not matching for bonus");
		}
	}
}