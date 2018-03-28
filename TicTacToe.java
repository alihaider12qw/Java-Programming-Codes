import java.util.*;
class TicTacToe
{	
	static Scanner input=new Scanner(System.in);
	static char multi[][]= new char[3][3];
	
	public static void main(String[] args) 
	{
		

		char s=48;
		for(int i=0; i<3; i++)
		{
			for(int i1=0; i1<3; i1++)
			{
				System.out.print("   "+(multi[i][i1]=++s)+"  ");
			}
			System.out.print("\n\n");
		}
		
		
		
		int flag1=1;
		int flag2=0;
		int a=0;
		int b=0;	
		int c=0;
		for(;;)
		{
			c+=1;
			if(flag1==1 && flag2==0)
			{
				System.out.println("    O turn");
				tac();
				flag1=0;
				flag2=1;
				a=winner();
			}
			if(a==1)
				break;
			
			if (c==5)
			{
				System.out.println("no one wins");
				break;
			}
			
			
			if(flag1==0 && flag2==1)
			{
				System.out.println("     X turn");
				tic();
				flag1=1;
				flag2=0;
				b=winner();
			}
			if(b==1)
				break;
		}		
	}
	
	static int winner ()
	{
		for(int i=0; i<3; i++)
		{
			//for x
			if(multi[i][0]==88 && multi[i][1]==88 && multi[i][2]==88 || multi[0][i]==88 && multi[1][i]==88 && multi[2][i]==88|| multi[0][0] == 88 && multi[1][1] == 88 && multi[2][2] == 88 || multi[0][2] == 88 && multi[1][1] == 88 && multi[2][0]==88 )
			{
				System.out.println("winner is x");
				
				return 1;
			}
			
			//for o
			if(multi[i][0]==79 && multi[i][1]==79 && multi[i][2]==79 || multi[0][i]==79 && multi[1][i]==79 && multi[2][i]==79|| multi[0][0] == 79 && multi[1][1] == 79 && multi[2][2] == 79 || multi[0][2] == 79 && multi[1][1] == 79 && multi[2][0]==79 )
			{
				System.out.println("winner is O");
				
				return 1;
			}
		}
		return 0;
		
	}

	// X FUNCTION
	static void tic ()
	{
		
		char s=48; 
		
			int in=input.nextInt();
			System.out.print("\n");
			
			switch(in)
			{
				case 1:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==49)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				break;
				
		//-------------------------------------------------------------------------		
				
				case 2:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==50)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//----------------------------------------------------------------------------		
				case 3:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==51)
						multi[i][i1]=88;	
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
				
		//------------------------------------------------------------------------------------	
		
				case 4:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==52)
						multi[i][i1]=88;	
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				break;
			
		//------------------------------------------------------------------------------------	
		
				case 5:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==53)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 6:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==54)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 7:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;					
						if(s==55)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 8:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==56)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");						
					}
					System.out.print("\n\n");
				}
				break;
		//------------------------------------------------------------------------------------	
		
				case 9:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==57)
						multi[i][i1]=88;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
				default:
				System.out.println("Invalid");
				
			}
		
		
	}
	
	//third function
	static void tac ()
	{
		
		char s=48;
		
			int in=input.nextInt();
			
			switch(in)
			{
				case 1:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==49)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				break;
				
		//-------------------------------------------------------------------------		
				
				case 2:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;					
						if(s==50)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}				
				break;
		//----------------------------------------------------------------------------		
				case 3:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;	
						if(s==51)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 4:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==52)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");						
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 5:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==53)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");		
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 6:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==54)						
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 7:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==55)					
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 8:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==56)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
		
				case 9:
				s=48;
				for(int i=0; i<3; i++)
				{
					for(int i1=0; i1<3; i1++)
					{
						s+=1;
						if(s==57)
						multi[i][i1]=79;
						System.out.print("   "+multi[i][i1]+"  ");
					}
					System.out.print("\n\n");
				}
				
				break;
		//------------------------------------------------------------------------------------	
				default:
				System.out.println("Invalid");
				
			}
		
	}
}

