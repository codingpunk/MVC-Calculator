package Controller;

public class ButtonInfo {
	
	boolean isOperator;
	boolean isEquals;
	boolean isDot;
	boolean isNumber;
	boolean isClear;
	
	public ButtonInfo (String buttonText) throws Exception{
		
		readButtonValue(buttonText);
			
		
	}
	
	private void readButtonValue(String buttonText) throws Exception {
		switch (buttonText){
			case "C" : isClear = true; break;

			case "1" : 
			case "2" : 
			case "3" : 
			case "4" : 
			case "5" : 
			case "6" : 
			case "7" : 
			case "8" : 
			case "9" : 
			case "0" : isNumber = true; break;
			
			case "." :  isDot = true; break;
			
			case "+" : 
			case "-" :  
			case "*" : 
			case "/" :  isOperator = true; break;
			
			case "=" : isEquals = true; break;
			
			default : throw new Exception("BUTTON TYPE NOT FOUND");
		}
	
	}

	public boolean isNumber() {
		return isNumber;
	}

	public boolean isOperator() {
		return isOperator;
	}

	public boolean isEquals() {
		return isEquals;
	}

	public boolean isDot() {
		return isDot;
	}

	public boolean isClear() {
		return isClear;
	}
}
