package springmvcmodel;

public class Prod {
	int pid;
	String pname;
	
		
	public Prod() {}
	
	public Prod(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Prod [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
	
	

}
