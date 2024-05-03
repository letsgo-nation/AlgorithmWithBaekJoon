class Solution {
    public int[] solution(int[] numbers) {
        int index = 0;
        for(int value: numbers) {
            numbers[index++] = value*2;
        } 
        return numbers;
    }
}