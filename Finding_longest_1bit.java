
public class Finding_longest_1bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finding_longest_1bit ob =  new Finding_longest_1bit();
		int num = 7856025;
		ob.findlong_1bit(num);

	}
	
	public void findlong_1bit(int num)
	{
		int currentlength=0;
		int previouslength=0;
		int maxlength=1;
		String a= "11101111101111110011001";
		
		while(num>0)
		{
			
			if((num & 1)== 1 )
			{
				currentlength=currentlength+1;
			}
			else 
			{
				if((num & 2)== 0 )
				{
					previouslength =0;
				}
				else if((num & 2)== 2 )
				{
					previouslength =currentlength;
				}
				
				currentlength=0;
			}
			
			maxlength = Math.max(previouslength+currentlength, maxlength);
			num = num>>1;
			
		}
		
		System.out.println("Maximum is"+ maxlength);
		
	}

}
