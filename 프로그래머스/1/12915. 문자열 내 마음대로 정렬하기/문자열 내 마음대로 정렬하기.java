class Solution {
  public String[] solution(String[] strings, int n) {

      for(int i=0; i<strings.length-1; i++){
          for(int j=i+1; j<strings.length; j++){
              if(strings[i].charAt(n)>strings[j].charAt(n)){ 
                  String tmp = strings[i];
                  strings[i]= strings[j];
                  strings[j]=tmp;
              }
              // 같은 문자열일 경우
              else if(strings[i].charAt(n)==strings[j].charAt(n)){
                  if(strings[i].compareTo(strings[j]) >0){ 
                      String tmp = strings[i];
                      strings[i]= strings[j];
                      strings[j]=tmp;
                  }
              }
          }
      }
      return strings;
  }
}

// compareTo
// 두 문자열이 동일한 경우에는 0을 반환
// 첫 번째 문자열이 두 번째 문자열보다 사전 순으로 앞에 올 경우, 양수를 반환
// 첫 번째 문자열이 두 번째 문자열보다 사전 순으로 뒤에 올 경우, 음수를 반환