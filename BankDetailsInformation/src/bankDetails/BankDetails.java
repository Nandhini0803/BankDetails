package bankDetails;

import java.util.ArrayList;

public class BankDetails 
{
	
	public int searchName(String searchName, ArrayList<BankAccount> list1) 
	{
		int found = 0;
		for (BankAccount b : list1) {
			if (b.getName().equals(searchName)) 
			{
				found = 1;
				break;
			}
		}
		return found;
	}

	public void mapCardNumber(ArrayList<BankAccount> list1, ArrayList<BankTransaction> list2, String searchName) 
	{
		int i=1;
		for (BankAccount ba : list1) 
		{
			for (BankTransaction bt : list2) 
			{
				if (ba.getName().equals(searchName)) 
				{
					if (ba.getCardNumber().equals(bt.getCardNumber())) 
					{
                      	
						System.out.printf("%-10s%-15s%-10s%-10s%-25s%-15s\n",i,ba.getBank(), ba.getAge(), ba.getGender(),bt.getTransactiondate(), bt.getAmount());
					}
				}
			}
		}  
	}
}