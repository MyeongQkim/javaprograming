//이미지 파일 복사 후 복사된 파일이 저장된 Path, 파일명 을 출력하는 프로그램을 작성하시오 
import java.io.*;

public class imagecopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File( "C:\\Users\\zzkim\\Desktop\\antelopecanyon.jpg"); // 복사 할 파일의 경로와 파일명 객체 생성
		File dest = new File("c:\\Users\\zzkim\\Desktop\\tmp\\desert.jpg"); // 복사된 파일의 경로와 파일명 객체 생성
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // 파일 인풋 스트림에 연결
			FileOutputStream fo = new FileOutputStream(dest);// 파일 아우풋 스트림에 연결
			while((c = fi.read()) != -1) { // fi 파일을 1바이트씩 읽으며 하나씩 fo 파일에 씀
				fo.write((byte)c);
				}
			fi.close();
			fo.close();
			System.out.println( "파일이 저장된 Path : " + dest.getPath()); // 복사된 파일의 경로와 파일명 출력
			System.out.println( "저장된 파일명  : " + dest.getName());
			
			
			} catch (IOException e) {
				System.out.println("파일 복사 오류");
			}

	}

}
