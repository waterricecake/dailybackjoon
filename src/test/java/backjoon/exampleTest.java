package backjoon;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class exampleTest  extends TestcaseInput {
    @Test
    void testcase1(){
        setTestCase("",
                "");
    }
    @AfterEach
    void testCase() throws IOException {
        example.problem(readString());
        validateResult();
    }
}

