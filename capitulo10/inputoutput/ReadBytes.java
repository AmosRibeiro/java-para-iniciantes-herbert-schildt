package capitulo10.inputoutput;

import java.io.*;

public class ReadBytes {
    public static void main(String[] args) throws IOException{
        byte data[] = new byte[10];

        System.out.println("Enter some characteres.");
        System.in.read(data);
        System.out.print("You entered: ");
        for(int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);
    }
}
