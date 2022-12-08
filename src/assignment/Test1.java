package assignment;

class Employee {
	Integer id;
	String name;
	Integer age;
	String city;
	Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}
	public Employee(Integer id, String name, Integer age, String city, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}
	
	
	
}
public class Test1 {
    public static void main(String[] args) {
		
	}
}
