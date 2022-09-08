package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumb;
	private double diemTB;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0 ) age = 0;
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumb() {
		return phoneNumb;
	}
	public void setPhoneNumb(String phoneNumb) {
		this.phoneNumb = phoneNumb;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		if (diemTB <= 0) diemTB = 0;
		this.diemTB = diemTB;
	}
	
	
}
