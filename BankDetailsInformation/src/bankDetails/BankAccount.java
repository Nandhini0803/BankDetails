package bankDetails;

public class BankAccount {
	
	private String name;
	private String age;
	private String gender;
	private String bank;
	private String cardNumber;
	private String creditLimit;
	private BankTransaction banktransaction;
	
	public BankAccount(String name, String age, String gender, String bank, String cardNumber, String creditLimit) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	@Override  
	public boolean equals(Object obj)   
	{  
	    if (obj == null)   
	         return false;  
	    if (obj == this)  
	         return true;  
	return this.getBank() == ((BankAccount)obj). getBank();  
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", age=" + age + ", gender=" + gender + ", bank=" + bank + ", cardNumber="
				+ cardNumber + ", creditLimit=" + creditLimit + ", banktransaction=" + banktransaction + "]";
	}  
}
