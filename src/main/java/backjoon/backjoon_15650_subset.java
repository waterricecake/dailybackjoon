package backjoon;

import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class backjoon_15650_subset{
    static int N;
    static int M;
    static int[] decision;
    public static void main(String[] args) throws IOException {
        problem(new InputStreamReader(System.in));
    }

    public static void problem(InputStreamReader isr) throws IOException {
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        decision = IntStream.rangeClosed(1,N).toArray();
        int[] subset = new int[M];
        backtracking(subset,0,0);
    }

    private static void backtracking(int[] subset, int index, int depth){
        if(depth ==M){
            System.out.print(subset[0]);
            for (int i = 1; i < M; i++) {
                System.out.print(" "+subset[i]);
            }
            System.out.println();
            return;
        }
        if(index == N){
            return;
        }
        for (int i = index+1; i < N+1; i++) {
            subset[depth] = i;
            backtracking(subset,i,depth+1);
        }
    }
}

