import Fruits.Apple;
import Fruits.Banana;
import Fruits.Fruit;
import Fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class Bowl {
    public List<Fruit> fruits;

    public Bowl(){
        fruits = new ArrayList<>();
    }

    public void addFriutsToBowl(Fruit... fruitList){
        for(Fruit fruit : fruitList)
        fruits.add(fruit);
    }

    public Bowl getBowlOfApple(){
        Bowl bowlOfApple = new Bowl();
        for (Fruit fruit : fruits){
            if(fruit instanceof Apple)
                bowlOfApple.addFriutsToBowl(fruit);
        }
        return bowlOfApple;
    }

    public Bowl getBowlOfBanana(){
        Bowl bowlOfBanana = new Bowl();
        for (Fruit fruit : fruits){
            if(fruit instanceof Banana)
                bowlOfBanana.addFriutsToBowl(fruit);
        }
        return bowlOfBanana;
    }

    public Bowl getBowlOfOrange(){
        Bowl bowlOfOrange = new Bowl();
        for (Fruit fruit : fruits){
            if(fruit instanceof Orange)
                bowlOfOrange.addFriutsToBowl(fruit);
        }
        return bowlOfOrange;
    }

    public int getCount() {
        return fruits.size();
    }
}
