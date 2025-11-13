package datastructure;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class FlexibleArrayTest {
    static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray =
                new FlexibleArray<>();
        System.out.println("The current size =" + flexibleArray.size());
        flexibleArray.add(3);
        flexibleArray.remove(4);
    }
}
