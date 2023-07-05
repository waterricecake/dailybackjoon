package backjoon;

import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day1{
    static int N;
    static int M;
    static List<String> output;
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
        output = new ArrayList<>();
        backTracking(new boolean[N+1],0,new int[M],0);

    }
    private static void backTracking(boolean[] visited,int index,int[] subset,int size){
        if(size ==M){
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
        for (int i: decision) {
            if(!visited[i]){
                visited[i] = true;
                subset[size] = i;
                backTracking(visited,index+1,subset,size+1);
                visited[i] = false;
            }

        }
    }
}

