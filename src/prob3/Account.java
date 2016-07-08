package prob3;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo){
		this.accountNo=accountNo;
		System.out.println(accountNo+"계좌가 계설 되었습니다");
	}





	public int  save(int s){
		balance+=s;
		System.out.println("계좌에서"+s+"입금되었습니다.");
		return balance; 
	}
	
	public int deposit(int d){
		balance-=d;
		System.out.println("계좌에서"+d+"출금 되었습니다	");
		return balance;
		
	}
	
	
	
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
