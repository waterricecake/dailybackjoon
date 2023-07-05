package backjoon;

import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D230630_6603_Lotto{
    static int K;
    static int[] S;
    public static void main(String[] args) throws IOException {
        problem(new InputStreamReader(System.in));
    }

    public static void problem(InputStreamReader isr) throws IOException {
        BufferedReader br = new BufferedReader(isr);
        setKS(new StringTokenizer(br.readLine()));
        backtracking(new int[6],-1,0);
        while(true){
            setKS(new StringTokenizer(br.readLine()));
            if(K==0){
                break;
            }else {
                System.out.println();
            }
            backtracking(new int[6],-1,0);
        }
    }
    private static void setKS(StringTokenizer st){
        K = Integer.parseInt(st.nextToken());
        S = new int[K];
        for (int i = 0; i <K; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
    }
    private static void backtracking(int[] subset, int index, int depth){
        if(depth ==6){
            System.out.print(subset[0]);
            for (int i = 1; i < 6; i++) {
                System.out.print(" "+subset[i]);
            }
            System.out.println();
            return;
        }
        if(index == K){
            return;
        }
        for (int i = index+1; i < K; i++) {
            subset[depth] = S[i];
            backtracking(subset,i,depth+1);
        }
    }
}

