package capitulo6.testedocap6;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        Stack stk2 = new Stack(name);

        char ch;
        int i ;

        for(i=0; i < 10; i++)
        stk1.push((char) ('A' + i));

        Stack stk3 = new Stack(stk1);

        System.out.println("Conteúdo de stk1: " );
        for(i=0; i < 10; i++){
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Conteúdo de stk2: ");
        for(i=0; i < 3; i++){
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        for(i=0; i < 10; i++){
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
