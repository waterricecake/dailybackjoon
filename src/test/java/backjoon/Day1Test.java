package backjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Day1Test extends TestcaseInput{
    @Test
    void testcase1(){
        setTestCase("3 1",
                "1\n" +
                "2\n" +
                "3");
    }
    @Test
    void testcase2(){
        setTestCase("4 2",
                "1 2\n" +
                        "1 3\n" +
                        "1 4\n" +
                        "2 1\n" +
                        "2 3\n" +
                        "2 4\n" +
                        "3 1\n" +
                        "3 2\n" +
                        "3 4\n" +
                        "4 1\n" +
                        "4 2\n" +
                        "4 3");
    }
    @Test
    void testcase3(){
        setTestCase("4 4",
                "1 2 3 4\n" +
                        "1 2 4 3\n" +
                        "1 3 2 4\n" +
                        "1 3 4 2\n" +
                        "1 4 2 3\n" +
                        "1 4 3 2\n" +
                        "2 1 3 4\n" +
                        "2 1 4 3\n" +
                        "2 3 1 4\n" +
                        "2 3 4 1\n" +
                        "2 4 1 3\n" +
                        "2 4 3 1\n" +
                        "3 1 2 4\n" +
                        "3 1 4 2\n" +
                        "3 2 1 4\n" +
                        "3 2 4 1\n" +
                        "3 4 1 2\n" +
                        "3 4 2 1\n" +
                        "4 1 2 3\n" +
                        "4 1 3 2\n" +
                        "4 2 1 3\n" +
                        "4 2 3 1\n" +
                        "4 3 1 2\n" +
                        "4 3 2 1");
    }
    @AfterEach
    void testCase() throws IOException {
        Day1.problem(readString());
        validateResult();
    }
}
