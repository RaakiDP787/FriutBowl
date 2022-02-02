import Fruits.Apple;
import Fruits.Banana;
import Fruits.Orange;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class FruitTests {
        private Bowl mixedFruit;

        //Arrange
        @BeforeClass
        public void BeforeClass(){
            Apple apple1=new Apple();
            Apple apple2=new Apple();
            Orange orange1=new Orange();
            Orange orange2=new Orange();
            Orange orange3=new Orange();
            Banana banana1=new Banana();
            mixedFruit = new Bowl();
            mixedFruit.addFriutsToBowl(apple1,apple2,orange1,orange2,orange3,banana1);
        }

            @Test
        public void shouldSegregateApples() {

            //Act
                Bowl bowlOfApples = mixedFruit.getBowlOfApple();
            //Assert
                Assert.assertEquals(bowlOfApples.getCount(),2);
        }

        @Test
        public void shouldSegregateOranges(){

            //Act
            Bowl bowlOfOrange=mixedFruit.getBowlOfOrange();

            //Assert
            Assert.assertEquals(bowlOfOrange.getCount(),3);

        }
        @Test
        public void shouldSegregateBanana(){
            //Act
            Bowl bowlFullOfBanana=mixedFruit.getBowlOfBanana();

            //Assert
            Assert.assertEquals(bowlFullOfBanana.getCount(),1);

        }
    }

