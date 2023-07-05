package backjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class D230704_1759Test  extends TestcaseInput{
    @Test
    void testcase1(){
        setTestCase("4 6\n" +
                        "a t c i s w",
                "acis\n" +
                        "acit\n" +
                        "aciw\n" +
                        "acst\n" +
                        "acsw\n" +
                        "actw\n" +
                        "aist\n" +
                        "aisw\n" +
                        "aitw\n" +
                        "astw\n" +
                        "cist\n" +
                        "cisw\n" +
                        "citw\n" +
                        "istw");
    }
    @AfterEach
    void testCase() throws IOException {
            D230704_1759.problem(readString());
        validateResult();
    }
}
