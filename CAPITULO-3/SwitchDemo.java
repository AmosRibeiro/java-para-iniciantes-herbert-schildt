public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for(i=0; i<6; i++)
        switch (i) {
            case 0:
                System.out.println("i é zero");
                break;
            case 1:
                System.out.println("i é um");
                break;
            case 2:
                System.out.println("i é dois");
                break;
            case 3:
                System.out.println("i é três");
                break;
            case 4:
                System.out.println("i é quatro");
                break;
            default:
                System.out.println("i é cinco ou maior.");
        }
    }
    
}
