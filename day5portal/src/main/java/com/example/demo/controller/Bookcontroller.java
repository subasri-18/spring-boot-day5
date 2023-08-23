package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bookentity;
import com.example.demo.service.Bookservice;

@RestController

public class Bookcontroller {
	@Autowired
	Bookservice sser;
	@PostMapping("addbook")
	public Bookentity addndetails(@RequestBody Bookentity ss)
	{
		return sser.saveinfo(ss);
		
		
	}
	@PostMapping("addnbook")
	public List<Bookentity> addndetails(@RequestBody List<Bookentity> ss)
	{
		return sser.savedetails(ss);
		
		
	}
	@GetMapping("showbook")
	public List<Bookentity> show()
	{
		return sser.showinfo();
	}
	@PutMapping("updatebook")
	public Bookentity modify(@RequestBody Bookentity ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletebook")
	public String del(@RequestBody Bookentity ss)
	{
		sser.deleteinfo(ss);
		return"deleted successfully";
	}
	
	@DeleteMapping("delparabook")
	public void my(@RequestParam int id)
	{
		sser.deletepid(id);
		
	}
		
	


	

}
