package work;

public class TestAccount {

	public static void main(String[] args) {
		DepositAccount user = new DepositAccount("ZhangSan",1234567890,5000);
		DepositAccount.setRate(0.023);
		System.out.println("username:"+user.getName());
		System.out.println("accountNumber:"+user.getAccountNumber());
		System.out.println("password:"+user.getPassword());
		System.out.println("newPassword:"+user.setPassword("123456"));
		user.save(2000);
		//user.withdrawal(500);
		System.out.println("balance:"+user.getBalance());
		System.out.println("balance_year:"+user.get_year());
		System.out.println("balance_month:"+user.get_month());
	}
}
