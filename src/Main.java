public class Main {
    public static void main(String[] args) {
        BrownBear objectA = new BrownBear(190, 500 ,"All" , "On trees");
        System.out.println(objectA.getInfo());
        objectA.makeVoice();
        objectA.makeVoice("uhhhhhhhh");
        Kodiak objectB = new Kodiak(210, 650, "All", "Evrywhere");
        System.out.println(objectB.getInfo());
        objectB.makeVoice();
        objectB.makeVoice("jdsgv");
        Kodiak objectC = new Kodiak(200, 625, "All", "Evrywhere");
        System.out.println(objectC.getInfo());
        objectC.makeVoice();
        objectC.makeVoice("jdsgv");
    }
}