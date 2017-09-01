
public class Decimal_to_Binary {

	public static void main(String[] args) {
		Decimal_to_Binary a = new Decimal_to_Binary();
		
		String a1 = new String();
		String a2 = "0.756";
		
		a1 =a.convertDecimal_binary(a2);
		System.out.println("hi" + a1);
		
		// TODO Auto-generated method stub
		

	}
	
	public String convertDecimal_binary(String decimal)
	{
		String binary = ".";
		
		double decimaldot =Double.parseDouble(decimal);
		
		if((decimaldot > 1) || (decimaldot <= 0))
		{
			return "ERROR";
		}
		 
		while(decimaldot>0)
		{
			decimaldot = decimaldot*2;
			
			if(decimaldot>=1)
			{
				binary=binary+"1";
				decimaldot= decimaldot-1;
			}
			else
			{
				binary=binary+"0";
				
			}
		}
		
		return binary;
	}

	
}
