class Attendence
{
	public static void main(String[] args)
	{
	  int class_held = 20000;
	  double class_attend = 1011;
	  double percentage = class_attend/class_held*100;
	  System.out.println(percentage);
	
		if(percentage>=70)
		{
		 System.out.println("ELIGIBLE FOR SIT IN EXAM");
		}
	
		else
		{
		System.out.println("Student is not eligible for exam");
		}
	}
}