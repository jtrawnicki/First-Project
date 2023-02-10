import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {


    @org.junit.jupiter.api.Test

    void averageTest() {
        //given

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(12);
        numbers.add(4);
        numbers.add(19);
        numbers.add(28);

        float expectedResult = 14;

        // when

        float result = countAverage(numbers);

        //then

        assertEquals(expectedResult, result);

    }

    @org.junit.jupiter.api.Test

     void secondAverageTest() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(6);
        numbers.add(18);
        numbers.add(28);
        numbers.add(99);
        numbers.add(71);

        float expectedResult = 37.5F;

        float result = countAverage(numbers);

        assertEquals(expectedResult, result);
    }



    public float countAverage(List<Integer> list) {
        float sum = 0;
        for (int number : list) {
            sum += number;
        }
        float average = (sum / list.size());
        return average;
    }

}


