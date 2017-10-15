package work;

public class DepositAccount {

	private String username;		    //��������
	private int accountNumber;			//�˺�
	private String password="000000";	//����
	private float balance;				//������
	static double rate;					//������
	
	//����
	DepositAccount(String name,int number,float bal){
		username = name;
		accountNumber = number;
		balance = bal;
	}
	
	//���
	public void save(float n){
		System.out.println("���:"+balance);
		System.out.println("����:"+n);
		balance += n;
		System.out.println("�ܶ�:"+balance);
	}
	
	//ȡ��
	public void withdrawal(float n){
		if(n<=balance){
			balance -= n;
			System.out.println("ȡ��ɹ�!");
			System.out.println("balance:"+balance);
		}else{
			System.out.println("����!");
		}
	}
	
	//��ѯ����
	public String getName(){
		return username;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getPassword(){
		return password;
	}
	
	//��������
	public String setPassword(String ps){
		return password = ps;
	}
	
	//��ѯ���
	public double getBalance(){
		return balance*(1+rate);
	}
	
	//����������
	public static void setRate(double n){
		rate = n;
	}
	
	//��ѯ����Ϣ
	public double get_year(){
		return balance*rate;
	}
	
	//��ѯ����Ϣ
	public double get_month(){
		return balance*rate/12;
	}
}
