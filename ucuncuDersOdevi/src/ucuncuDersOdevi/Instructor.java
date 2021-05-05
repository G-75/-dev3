package ucuncuDersOdevi;

public class Instructor extends User{
	
	private String eMail;
	
	public Instructor() {
		
	}

	public Instructor(String eMail) {
		super();
		this.eMail = eMail;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}