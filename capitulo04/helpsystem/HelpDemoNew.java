package capitulo04.helpsystem;

public class HelpDemoNew {
    public static void main(String[] args) throws java.io.IOException{
        char choice, ignore;
        HelpClass hlpobj = new HelpClass();

        for(; ;){
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n');

            } while (!hlpobj.isValid(choice));

            if(choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpOn(choice);
            }
        }
    }
