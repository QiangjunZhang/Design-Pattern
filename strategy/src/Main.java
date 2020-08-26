public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getSound());
        dog.digHoles();
        dog.tryToFly();

        Bird bird = new Bird();
        bird.tryToFly();
        System.out.println(bird.getSound());

    }
}
