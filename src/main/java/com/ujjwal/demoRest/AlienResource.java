package com.ujjwal.demoRest;


import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("aliens")
	public class AlienResource
	{
	AlienRespository repo = new AlienRespository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien()
	{
		System.out.println("get Alien called");
		/*Alien a1 = new Alien();
		a1.setName("ujjwal");
		a1.setId(11);
		a1.setPoints(100);
		
		Alien a2 = new Alien();
		a1.setName("sunny");
		a1.setId(131); 
		a1.setPoints(1040);*/
		
		//List<Alien> aliens = Arrays.asList(a1,a2);
		
		return repo.getAliens();
	}
	
	/*AlienRespository repo = new AlienRespository();
		
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Alien> getAliens()
		{
			System.out.println("in main");
			return repo.getAliens();
		}
	
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int id)
		{
return repo.getAlien(id);
		}
	
	*/
	@Produces(MediaType.APPLICATION_XML)
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien CreateAlien(Alien a1)
	{
		System.out.println(a1);
		repo.create(a1);
		return a1;
	}
	/*
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien updateAlien(Alien a1)
	{
		System.out.println(a1);
		if(repo.getAlien(a1.getId()).getId()==0)
		{
		repo.create(a1);	
		}
		else
		{
		repo.update(a1);
		}
		return a1;
	}
	
	
	@DELETE
	@Path("alien/{id}")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien killAlien(@PathParam("id")int id)
	{
		Alien a = repo.getAlien(id);
		System.out.println(a);
		if(a.getId()!=0)
		{
		repo.kill(id);
		}
		return a;
	}*/
	
	}


