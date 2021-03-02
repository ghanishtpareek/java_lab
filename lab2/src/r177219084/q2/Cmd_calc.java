package r177219084.q2;


public class Cmd_calc {

		    public static void main(String[] args){
		 
		        int num_1 = Integer.parseInt(args[0]);
		        int num_2 = Integer.parseInt(args[2]);
		        String operator = args[1];
		        int result;
		        
		        if (operator.equals("+"))
		        {
		            result = num_1+num_2;
		        } 
		        else if (operator.equals("-"))
		        {
		            result = num_1-num_2;
		        }
		        else if (operator.equals("*"))
		        {
		            result = num_1*num_2;
		        } 
		        else if (operator.equals("/"))
		        {
		            result = num_1/num_2;
		        } 
		        else
		        {
		             throw new java.lang.Error("Operator not recognized");
		        }
		        System.out.println(result);
		    }
		
		 
	}


