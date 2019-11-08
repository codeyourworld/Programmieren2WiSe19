package sets;

import java.util.HashSet;

public class AccountMain {

	public static void main(String[] args) {
		HashSet<Account> accounts = new HashSet<>();
		
		accounts.add(new Account("Tom", "03432423"));
		accounts.add(new Account("Tom", "031112423"));
		accounts.add(new Account("Sebastian", "1238818"));
		accounts.add(new Account("Sebastian", "1238818"));
		
		for(Account account : accounts) {
			System.out.println(account);
		}
		
	}
}
