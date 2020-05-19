import java.util.*;
public class FindAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] wordarr; 
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("입력 :");
		
		String word = sc.nextLine();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		wordarr = word.toCharArray();
		
		for (int i = 0 ; i < wordarr.length; i++) {
			
			if (map.containsKey(wordarr[i])) {
				map.put(wordarr[i],map.get(wordarr[i])+1);
			}else 
				map.put(wordarr[i],1);
		} // char 인 알파벳을 hashmap에 저장
		
		int maxValue = 1 ;
		int samekey =0;
		char maxChar =0;
		Set <Character> keys = map.keySet();
		Iterator<Character> it = keys.iterator();
		
		while(it.hasNext()) {
			char alpha = it.next();
			int value = map.get(alpha);
			if(value >1) {
				maxValue = value;
				maxChar = alpha;
			}
		} // 최대값 찾기
		
		if (maxValue == 1) {
			System.out.println("출력 : 가장 많이 사용된 char이 없습니다.");
		}
		else 
			System.out.println("출력 : 가장 많이 사용된 char는"+maxChar+"입니다.");
		}
	}

}
