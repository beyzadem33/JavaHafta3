package ödev3;
public class PrimeX {

    public static void main(String[] args) {
    	
    	for(int i =0; i< 10000;i++)
    	{
    		boolean cond =isPrimeX(i);
    		if(cond)
    		{
    			System.out.println(i);
    		}
    	}
    }
    
    //2957
    private static boolean isPrimeX(int number)
    {
    	while(number > 9)
    	{
    		if(!checkPrime(number))
    		{
    			return false;
    		}
    		
    		number = getSum(number);
    	}
    	
    	return checkPrime(number);
    }

    private static int getSum(int number)
    {
    	int sum = 0;
    	while(number >0)
    	{
    		sum += number%10;
    		number = number /10;
    	}
    	
    	return sum;
    }
    private static boolean checkPrime(int number)
    {
    	boolean cond = false;
    	for(int i =2 ; i<number ; i++)
    	{
    		if(number % i == 0 )
    		{
    			cond =true;
    			break;
    		}
    	}
    	return !cond;
    }

}