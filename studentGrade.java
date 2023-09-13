import java.util.Scanner;
class studentGrade 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the number of subjects");
		int number;
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		System.out.println("Enter marks ");
		int marks;
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			marks=s.nextInt();
			sum=sum+marks;
		}
		System.out.println("Total Marks="+sum);
		
		double Percentage=sum/number;
		System.out.println("Percentage="+Percentage);


		if(Percentage>=91 &&Percentage<=100)
		{
			System.out.println("O Grade");
		}
		else if(Percentage>=81 && Percentage<=90)
		{
			System.out.println("A+ Grade");
		}
		else if(Percentage>=71 && Percentage<=80)
		{
			System.out.println("A Grade");
		}
		else if(Percentage>=61 && Percentage<=70)
		{
			System.out.println("B Grade");
		}
		else if(Percentage>=51 && Percentage<=60)
		{
			System.out.println("C Grade");
		}
		else if(Percentage>=41 && Percentage<=50)
		{
			System.out.println("B Grade");
		}
		else
		{
			System.out.println("Fail");
		}


	}
}