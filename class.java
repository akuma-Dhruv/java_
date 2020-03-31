public class Main
{
	public static void main(String[] args) {
	    class number
	    {
	                                        
	    
	int num;
    	public boolean isPositive() {
	    if (num>0)
	    return true;
	    else 
	    return false;
	    
	}
	    }
	    number bob = new number();
bob.num = -7;
	System.out.println(bob.isPositive());
    
	}
}
