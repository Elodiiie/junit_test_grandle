package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_sum_2_when_arguments_equals(){
        BaseDemo baseDemo = new BaseDemo();
        int first_argument = 1;
        int second_argument = first_argument;
        int expected = 2;
        assertEquals(expected,baseDemo.sum(first_argument,second_argument));
    }
    @Test
    public void should_return_sum_3_when_arguments_not_equal(){
        BaseDemo baseDemo = new BaseDemo();
        int first_argument = 1;
        int second_argument = 2;
        int expected = 3;
        assertEquals(expected,baseDemo.sum(first_argument,second_argument));
    }
}
