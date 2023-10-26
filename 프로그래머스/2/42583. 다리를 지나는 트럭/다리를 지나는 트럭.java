import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> onBridge = new LinkedList<>(); // 다리 위에 올라간 트럭을 나타내는 큐
        int time = 0; // 경과 시간
        int currentWeight = 0; // 현재 다리 위에 올라간 트럭의 무게 합
        int truckIndex = 0; // 다음에 다리에 오를 트럭을 가리키는 인덱스

        while (true) {
            time++; // 시간 증가

            // 다리 위에 있는 트럭이 다리 길이와 같으면 다리를 지나서 나감
            if (onBridge.size() == bridge_length) {
                currentWeight -= onBridge.poll();
            }

            // 다음 트럭이 다리에 오를 수 있으면 올림
            if (truckIndex < truck_weights.length && currentWeight + truck_weights[truckIndex] <= weight) {
                onBridge.offer(truck_weights[truckIndex]);
                currentWeight += truck_weights[truckIndex];
                truckIndex++;
            } else {
                // 다음 트럭이 못 올라가면 빈 자리로 표시
                onBridge.offer(0);
            }

            // 모든 트럭이 다리를 지났으면 반복 종료
            if (truckIndex == truck_weights.length) {
                time += bridge_length;
                break;
            }
        }

        return time;
    }
}
