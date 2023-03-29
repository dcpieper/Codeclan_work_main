public class WaterBottle {
    private int volume;
    public WaterBottle(int volume){this.volume = volume; }
    public int getVolume() {return this.volume; }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){ setVolume( this.volume -10 ); }

    public void empty(){ setVolume( this.volume = 0); }
    public void fill(){ setVolume( this.volume = 100); }

//    public void setDrink(int volume) {this.volume = volume;}
}
