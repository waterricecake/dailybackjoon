package backjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class backjoon_15650_subsetTest extends TestcaseInput{
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
                        "2 3\n" +
                        "2 4\n" +
                        "3 4");
    }
    @Test
    void testcase3(){
        setTestCase("4 4",
                "1 2 3 4");
    }
    @AfterEach
    void testCase() throws IOException {
        backjoon_15650_subset.problem(readString());
        validateResult();
    }
}
