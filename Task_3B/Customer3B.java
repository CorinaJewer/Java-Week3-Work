public class Customer3B {
    private int ID;
    private String name;
    private char gender;

    public Customer3B(int ID, String name, char gender){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return(this.name + "(" + this.ID + ")");
    }
}
