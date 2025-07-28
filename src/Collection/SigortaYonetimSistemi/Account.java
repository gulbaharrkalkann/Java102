package Collection.SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Objects;

public  abstract class Account implements Comparable<Account> {
    protected User user;
    protected ArrayList<Insurance> insurances;
    private AuthenticationStatus authStatus= AuthenticationStatus.FAIL;

    public Account(User user) {
        this.user = user;

    }
    public User getUser() {
        return user;
    }
    public final void showUserInfo() {
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Job: " + user.getJob());
        System.out.println("Age: " + user.getAge());
        System.out.println("Adresler : ");
        for (Address address: user.getAddressList()) {
            System.out.println(address.getAddress());
        }
    }
    public void addAddress(Address address) {
        AddressManager.addAdress(user, address);
    }
    public void removeAddress(Address address) {
        AddressManager.removeAddress(user, address);
    }
    public AuthenticationStatus getAuthStatus() {
        return authStatus;
    }
    public void login(String email, String password) throws InvalidAuthenticationException{
        if (user.getEmail().equals(email) && user.getPassword().equals(password))
        {
            authStatus = AuthenticationStatus.SUCCESS;
            user.setLastLogin(new java.util.Date());
            System.out.println("Login successful!");
        } else {
            authStatus = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid email or password.");
        }
    }
    public abstract void addInsurance(Insurance insurance);




    @Override
    public int hashCode() {
        return Objects.hash(user.getEmail());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        return user.getEmail().equals(other.user.getEmail());
    }
    @Override
    public int compareTo(Account o) {
        return this.user.getEmail().compareTo(o.user.getEmail());
    }
}
