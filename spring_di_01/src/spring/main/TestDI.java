package spring.main;

import spring.container.Assembler;
import spring.service.Service;

public class TestDI {

	public static void main(String[] args) {
//		DaoAssembler container = new DaoAssembler(); //컨테이너 객체 생성 //~
		Assembler container = new Assembler();
		
/*		Dao dao = container.getBean(); //필요한 Component(Bean) 조회
		Service service = new ServiceImpl(dao);*/ //~
		
		Service service = container.getBean();
		service.register();
		
	}
}
