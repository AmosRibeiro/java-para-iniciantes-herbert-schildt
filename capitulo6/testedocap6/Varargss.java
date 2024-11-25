package capitulo6.testedocap6;

public class Varargss {


    public static int sum(int ... numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;        
    }

    public static void main(String[] args) {
        
        System.out.println(sum(1,1));
        System.out.println(sum(20, 20, 20, 20, 20));
        System.out.println(sum(0,1,2,3));
    }
}
