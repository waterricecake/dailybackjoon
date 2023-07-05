package backjoon;

import org.assertj.core.api.Assertions;


import java.io.*;

public class TestcaseInput {
    protected String testcase;
    protected String result;
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    protected void setTestCase(final String testcase,final String result){
        this.testcase = testcase;
        this.result = result;
        System.setOut(new PrintStream(outputStream));
    }
    protected InputStreamReader readString(){
        validate();
        return new InputStreamReader(new ByteArrayInputStream(testcase.getBytes()));
    }
    protected void validateResult(){
        Assertions.assertThat(outputStream.toString()).isEqualTo(result+"\n");
    }
    private void validate(){
        if(testcase.isEmpty() || result.isEmpty()){
            throw new IllegalArgumentException("testcase가 설정되지 않았습니다.");
        }
    }
}
