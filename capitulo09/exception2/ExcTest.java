package capitulo09.exception2;

public class ExcTest {
    static void genException(){
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        nums[7] = 10;
    }
}
