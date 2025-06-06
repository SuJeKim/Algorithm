import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int[] data = new int[N];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
 
 
		for(int i = 0; i < N; i++) {
			
			/*
			 * 스택이 비어있지 않으면서 
			 * 현재 원소가 스택의 맨 위 인덱스가 가리키는 원소보다 큰 경우
			 * 해당 조건을 만족할 때 까지 stack의 원소를 pop하면서
			 * 해당 인덱스의 값을 현재 원소(i)로 바꿔준다. 
			 */
			while(!stack.isEmpty() && data[stack.peek()] < data[i]) {
				data[stack.pop()] = data[i];
			}
			
			stack.push(i);
		}
		
		/*
		 * 스택의 모든 원소를 pop하면서 해당 인덱스의 값을
		 * -1로 초기화한다.
		 */
		while(!stack.isEmpty()) {
			data[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(data[i]).append(' ');
		}
		
		System.out.println(sb);
	}
}