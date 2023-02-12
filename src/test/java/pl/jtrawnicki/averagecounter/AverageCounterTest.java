package pl.jtrawnicki.averagecounter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageCounterTest {

        @org.junit.jupiter.api.Test

        void shouldCountAverage() {
            //given

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(7);
            numbers.add(12);
            numbers.add(4);
            numbers.add(19);
            numbers.add(28);

            float expectedResult = 14;

            // when

            float result = Main.countAverage(numbers);

            //then

            assertEquals(expectedResult, result);

        }

        @org.junit.jupiter.api.Test

        void shouldCountAverage2() {
            List<Integer> numbers = new ArrayList<>();

            numbers.add(3);
            numbers.add(6);
            numbers.add(18);
            numbers.add(28);
            numbers.add(99);
            numbers.add(71);

            float expectedResult = 37.5F;

            float result = Main.countAverage(numbers);

            assertEquals(expectedResult, result);
        }

        @Test
        void shouldCountAverageFromEmptyList() {
            //given
            List<Integer> numbers = new ArrayList<>();

            float expected = NaN;


            //when

            float result = Main.countAverage(numbers);

            //then

            assertEquals(expected, result);
        }

        @Test

        void shouldCountAverage3() {
            //given

            float expectedResult = 34.272728F;

            List<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(3);
            numbers.add(99);
            numbers.add(12);
            numbers.add(72);
            numbers.add(34);
            numbers.add(11);
            numbers.add(2);
            numbers.add(77);
            numbers.add(59);
            numbers.add(7);

            //when

            float result = Main.countAverage(numbers);

            //when

            assertEquals(expectedResult, result);

        }






}
