package interfaces;

public class InterfaceTesting {
    public static void main(String[] args) {
        Players player = new Players("NIKO",10,15);
        Monster monster = new Monster("Jason", 3, 5);

        System.out.println( player.write());
        System.out.println( player);

        System.out.println( monster.write());
        System.out.println(monster);
    }
}
