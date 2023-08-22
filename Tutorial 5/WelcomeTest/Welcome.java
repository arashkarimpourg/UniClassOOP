public class Welcome {
    private String personName;
    
    public Welcome() {
        System.out.println("CSE3101 - Object Oriented Programming");
    }

    public Welcome(String person) {
        setPersonName(person);
    }
    
    public void setPersonName(String personName) {
	this.personName = personName;
    }

    public String getPersonName() {
	return (this.personName);
    }

    public void DisplayMessage() {
        System.out.println("Welcome to OOP class, " + personName);
    }
}
