package capitulo05;

public class MediaEx {
    public static void main(String[] args) {
        int media[] = new int[10];
        int calculoMedia = 0;

        for(int i = 0; i < media.length; i++){
            media[i] = i;
            System.out.println(media[i]);
            
        }
       for(int x: media) calculoMedia += x; calculoMedia = calculoMedia / media.length;
       System.out.println("A media é de: " + calculoMedia);
    }
}
