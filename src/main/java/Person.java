public class Person {
    private String firstName;
    private String lastName;

    public Person(final String a, final String b){
        firstName = a;
        lastName = b;
    }

    
    public String doSomething() {
        return this.firstName + " " + this.lastName + " is doing something";
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.firstName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}













