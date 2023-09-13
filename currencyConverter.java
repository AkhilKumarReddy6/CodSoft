import java.util.Scanner;
class currencyConverter 
{
	public static void main(String[] args) 
	{
		int amount;
		System.out.println("Enter the amount");
		Scanner s=new Scanner(System.in);
		amount=s.nextInt();
        int n;
		System.out.println("1.Rupee to Dollar\n2.Rupees to Euro\n3.Rupees to Dirhams\n");
		System.out.println("4.Dollars to Rupees\n5.Dollars to Euros\n6.Dollars to Dirhams\n");
		System.out.println("7.Euros to Rupees\n8.Euros to Dollars\n9.Euros to Dhirams\n");
		System.out.println("10.Dirhams to Rupees\n11.Dirhams to Dollars\n12.Dirhams to Euros\n");
		System.out.println("Enter the number to convert ");
		n=s.nextInt();
	     switch(n)
		{
			case 1:
			{
				System.out.println("Converting Rupees to Dollar");
				System.out.println("1 rupee=0.012 dollars");
				double dollar=0.012*amount;
				System.out.println(+amount + " Rupess in Dollar="+dollar+ "dollars");
				break;
			}
			case 2:
			{
				System.out.println("Converting Rupees to Euro");
				System.out.println("1 rupee=0.011 Euros");
				double euro=0.011*amount;
				System.out.println(+amount+ "Rupees in Euro="+euro+"Euros");
				break;
			}
			case 3:
			{
				System.out.println("Converting Rupees to Dirhams");
				System.out.println("1 Rupees =0.044 Dirhams");
				double dhirams=0.044*amount;
				System.out.println(+amount+ "Rupees in Euro="+dhirams+ "hirams");
				break;
			}
			case 4:
			{
				System.out.println("Converting Dollars to Rupees");
				System.out.println("1 dollar=82.66 Rupees");
				double rupee=82.66*amount;
				System.out.println(+amount + " Dollar in Rupee="+rupee+ "Rupees");
                break;
			}
			case 5:
			{
			    System.out.println("Converting Dollars to Euros");
				System.out.println("1 dollar=0.92 Euros");
				double euros=0.92*amount;
				System.out.println(+amount + " Dollar in Euros="+euros+ "Euros");
                break;	
			}
			case 6:
			{
			    System.out.println("Converting Dollars to Dirhams");
				System.out.println("1 dollar=3.67 Dirhams");
				double dirhams=3.67*amount;
				System.out.println(+amount + " Dollar in Dirhams="+dirhams+ "Dirhams");
                break;	
			}
			case 7:
			{
				System.out.println("Converting Euros to Rupees");
				System.out.println("1 Euro=89.71 Rupees");
				double rupees=89.71*amount;
				System.out.println(+amount + " Euros in Rupees="+rupees+ "Rupees");
                break;
			}
			case 8:
			{
				System.out.println("Converting Euros to Dollars");
				System.out.println("1 Euro=1.08 Dollars");
				double dollars=1.08*amount;
				System.out.println(+amount + " Euros in Dollars="+dollars+ "Dollars");
                break;
			}
			case 9:
			{
				System.out.println("Converting Euros to Dirhams");
				System.out.println("1 Euro=3.98 Dirhams");
				double dirhams=3.98*amount;
				System.out.println(+amount + " Euros in Dirhams="+dirhams+ "Dirhams");
                break;
			}
			case 10:
			{
				System.out.println("Converting Dirhams to Rupees");
				System.out.println("1 Dirham=22.52 Rupees");
				double rupees=22.52*amount;
				System.out.println(+amount + " Dirhams in Rupees="+rupees+ "Rupees");
                break;
			}
			case 11:
			{
				System.out.println("Converting Dirhams to Dollars");
				System.out.println("1 Dirham=0.27 Dollars");
				double dollars=0.27*amount;
				System.out.println(+amount + " Dirhams in Dollars="+dollars+ "Dollars");
                break;
			}
			case 12:
			{
				System.out.println("Converting Dirhams to Euros");
				System.out.println("1 Dirham=0.25 Euros");
				double euros=0.25*amount;
				System.out.println(+amount + " Dirhams in Euros="+euros+ "Euros");
                break;
			}
			







		}
		

	}
}
