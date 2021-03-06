package Prac9;

import java.math.BigInteger;

public class NotValidExcept extends Exception {

    private BigInteger innNum;

    public NotValidExcept(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
