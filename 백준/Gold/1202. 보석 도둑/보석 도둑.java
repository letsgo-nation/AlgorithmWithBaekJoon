import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Jewel {
    int weight;
    int price;

    public Jewel(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 보석 개수
        int K = Integer.parseInt(st.nextToken()); // 가방 개수

        // 보석 무게와 가격 저장
        ArrayList<Jewel> jewels = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            jewels.add(new Jewel(weight, price));
        }

        Collections.sort(jewels, (o1, o2) -> o1.weight - o2.weight); // 무게 순서대로 오름차순 정렬

        int[] sortWeight = new int[K];
        for(int i = 0; i < K; i++) {
            sortWeight[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(sortWeight); // 가방에 담을 수 있는 무게를 입력 받은 후 오름차순 정렬

        long result = 0;
        int jewelsIndex = 0;
        PriorityQueue<Jewel> jewelsInBag = new PriorityQueue<>((o1, o2) -> o2.price - o1.price); // 가격 순서대로 내림차순 정렬
        
        for(int i = 0; i < K; i++) {
            // 현재 가방이 담을 수 있는 최대 무게보다 작거나 같은 무게를 가진 보석을 우선순위 큐에 담기
            while(jewelsIndex < N && jewels.get(jewelsIndex).weight <= sortWeight[i]) {
                Jewel currentJewel = jewels.get(jewelsIndex++);
                jewelsInBag.add(new Jewel(currentJewel.weight, currentJewel.price));
            }
            // 우선순위 큐에서 꺼낸 보석 중에서 최대 가격(첫 번째 값)을 선택하여 누적
            if(!jewelsInBag.isEmpty()) result += jewelsInBag.poll().price;
        }
        System.out.println(result);
    }

}
