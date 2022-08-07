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
                "\nBear life in: " + BearLive.CENTRAL_ASIA;
    }
}

