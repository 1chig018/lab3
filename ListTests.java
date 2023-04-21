import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    
    @Test
    public void testFilter(){
        List<String> list1 = new ArrayList<>(List.of(new String[] {"abcdefg","abc","abb","abbdgsgsfs"}));
        assertArrayEquals(ListExamples.filter(list1,new implStrChecker()).toArray(),new String[] {"abcdefg","abbdgsgsfs"});
    }
}