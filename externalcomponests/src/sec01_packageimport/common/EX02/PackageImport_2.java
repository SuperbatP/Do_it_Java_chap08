package sec01_packageimport.common.EX02;
//다른 패키지에 있는 클래스를 가져와 활용하는 방법 import
import sec01_packageimport.common.A;//또는 sec01_packageimport.common.*


public class PackageImport_2 {
	public static void main(String[] args) {
		//객체 생성
	A a= new A();//ctrl+shift+o 단축키 누르면 자동 임포트(오류가 날 때)
	//멤버활용 메소드호출
	System.out.println(a.m);
	System.out.println(a.n);
	a.print();}
	
}
