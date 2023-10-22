package ödev3;

public class AsalABC {

    public static void main(String[] args) {
 
    	for(int i = 100 ; i <=999; i++)
    	{
    		if(TestABC(i))
    		{
    			System.out.println(i);
    		}
    	}
    }
    
   
    public static boolean TestABC (int abc)
    {
    	int a = abc /100;
    	//123/10 = 23 
    	int b = (abc/10) % 10;
    	int c = abc %10;
    	
    	int cba = (c*100) + (b*10)+a;
    	int ab = (a*10) + b;
    	int bc = (b*10) + c; 
    	int cb = (c*10) + b;
    	int ba = (b*10) + a;
    			
    	return cba > abc 
    			&& IsAsal(abc) 
    			&& IsAsal(cba) 
    			&& IsAsal(ab) 
    			&& IsAsal(bc)
    			&& IsAsal(cb) 
    			&& IsAsal(ba);
    }
    
    public static boolean IsAsal(int value)
    {
    	boolean cond = false;
    	for(int i =2 ; i < value; i++)
    	{
    		if(value % i == 0)
    		{
    			cond = true;
    			break;
    		}
    	}    	
    	return !cond;
    }
}