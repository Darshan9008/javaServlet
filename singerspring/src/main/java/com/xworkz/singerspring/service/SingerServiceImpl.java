package com.xworkz.singerspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.singerspring.dto.SingerDTO;
import com.xworkz.singerspring.repository.SingerRepository;

@Service
public class SingerServiceImpl implements SingerService{
	
	@Autowired
	private SingerRepository repo;
	
	public SingerServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created singerService impl");
	}
	@Override
	public boolean validateAndSave(SingerDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("invoking validate and save");
		System.out.println("dto is"+dto);
		this.repo.save(dto);
		return true;
		
	}

}
