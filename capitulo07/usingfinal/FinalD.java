package capitulo07.usingfinal;

public class FinalD {
    public static void main(String[] args) {

        ErrorMsgFinal err = new ErrorMsgFinal();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
