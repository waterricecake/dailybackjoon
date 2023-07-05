package backjoon;

import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D230704_1759 {
    static int L;
    static int C;
    static String[] letters;
    static final String gather = "aeiou";
    public static void main(String[] args) throws IOException {
        problem(new InputStreamReader(System.in));
    }

    public static void problem(InputStreamReader isr) throws IOException {
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        letters = br.readLine().split(" ");
        Arrays.sort(letters);
        backtracking("",-1,0,0,0);
    }
    public static void backtracking(String output, int index, int depth, int gatherCnt, int consonant){
        if(depth==L){
            if(gatherCnt>=1&&consonant>=2){
                System.out.println(output);
            }
            return;
        }
        if(index == C){
            return;
        }
        for (int i = index+1; i <C ; i++) {
            if(gather.contains(letters[i])){
                backtracking(output+letters[i],i,depth+1,gatherCnt+1,consonant);
            }else {
                backtracking(output+letters[i],i,depth+1,gatherCnt,consonant+1);
            }
        }
    }
}
