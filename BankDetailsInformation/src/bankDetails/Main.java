package bankDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<BankAccount> list1 = new ArrayList<BankAccount>();
		ArrayList<BankTransaction> list2 = new ArrayList<BankTransaction>();
			
		File file1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BankDetailsInformation\\src\\bankDetails\\bankaccount.txt");
		File file2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BankDetailsInformation\\src\\bankDetails\\banktransaction.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		
		String line;
		
		while((line = br1.readLine())!= null) 
		{
	    	String[] data1 =line.split(",");
			list1.add(new BankAccount(data1[0], data1[1], data1[2], data1[3], data1[4], data1[5]));
		}
		
		while((line = br2.readLine())!= null) 
		{	
			String[] data2 = line.split(",");
			list2.add(new BankTransaction(data2[0], data2[1], data2[2]));
		}
		
		System.out.println("Enter the name of the customer");
		String searchName = sc.next();
		
		int found = new BankDetails().searchName(searchName, list1);
		
		if (found == 1) 
		{
			System.out.println("Transaction Details of customer is "+searchName);
			System.out.printf("%-10s%-15s%-10s%-10s%-25s%-15s\n","S_No","Bank_Name", "Age", "Gender", "Transaction_Date", "Amount");
			new BankDetails().mapCardNumber(list1, list2, searchName);
		} 
		else 
		{
			System.out.println("Customer name not found");
		}

	}
}