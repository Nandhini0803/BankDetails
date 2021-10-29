package bankDetails;

public class BankTransaction 
{
	private String cardNumber;
	private String transactiondate;
	private String amount;
	
	public BankTransaction(String cardNumber, String transactiondate, String amount) {
		
		this.cardNumber = cardNumber;
		this.transactiondate = transactiondate;
		this.amount = amount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankTransactions [cardNumber=" + cardNumber + ", transactiondate=" + transactiondate + ", amount=" + amount + "]";
	}
}	