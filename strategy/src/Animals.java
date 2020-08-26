public class Animals {

    private int weight;
    private String name;
    private String sound;

    public Flys flyingType;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFlyingType(Flys newFlyType){
        flyingType = newFlyType;
    }

    public void tryToFly(){
        System.out.println(flyingType.fly());
    }

}






