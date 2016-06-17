package spring.service;

import spring.dao.Dao;

public class ServiceImpl implements Service {
	private Dao dao;
	
	public  ServiceImpl(Dao dao){
		this.dao = dao;
	}
	
	

	public void register(){
		System.out.println("----------등록작업시작-----------");
		dao.select();
		dao.insert();
		System.out.println("----------등록작업시작-----------");
	}
}
