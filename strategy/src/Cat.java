import java.sql.SQLOutput;

public class Cat extends Animals{

    public Cat(){
        super();
        setSound("Meow");
        flyingType = new CantFlys();

    }

    public void beCute(){
        System.out.println("miao miao miao");
    }


}
