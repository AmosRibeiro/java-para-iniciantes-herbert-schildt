package capitulo5.showbits;

public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 em binário é ");
        b.show(123);

        System.out.println("\n87987 em binário é ");
        i.show(87987);

        System.out.println("\n237658768 em binário é ");
        li.show(237658768);
    }
}
