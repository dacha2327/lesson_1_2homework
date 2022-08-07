public class BrownBear extends Bear{
    private String eating;
    private String climbing;
    public String getEating() {
        return eating;
    }

    public String getClimbing() {
        return climbing;
    }

    public BrownBear(int height, int theWeight, String eating , String climbing) {
        super(height, theWeight, eating, climbing);
        this.eating = eating;
        this.climbing = climbing;
    }
    void makeVoice(){
        System.out.println("ARRRRRRRRRR");
    }
    final void makeVoice(String voice){
        System.out.println(voice);
    }
    @Override
    public String getInfo(){
        return super.getInfo()
         +"\nEat: "+ eating + "\nClimbing: " + climbing;
    }
}
