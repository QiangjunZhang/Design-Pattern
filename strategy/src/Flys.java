public interface Flys {

    String fly();

}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "It is flying high";
    }
}

class CantFlys implements Flys{

    @Override
    public String fly() {
        return "I cannot fly, you idiot!";
    }
}

