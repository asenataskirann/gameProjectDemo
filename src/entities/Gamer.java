package entities;



public class Gamer {
	
	private int id;
	private String FirstName;
	private String LastName;
	private String identificationNumber;
	private String gamerBirthDate;
    private int gamerAge;
	
	
	
	public Gamer() {}
	
	public Gamer(int id, String firstName, String lastName, String gamerBirthDate ,int gamerAge, String identificationNumber) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.identificationNumber = identificationNumber;
		this.gamerBirthDate=gamerBirthDate;
		this.gamerAge=gamerAge;
		
		
		
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}


	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getGamerBirthDate() {
		return gamerBirthDate;
	}

	public void setGamerBirthDate(String gamerBirthDate) {
		this.gamerBirthDate = gamerBirthDate;
	}

	public int getGamerAge() {
		return gamerAge;
	}

	public void setGamerAge(int gamerAge) {
		this.gamerAge = gamerAge;
	}
	
	
	

}
