package calculator;

class StringCalculator {

	int result;
	public StringCalculator() 
	{
		result=0;
	}
	
	public  Integer add(String input)
	{
		
		// input string is empty -- ""
		if(input == null || input.isEmpty())
		{
			return 0;
		}
		
		//input string is "1,1"
		
		String input1 = new String(input);
	    int endindex = 0;
		while(input1.indexOf(',') != -1 || input1.contains("\n")) {
			int indexofcomma = 0;
			int indexofnewline = 0;
			indexofnewline  = input1.indexOf('\n');
			indexofcomma = input1.indexOf(',');
			if(indexofcomma != -1 || indexofnewline != -1)
			{
				endindex =  (indexofcomma > indexofnewline) ? ( indexofnewline != -1 ? indexofnewline : indexofcomma ):( indexofcomma != -1 ? indexofcomma  : indexofnewline );
				String str1 =  input1.substring(0,endindex);
				input1 = input1.substring(endindex + 1, input1.length());
				result = result + Integer.parseInt(str1 != "" ? str1: "0");
			}
		}
		return result + Integer.parseInt(input1 != "" ? input1: "0");
	}
	

}