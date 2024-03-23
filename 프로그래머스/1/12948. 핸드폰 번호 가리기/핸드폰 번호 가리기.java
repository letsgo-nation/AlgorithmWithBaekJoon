class Solution {
    public String solution(String phone_number) {
        char[] phoneNumberChars = phone_number.toCharArray();
        StringBuilder hiddenPhoneNumber = new StringBuilder();

        // 뒷 4자리를 제외한 나머지 숫자를 '*'로 대체
        for (int i = 0; i < phoneNumberChars.length - 4; i++) {
            hiddenPhoneNumber.append("*");
        }

        // 뒷 4자리를 그대로 추가
        for (int i = phoneNumberChars.length - 4; i < phoneNumberChars.length; i++) {
            hiddenPhoneNumber.append(phoneNumberChars[i]);
        }

        return hiddenPhoneNumber.toString();
    }
}

// 소요시간 : 1시간 40분