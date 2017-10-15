package work;

public class DepositAccount {

	private String username;		    //储存姓名
	private int accountNumber;			//账号
	private String password="000000";	//密码
	private float balance;				//存款余额
	static double rate;					//年利率
	
	//开户
	DepositAccount(String name,int number,float bal){
		username = name;
		accountNumber = number;
		balance = bal;
	}
	
	//存款
	public void save(float n){
		System.out.println("余额:"+balance);
		System.out.println("存入:"+n);
		balance += n;
		System.out.println("总额:"+balance);
	}
	
	//取款
	public void withdrawal(float n){
		if(n<=balance){
			balance -= n;
			System.out.println("取款成功!");
			System.out.println("balance:"+balance);
		}else{
			System.out.println("余额不足!");
		}
	}
	
	//查询户主
	public String getName(){
		return username;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getPassword(){
		return password;
	}
	
	//设置密码
	public String setPassword(String ps){
		return password = ps;
	}
	
	//查询余额
	public double getBalance(){
		return balance*(1+rate);
	}
	
	//设置年利率
	public static void setRate(double n){
		rate = n;
	}
	
	//查询年利息
	public double get_year(){
		return balance*rate;
	}
	
	//查询月利息
	public double get_month(){
		return balance*rate/12;
	}
}
