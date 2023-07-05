package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class backjoon_9663_NQUEEN{
    static int N;
    static int result;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        problem(new InputStreamReader(System.in));
    }

    public static void problem(InputStreamReader isr) throws IOException {
        BufferedReader br = new BufferedReader(isr);
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        result= 0;
        backtracking(0);
        System.out.println(result);
    }

    static void backtracking(int n){
        if(n==N){
            result++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[n] = i;
            if (can(n)) {
                backtracking(n+1);
            }
        }
    }
    static boolean can(int col){
        for (int i = 0; i < col; i++) {
            if(arr[i] == arr[col]){
                return false;
            }
            if(Math.abs(arr[col]-arr[i]) == Math.abs(i-col)){
                return false;
            }
        }
        return true;
    }
}
