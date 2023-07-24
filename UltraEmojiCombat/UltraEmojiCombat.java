package ultraemojicombat;


public class UltraEmojiCombat {

  
    public static void main(String[] args) {
        Lutador l[] = new Lutador [6];
        l[0] = new Lutador("François", "França", 31, 1.75f, 68.9f, 11, 2, 3);
        l[1] = new Lutador("Malaquias","Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("John", "EUA",35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Logan", "Austrália", 28, 1.93f, 81.6f, 13,0,3);
        l[4] = new Lutador("Sebastião", "Brasil", 37, 1.70f, 119.3f, 5,4,3);
        l[5] = new Lutador("Sam", "EUA", 30, 1.81f, 105.7f, 12,2,4);
        
      
        l[0].status();
        System.out.println("-----------------------");
        l[1].status();
        System.out.println("-----------------------");
        l[2].status();
        System.out.println("-----------------------");
        l[3].status();
        System.out.println("-----------------------");
        l[4].status();
        System.out.println("-----------------------");
        l[5].status();
    }
    
}
