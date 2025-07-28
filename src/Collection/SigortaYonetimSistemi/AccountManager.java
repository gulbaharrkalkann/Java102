package Collection.SigortaYonetimSistemi;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts=new TreeSet<>();
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public Account login(String email, String password){
        for (Account account : accounts) {
            try {
                account.login(email, password);
                if (account.getAuthStatus()==AuthenticationStatus.SUCCESS){
                    return account;
                }
            }catch (InvalidAuthenticationException e) {
                System.out.println("Login failed for account: " + account.getUser().getName() + " " + e.getMessage());
            }
        }
        return null;
    }
}
