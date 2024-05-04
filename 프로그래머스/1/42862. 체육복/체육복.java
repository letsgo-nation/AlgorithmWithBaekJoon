class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];

        // Initialize students array
        for (int i = 0; i < n; i++) {
            students[i] = 1; // Everyone starts with one shirt
        }

        // Remove lost students' shirts
        for (int l : lost) {
            students[l - 1]--;
        }

        // Add extra shirts to students
        for (int r : reserve) {
            students[r - 1]++;
        }

        // Distribute shirts
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) { // If a student lost a shirt
                if (i - 1 >= 0 && students[i - 1] == 2) { // If the previous student has an extra shirt
                    students[i]++;
                    students[i - 1]--;
                } else if (i + 1 < n && students[i + 1] == 2) { // If the next student has an extra shirt
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        // Count students who have at least one shirt
        int count = 0;
        for (int s : students) {
            if (s > 0) {
                count++;
            }
        }
        return count;
    }
}