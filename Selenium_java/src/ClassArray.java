
public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] Cars = null;
		int i, len;
		i=0;
		len = 10;
		
		
		/* String[] Cars = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		
		System.out.println("Length of array is " + Cars.length);
				
		for (i=0 ; i<=len-1 ; i++)
				{
			Cars[i] = "BMW"+i ;
				}
		
		for (i=0 ; i<=len-1 ; i++)
		
			System.out.println("Cars >> " + Cars[i] );
		
		*/
		
		// Fibonacci series
		
		int a=0,b=0,c=1;
		
		for (i=0 ; i<=len-1 ; i++)
		{
			
			System.out.println("Series c >> " + a + "," + b +"," + c );
			a = b;
			b = c ;	
			c = a + b;
		}
		
		}
	}

