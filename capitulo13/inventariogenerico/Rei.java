package capitulo13.inventariogenerico;

public class Rei {
    private boolean isKing;


    public Rei(boolean k){
        this.isKing = k;
    }


    public boolean isKing() {
        return isKing;
    }


    public void setKing(boolean isKing) {
        this.isKing = isKing;
    }


    @Override
    public String toString() {
        return "Rei [isKing=" + isKing + "]";
    }

    
}
