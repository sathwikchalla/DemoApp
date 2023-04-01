package in.ineuron.main;

public class Student {
	private String sname;
	private Integer sid;
	private Integer sage;
	public Student(String sname, Integer sid, Integer sage) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sage = sage;
		
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sage=" + sage + "]";
	}
	

}
