//�̹��� ���� ���� �� ����� ������ ����� Path, ���ϸ� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ� 
import java.io.*;

public class imagecopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File( "C:\\Users\\zzkim\\Desktop\\antelopecanyon.jpg"); // ���� �� ������ ��ο� ���ϸ� ��ü ����
		File dest = new File("c:\\Users\\zzkim\\Desktop\\tmp\\desert.jpg"); // ����� ������ ��ο� ���ϸ� ��ü ����
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // ���� ��ǲ ��Ʈ���� ����
			FileOutputStream fo = new FileOutputStream(dest);// ���� �ƿ�ǲ ��Ʈ���� ����
			while((c = fi.read()) != -1) { // fi ������ 1����Ʈ�� ������ �ϳ��� fo ���Ͽ� ��
				fo.write((byte)c);
				}
			fi.close();
			fo.close();
			System.out.println( "������ ����� Path : " + dest.getPath()); // ����� ������ ��ο� ���ϸ� ���
			System.out.println( "����� ���ϸ�  : " + dest.getName());
			
			
			} catch (IOException e) {
				System.out.println("���� ���� ����");
			}

	}

}
