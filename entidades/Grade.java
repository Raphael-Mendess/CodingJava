package entidades;

public class Grade {
    public String naeme;
    public double n1;
    public double n2;
    public double n3;

    public double finalGrade(){
        return n1 + n2 + n3;       
    }

    public double missingPoints(){
        if (finalGrade() < 60) {
            return 60.0 - finalGrade();
        }
        else{
            return 0.0;
        }
    }
}
