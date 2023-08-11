package org.example.LeetCode75;

import java.util.Stack;

public class P547 {

    /**
     * There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
     *
     * A province is a group of directly or indirectly connected cities and no other cities outside of the group.
     *
     * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
     *
     * Return the total number of provinces.
     */
    public int findCircleNum(int[][] isConnected) {
        Stack<Integer> stack = new Stack<>(); // 스택에 도시의 인덱스 저장

        int[] visited = new int[isConnected.length]; // 방문도시를 배열로 저장
        int result = 0;

        for (int startCity = 0; startCity < isConnected.length; startCity++) {
            if (visited[startCity] == 0) {
                stack.push(startCity); // 탐색하려는 도시 stack에 삽입
                visited[startCity] = 1; // 방문처리

                while (!stack.isEmpty()) { // 해당 도시에 대한 탐색
                    int city = stack.pop();
                    for (int connectedCity = 0; connectedCity < isConnected[city].length; connectedCity++) {
                        if (isConnected[city][connectedCity] == 1 && visited[connectedCity] == 0) {
                            stack.push(connectedCity);
                            visited[connectedCity] = 1;
                        }
                    }
                }

                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P547 p = new P547();
        int [][] isConnected = {{1,1,0}, {1,1,0},{0,0,1}};
        // int [][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
        p.findCircleNum(isConnected);
    }
}
