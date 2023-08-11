package org.example.LeetCode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class P841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 첫 번째 방을 스택에 추가

        while (!stack.isEmpty()) {
            int room = stack.pop();
            visited[room] = true; // 방문 처리
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    stack.push(key); // 열쇠를 스택에 추가
                }
            }
        }

        // 모든 방을 방문했는지 확인
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P841 p = new P841();
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room0Keys = new ArrayList<>();
        List<Integer> room1Keys = new ArrayList<>();
        List<Integer> room2Keys = new ArrayList<>();
        // List<Integer> room3Keys = new ArrayList<>();

        // room0Keys.add(1); room0Keys.add(3);
        // room1Keys.add(3); room1Keys.add(0); room1Keys.add(1);
        // room2Keys.add(2);
        // room3Keys.add(0);

        room0Keys.add(1);
        room1Keys.add(2);
        room2Keys.add(3);

        rooms.add(room0Keys); rooms.add(room1Keys); rooms.add(room2Keys); /*rooms.add(room3Keys);*/
        p.canVisitAllRooms(rooms);
    }
}
