import java.util.*;
public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		map.put("Ȳ����",new Student (1,"010-111-1111"));
		map.put("���繮",new Student (2,"010-222-2222"));
		map.put("�賲��",new Student (3,"010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student student = map.get(name);
			if (student == null) {
				System.out.print(name +"�� ���� ����Դϴ�.");
			}else System.out.println("id : "+ student.id+",��ȭ :"+student.tel);
			
		}
		scanner.close();
	}

}

class Student {
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;this.tel = tel;
	}
}
