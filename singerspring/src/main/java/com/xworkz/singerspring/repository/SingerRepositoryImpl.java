package com.xworkz.singerspring.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.singerspring.dto.SingerDTO;

@Repository
public class SingerRepositoryImpl implements SingerRepository {
	
	
	public SingerRepositoryImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("invoking SingerRepositoryImpl");
	}

	@Override
	public void save(SingerDTO dto) {
		// TODO Auto-generated method stub
		
		System.out.println("invoking save in SingerRepositoryImpl ");
		System.out.println("dto is passed :"+dto);
		
	}
	
	
	
	

}
