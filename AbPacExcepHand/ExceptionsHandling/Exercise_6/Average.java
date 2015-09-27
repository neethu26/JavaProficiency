class Averaage {


	protected int sum;

	protected void chectType(int mSubject, int sSubject, int eSubject ) {
					
		if(new Integer(mSubject) instanceof Integer 
		  && new Integer(sSubject) instanceof Integer
		  && new Integer(eSubject) instanceof Integer ) {
			throw new NumberFormatException("Please send marks !!!");
		}
		
		this.sum = a+b+c;
		
		return (this.sum) / 2;			  
	}

}