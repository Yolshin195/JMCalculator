import java.lang.Exception;

public class UnsupportedArithmeticOperationException extends Exception{
 
    private int number;
    public int getNumber(){return number;}
    public UnsupportedArithmeticOperationException(){
     
        super("Unsupported arithmetic operation, use: + - / *");
        number=1;
    }
}
