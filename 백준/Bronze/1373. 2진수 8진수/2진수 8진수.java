import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        //2진수를 8진수로 바뀔 수 있도록 0을 추가합니다.
        if(input.length()%3!=0)
            for(int i=0;i<input.length()%3;i++)
                input = "0" + input;
        //2진수를 8진수로 변경하여 StringBuilder에 저장합니다.
        for(int i=0;i<input.length();i+=3){
            sb.append( Character.getNumericValue(input.charAt(i+2)) + 
            Character.getNumericValue(input.charAt(i+1)) * 2
                    +Character.getNumericValue(input.charAt(i)) * 4);
        }
        bw.write(sb.toString());	//8진수 BufferedWriter 저장
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}