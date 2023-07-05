package backjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class backjoon_9663_NQUEENTest extends TestcaseInput{
    @Test
    void testcase1(){
        setTestCase("8",
                "92");
    }
    @AfterEach
    void testCase() throws IOException {
        backjoon_9663_NQUEEN.problem(readString());
        validateResult();
    }
}
