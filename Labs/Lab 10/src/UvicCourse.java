public class UvicCourse {
	private String dept = "";
	private int num = 0;
	private String title = "";
		
	public UvicCourse(String dept, int num) {
		this.dept = dept;
		this.num = num;	
	}
	
	public UvicCourse(String dept, int num, String title) {
		this.dept = dept;
		this.num = num;	
		this.title = title;
	}
	
	public void setDept(String dept) {
		this.dept = dept;	
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDept() {
		return this.dept;	
	}
	
	public int getNum() {
		return this.num;	
	}
	
	public String getTitle() {
		return this.title;	
	}
	
	public String toString() {
		String details = "";
		
		details = details + "Course ID: " + this.dept + "\n";
		details = details + "Course Number: " + this.num + "\n";
		details = details + "Title: " + this.title + "\n";
		
		return details;
	}
}