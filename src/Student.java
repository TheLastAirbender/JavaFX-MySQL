
public class Student {

	private int id_student;
	private String name;
	private String familyname;
	
	public Student(int id, String name, String familyname) {
		this.id_student = id;
		this.name = name;
		this.familyname = familyname;
	}
	
	public int getId() {
		return id_student;
	}
	
	public void setId(int id) {
		this.id_student = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFamilyname() {
		return familyname;
	}
	
	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}
}
