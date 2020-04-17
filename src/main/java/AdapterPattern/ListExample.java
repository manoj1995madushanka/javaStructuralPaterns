package AdapterPattern;

import java.util.Arrays;
import java.util.List;

public class ListExample {

    public void adaptorList(){
        Integer[] integerArray = new Integer[]{1,2,3};
        List<Integer> integerList = Arrays.asList(integerArray);
        System.out.println(integerArray);
        System.out.println(integerList);
    }
}
