public class Dog extends Animals{
    public Dog(){
        super();
        setSound("Bark! Bark!");
        flyingType = new CantFlys();
    }

    public void digHoles() {
        System.out.println("dig a big hole");
    }


}
