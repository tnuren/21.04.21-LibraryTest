package day17.pkg;

public class MemberDTO {
	private	int clientNumber;
	private	String name;
	private	String number;
	
	MemberDTO(){
		
	}
	
	public MemberDTO(int clientNumber, String name, String number) {
		super();
		this.clientNumber = clientNumber;
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "MemberDTO [clientNumber=" + clientNumber + ", name=" + name + ", number=" + number + "]";
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
