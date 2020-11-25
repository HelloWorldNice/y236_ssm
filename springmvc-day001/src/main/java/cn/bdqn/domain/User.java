package cn.bdqn.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {

    private String username;

    private String pwd;

    private Integer age;

    private Date born;

    private List<String> addressesStrs;
    private List<Address> addresses;
    private Map<String, Address> addressMap;

    public List<String> getAddressesStrs() {
        return addressesStrs;
    }

    public void setAddressesStrs(List<String> addressesStrs) {
        this.addressesStrs = addressesStrs;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", born=" + born +
                ", addresses=" + addresses +
                ", addressMap=" + addressMap +
                '}';
    }
}
