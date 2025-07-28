package Collection.SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {
    String name,Surname,email,password,job;
    private int age;
    private ArrayList<Address> addressList;
    private Date lastLogin;

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        Surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList = new ArrayList<>();
        this.lastLogin = new Date();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
