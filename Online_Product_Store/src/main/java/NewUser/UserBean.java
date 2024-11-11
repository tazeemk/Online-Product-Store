package NewUser;
import java.io.*;
public class UserBean implements Serializable
{
private String name,city,mid;
private long phno;
	
public UserBean(){}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getMid() {
	return mid;
}

public void setMid(String mid) {
	this.mid = mid;
}

public long getPhno() {
	return phno;
}

public void setPhno(long phno){
	this.phno = phno;
}

}
