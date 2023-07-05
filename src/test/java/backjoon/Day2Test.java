package backjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Day2Test extends TestcaseInput{
    @Test
    void testcase1(){
        setTestCase("(2+(2*2)+2)",
                "(2+2*2+2)\n" +
                        "2+(2*2)+2\n" +
                        "2+2*2+2");
    }
    @Test
    void testcase2(){
        setTestCase("(1+(2*(3+4)))",
                "(1+(2*3+4))\n" +
                        "(1+2*(3+4))\n" +
                        "(1+2*3+4)\n" +
                        "1+(2*(3+4))\n" +
                        "1+(2*3+4)\n" +
                        "1+2*(3+4)\n" +
                        "1+2*3+4");
    }
    @AfterEach
    void testCase() throws IOException {
        Day2.problem(readString());
        validateResult();
    }
}
