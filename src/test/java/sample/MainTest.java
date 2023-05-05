package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  @DisplayName("4*5 = 20")
  void computeAreaEqualsFour() {
    Rectangle rectangle=new Rectangle();
    assertEquals(20,rectangle.computeArea(5,4), "Something went wrong!");
  }


  @Test
  @DisplayName("5*5 = 25")
  void computeAreaEqualsFourSquare() {
    Square square=new Square();
    assertEquals(25,square.computeArea(5), "Something went wrong!");
  }


  @Test
  @DisplayName("5*3 = 15")
  void computeAreaEqualsFourRectangle() {
    Rectangle rectangle=new Rectangle();
    assertEquals(15,rectangle.computeArea(2,4), "Something went wrong!");
  }




}

