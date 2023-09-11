/*Student class with private fields:roll no,name,age,address 
and public getter & setters
*/
 class Student{

	private int roll_no;
	private String name ;
	private int age;
	private String address;
	
	public Student(int roll_no, String name, int age, String address) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
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
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
 }

public class StudMain {

	public static void main(String[] args) {
		Student st = new Student(45,"payal",22,"nagpur");	
		System.out.println("roll No :"+st.getRoll_no());
		System.out.println("Name :"+st.getName());
		System.out.println("Age :"+ st.getAge());
		System.out.println("Adderess :"+ st.getAddress());			
	}
    }
