package backjoon;

import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2{
    static List<Character> input;
    static List<Bracket> brackets;
    static List<Integer> bracketIndex;
    public static void main(String[] args) throws IOException {
        problem(new InputStreamReader(System.in));
    }

    public static void problem(InputStreamReader isr) throws IOException {
        BufferedReader br = new BufferedReader(isr);
        Stack<Integer> stack = new Stack<>();
        brackets = new ArrayList<>();
        input = new ArrayList<>();
        int num = 0;
        for(Character ch:br.readLine().toCharArray()){
            input.add(ch);
            if(ch == '('){
                stack.add(num);
            }else if(ch==')'){
                brackets.add(new Bracket(stack.pop(),num));
            }
            num++;
        }
        int n = brackets.size();
        for (int i = n-1; i >= 0; i--) {
            backTracking(new boolean[n],0,n,n-i);
        }

    }
    static void backTracking(boolean[] visited, int start, int n, int r){
        if(r==0){
            bracketIndex = bracketList(visited);
            print();
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            backTracking(visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    static List<Integer> bracketList(boolean[] visited){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]){
                newList.add(brackets.get(i).front);
                newList.add(brackets.get(i).back);
            }
        }
        return newList;
    }
    static void print(){
        for (int i = 0; i < input.size(); i++) {
            if(!bracketIndex.contains(i)){
                System.out.print(input.get(i));
            }
        }
        System.out.println();
    }

    static class Bracket {
        private final int front;
        private final int back;

        public Bracket(int front, int back) {
            this.front = front;
            this.back = back;
        }
        public boolean contains(final int i){
            return front==i||back==i;
        }
    }

}

