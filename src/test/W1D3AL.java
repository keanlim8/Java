package test;

public class W1D3AL {

	public static void main(String[] args) {
		Customer c1 = new Customer(1000,"Sara Maria");
		c1.setDiscount(4.89958f);
		//System.out.println(c1.getDiscount());
		System.out.printf("%s gets a discount of %.2f %n", c1.toString(),c1.getDiscount());
		
		Customer c2 = new Customer(2000,"Kean Lim");
		c2.setDiscount(3.38592f);
		System.out.printf("%s gets a discount of %.2f %n", c2.toString(),c2.getDiscount());
		
		Customer c3 = new Customer(3000,"Bob Hill");
		c3.setDiscount(0.00019f);
		System.out.printf("%s gets a discount of %.2f %n", c3.toString() ,c3.getDiscount());
		System.out.println("**************************************************************************");
		JsonData j1 = new JsonData(1,"Zared","Kellet","zKellet@google.com.hk","gender-fluid","Human Resources","Media Manager IT");
		System.out.println(j1.toString());
		System.out.println("**************************************************************************");
		//printing in another format without toString();
		JsonData j2 = new JsonData(2,"Helena","Light Browne","hlightbowne1@joomla.org","Female","Business Development","Engineer IV");
		System.out.println(j2.id + "\n"+ j2.fname +" "+ j2.lname + "\n" + j2.email + "\n" + j2.gender + "\n" + j2.department + "\n" + j2.title);

	}
}

class Customer{
	private int id;
	String name;
	float discount;
	
	//constructor
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public float getDiscount() {
		return this.discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}

class JsonData{
	int id;
	String fname;
	String lname;
	String email;
	String gender;
	String department;
	String title;
	public JsonData(int id, String fname, String lname, String email, String gender, String department, String title) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.department = department;
		this.title = title;
	}
	@Override
	public String toString() {
		return "JsonData [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", gender="
				+ gender + ", department=" + department + ", title=" + title + "]";
	}

}

