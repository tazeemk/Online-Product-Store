package AddProduct;
import java.io.*;
public class AddBean implements Serializable 
{
	 private int code;
	 private String name;
	 private float price;
	 private long qty;
	 
	   public AddBean(){}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}
	   

}
