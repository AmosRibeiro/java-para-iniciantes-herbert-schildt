package capitulo10.help;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {

    String helpfile; // nome do arquivo de ajuda

    Help(String fname){
        helpfile = fname;
    }

    boolean helpOn(String what){
        int ch;
        String topic, info;
        try(BufferedReader helpRdr = 
            new BufferedReader(new FileReader(helpfile)))
        {
            do{
                ch = helpRdr.read();

                if(ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){
                        do{
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);   
        } 
        catch(IOException exc){
            System.out.println("Error acessing help file.");
            return false;
        }
        return false;
    }

    String getSelection(){
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try{
            topic = br.readLine();
        }
        catch(IOException exc){
            System.out.println("Error reading console.");
        }
        return topic;
    }
}
