public class Planet {

    private String name;
    private int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExplode(){
        String output = String.format("Boom %s has exploded", this.name);
    }

    public void setExplode(){
        this.name = name;
    }
}
