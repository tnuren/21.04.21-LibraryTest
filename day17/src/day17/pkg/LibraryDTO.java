package day17.pkg;

public class LibraryDTO {

private	int bookNumber;
private	String bookName;
private	String author;
private	boolean check;
private	int clientNumber;
private	String name;
private	String number;
	
	
	public LibraryDTO(String name, String number) {
		super();
		this.name = name;
		this.number = number;
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

	LibraryDTO(){
		
	}
	
	public LibraryDTO(int bookNumber, String bookName, String author, boolean check, int clientNumber) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.check = check;
		this.clientNumber = clientNumber;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "LibraryDTO [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", check="
				+ check + ", clientNumber=" + clientNumber + "]";
	}
	
	
}
