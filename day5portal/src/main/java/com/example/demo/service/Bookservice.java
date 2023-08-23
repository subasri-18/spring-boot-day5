package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookentity;
import com.example.demo.repository.Bookrepo;

@Service

public class Bookservice {
	@Autowired
	Bookrepo sr;
	public Bookentity saveinfo(Bookentity ss)
	{
		return sr.save(ss);
	}
    public List<Bookentity> savedetails(List<Bookentity> ss)
    {
    	return (List<Bookentity>)sr.saveAll(ss);
    }
	public List<Bookentity> showinfo()
	{
		return sr.findAll();
	}
	public Bookentity changeinfo(Bookentity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Bookentity ss)
	{
		sr.delete(ss);
	}

	

	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
}
