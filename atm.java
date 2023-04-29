import java.util.*;

class atm
{
	public static void main(String[] args) 
	{
		int a,b=4621,c,d,e=7531,f,g,h,i,aa,ad,ae,ak,loop=1,cur=18246;
		String na;
		boolean sc,ac;
		long ab;

		Scanner abc=new Scanner(System.in);
		i=0;
		while(loop<=3) 
		{
		System.out.println("Enter YOur PIN: ");
		a=abc.nextInt();

		if (a==b) 
		{
			do
			{
			System.out.println("1.Savings Account \n 2. Current Account \n 3.Exit!");
			System.out.println("Choose YOur Option: ");
			c=abc.nextInt();
			if (c==1) 
			{
				do
				{
				System.out.println("1.Withdraw Funds \n 2.Deposit \n 3.Check Balance  \n 4.Net BAnking \n 5.UPI Transaction \n 6.Exit!");
				d=abc.nextInt();
				switch (d) 
				{
					case 1:
					System.out.println("ENter Withdrawal Amount:");
					f=abc.nextInt();
					if (f<=e) 
					{
						e=e-f;
						System.out.println("Your Remaining Balance: "+e);
					}
					else
					{
						System.out.println("Insufficient Balance!!");
					}
					break;

					case 2:
					System.out.println("Enter Deposit Amount: ");
					f=abc.nextInt();
					e=e+f;
					System.out.println("Your New Balance is "+e);
					break;

					case 3:
					System.out.println("YOur Current BAlance is "+e);
					break;


					case 4:
					
					System.out.println("ENter Account Number: ");
					ab=abc.nextInt();
					if (ab>=10000000 && ab<=99999999) 
					{
						System.out.println("Enter Amount To Transfer ");
						ad=abc.nextInt();
						if (ad<e) 
						{
							System.out.println("Enter PIN: ");
							ak=abc.nextInt();
							if (ak==b) 
							{
								e=e-ad;
								System.out.println("Transaction Successful");
								System.out.println("REmaining Balance is "+e);	
							}
						}
						else
						{
							System.out.println("Insufficient Balance");
						}
					}
					else
					{
						System.out.println("Invalid Account No.");
					}
					break;

					case 5:
					abc.nextLine();
					System.out.println("ENter UPI Id :");
					na=abc.nextLine();
					sc=na.endsWith("@oksbi");
					ac=na.endsWith("@okaxis");
					if (sc==true || ac==true) 
					{
						System.out.println("Enter Amount: ");
						h=abc.nextInt();
						if (h<=e) 
						{
							System.out.println("Verify Your Pin ");
							aa=abc.nextInt();
							if (aa==b) 
							{
								e=e-h;
								System.out.println("Your Transaction is Successful ");
								System.out.println("Remaining Balance is "+e);
							}
							else
							{
								System.out.println("Invalid PIN!!");
							}
						}
						else
						{
							System.out.println("Insufficient Balance!!");
						}
					}
					else
					{
						System.out.println("Invalid UPI Id!!");
					}
					break;

					case 6:
					System.out.println("Exiting!!");
					break;

					default:
					System.out.println("Invalid Option!!");
					break;
				}
			}while(d!=6);
		}
		else if(c==2)
		{
				do
				{
				System.out.println("1.Withdraw Funds \n 2.Deposit \n 3.Check Balance  \n 4.Net BAnking \n 5.UPI Transaction \n 6.Exit!");
				d=abc.nextInt();
				switch (d) 
				{
					case 1:
					System.out.println("ENter Withdrawal Amount:");
					f=abc.nextInt();
					if (f<=cur) 
					{
						cur=cur-f;
						System.out.println("Your Remaining Balance: "+cur);
					}
					else
					{
						System.out.println("Insufficient Balance!!");
					}
					break;

					case 2:
					System.out.println("Enter Deposit Amount: ");
					f=abc.nextInt();
					cur=cur+f;
					System.out.println("Your New Balance is "+cur);
					break;

					case 3:
					System.out.println("YOur Current BAlance is "+cur);
					break;

					case 4:
					System.out.println("ENter Account Number: ");
					ab=abc.nextInt();
					if (ab>=10000000 && ab<=99999999) 
					{
						System.out.println("Enter Amount To Transfer ");
						ad=abc.nextInt();
						if (ad<cur) 
						{
							System.out.println("Enter PIN: ");
							ak=abc.nextInt();
							if (ak==b) 
							{
								cur=cur-ad;
								System.out.println("Transaction Successful");
								System.out.println("REmaining Balance is "+cur);	
							}
							else
							{
								System.out.println("Wrong Pin!!!");
							}
						}
						else
						{
							System.out.println("Insufficient Balance");
						}
					}
					else
					{
						System.out.println("Invalid Account No.");
					}
					break;

					case 5:
					abc.nextLine();
					System.out.println("ENter UPI Id :");
					na=abc.nextLine();
					sc=na.endsWith("@oksbi");
					ac=na.endsWith("@okaxis");
					if (sc==true || ac==true) 
					{
						System.out.println("Enter Amount: ");
						h=abc.nextInt();
						if (h<=cur) 
						{
							System.out.println("Verify Your Pin ");
							aa=abc.nextInt();
							if (aa==b) 
							{
								cur=cur-h;	
								System.out.println("Your Transaction is Successful ");
								System.out.println("Remaining Balance is "+cur);
							}
							else
							{
								System.out.println("Invalid PIN!!");
							}
						}
						else
						{
							System.out.println("Insufficient Balance!!");
						}
					}
					else
					{
						System.out.println("Invalid UPI Id!!");
					}
					break;

					case 6:
					System.out.println("Exiting!!");
					break;

					default:
					System.out.println("Invalid Option!!");
					break;
				}
			}while(d!=6);
		}
		else if (c==3) 
		{
			System.out.println("Exiting!!");
			break;	
		}
		else
		{
			System.out.println("Invalid Account!!");
		}
	}while(c!=3);
	break;
}
			else  
			{
				System.out.println("INvalid PIN!!");
				loop++;
			}
		}
	}
}
