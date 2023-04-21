import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3,2,1},input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1,2,3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3,2,1 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageDropLowest(){
    double[] input1 = {1.0};
    double[] input2 = {};
    double[] input3 = {1.0,2.0,3.0,4.0};
    double[] input4 = {1.0,1.0,1.0,1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1),0.001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2),0.001);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input3),0.001);
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input4),0.001);
  }
}
