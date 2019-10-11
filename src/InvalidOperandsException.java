import java.lang.Exception;

public class InvalidOperandsException extends Exception{
 
    private int number;
    public int getNumber(){return number;}
    public InvalidOperandsException(){
     
        super("Invalid operands, Exemple input: 10 + 10 or X + X");
        number=1;
    }
}
