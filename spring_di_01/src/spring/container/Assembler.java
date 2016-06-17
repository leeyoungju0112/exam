package spring.container;

import spring.dao.Dao;
import spring.dao.JdbcDaoImpl;
import spring.dao.MybatisDaoImpl;
import spring.service.Service;
import spring.service.ServiceImpl;

//public class DaoAssembler {  //~

public class Assembler { 
	
/*	public Dao getBean(){
		//return new MybatisDaoImpl();
		return new JdbcDaoImpl();		//~
*/	
	public Service getBean(){
		Dao dao = new JdbcDaoImpl(); //여기만 MybatisDaoImpl에서 JdbcDaoImpl 로 바꿔주면됨* 
		Service service = new ServiceImpl(dao);
		return service;
		
	}
}
