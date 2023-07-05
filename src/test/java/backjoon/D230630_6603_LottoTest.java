package backjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class D230630_6603_LottoTest extends TestcaseInput{
    @Test
    void testcase3(){
        setTestCase("7 1 2 3 4 5 6 7\n" +
                        "8 1 2 3 5 8 13 21 34\n" +
                        "0",
                "1 2 3 4 5 6\n" +
                        "1 2 3 4 5 7\n" +
                        "1 2 3 4 6 7\n" +
                        "1 2 3 5 6 7\n" +
                        "1 2 4 5 6 7\n" +
                        "1 3 4 5 6 7\n" +
                        "2 3 4 5 6 7\n" +
                        "\n" +
                        "1 2 3 5 8 13\n" +
                        "1 2 3 5 8 21\n" +
                        "1 2 3 5 8 34\n" +
                        "1 2 3 5 13 21\n" +
                        "1 2 3 5 13 34\n" +
                        "1 2 3 5 21 34\n" +
                        "1 2 3 8 13 21\n" +
                        "1 2 3 8 13 34\n" +
                        "1 2 3 8 21 34\n" +
                        "1 2 3 13 21 34\n" +
                        "1 2 5 8 13 21\n" +
                        "1 2 5 8 13 34\n" +
                        "1 2 5 8 21 34\n" +
                        "1 2 5 13 21 34\n" +
                        "1 2 8 13 21 34\n" +
                        "1 3 5 8 13 21\n" +
                        "1 3 5 8 13 34\n" +
                        "1 3 5 8 21 34\n" +
                        "1 3 5 13 21 34\n" +
                        "1 3 8 13 21 34\n" +
                        "1 5 8 13 21 34\n" +
                        "2 3 5 8 13 21\n" +
                        "2 3 5 8 13 34\n" +
                        "2 3 5 8 21 34\n" +
                        "2 3 5 13 21 34\n" +
                        "2 3 8 13 21 34\n" +
                        "2 5 8 13 21 34\n" +
                        "3 5 8 13 21 34");
    }
    @AfterEach
    void testCase() throws IOException {
        D230630_6603_Lotto.problem(readString());
        validateResult();
    }
}
