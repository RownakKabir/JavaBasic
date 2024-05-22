package Class3;

public class modifier {
    //private modifier
    private int privateVariable;
    //public modifier
    public int publicVariable;
    //default  modifier
    int defaultVariable;




    // Getter method to access privateVariable
    public int getPrivateVariable() {
        return privateVariable;
    }

    // Setter method to modify privateVariable
    public void setPrivateVariable(int newValue) {
        this.privateVariable = newValue;
    }

    public void dVariable(){
        System.out.println("Default Variable:"+defaultVariable);
    }

    public void pVariable(){
        System.out.println("Public Variable:"+publicVariable);
    }

}
