
public class account_info {
	private String account;
	private int balence;
	private int total;
	private int deposite;
	
	public void setname(String name) {
		account = name;
	}
	public void setbalence(int amount) {
		balence = amount;
	}
	public void settotal(int n) {
		total = n;
	}
	public void setdeposite(int n) {
		deposite  = total + n;
	}
	
	
	public String getname() {
		return account;
	}
	public int getbalence() {
		return balence; 
	}
	public String getwithdrow() { 
		int rem = total - balence;
		if(rem<1000) {
			return "your reminder balance is less than 1000";
		}
		else
		{
			total = rem;
			return "thank you!";
		}
	}
	public int getdeposite() {
		return deposite;
	}
	
	

}
