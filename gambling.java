import java.util.Scanner;
import java.lang.Math;



public class gambling {

	public static void main(String[] args) {
		
		
		person player1 = new person();
		person player2 = new person();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		int num = sc.nextInt();
		person[] player = new person[num];
		for(int i=0; i<num; i++) {
			player[i] = new person();
			System.out.print((i+1)+"��° ���� �̸�>>");
			player[i].name = sc.next();
			
		}
		 
		while(true) {
			
			for (int i = 0 ; i<num; i++) {
			
				if (player[i].playgame()==1) {
					System.out.print("  "+player[i].name+"���� �̰���ϴ�!");
					
					return;
				}else System.out.print("   �ƽ�����!\n");
			}	
		}	
	}

}


class person {
	
	public String name;
	public String name2;
	public int winner, num1, num2, num3;
	public String enter;
	
	
	public person() {
		//this.name= name;
	}
	
	
	public int playgame() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("["+name+"] : <Enter>");
		enter = sc2.nextLine();
		
		num1 = (int)((Math.random()*3)+1);
		num2 = (int)((Math.random()*3)+1);
		num3 = (int)((Math.random()*3)+1);
		
		System.out.print(num1+"   "+num2+"   "+num3);
		
		if(num1==num2&&num2==num3&&num3==num1) {
			return winner=1 ;
		}else return 0;
		
	}
	
	
}
