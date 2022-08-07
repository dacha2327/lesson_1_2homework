public class Bear {
    private int height;
    private int theWeight;
    public Bear(int height, int theWeight, String eating, String climbing) {
        this.height = height;
        this.theWeight = theWeight;

    }

    public int getHeight() {
        return height;
    }

    public int getTheWeight() {
        return theWeight;
    }
    public String getInfo(){
        return "\nHeight: "+ height+
                "\nWeight: "+ theWeight +
                "\nBear life on: "+BeerLive.SCANDINAVIA;
    }
}
enum BeerLive {SCANDINAVIA, CENTRAL_ASIA,FINLAND }
class TianShanBrownBear extends BrownBear{
    public TianShanBrownBear(int height, int theWeight, String eating, String climbing) {
        super(height, theWeight, eating, climbing);
    }
}
