package com.HelpingSanta.Model;


import java.util.Arrays;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hoodfiller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private long hoodcapacity;
	
	
	
	private int[] presentweights;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public long getHoodcapacity() {
		return hoodcapacity;
	}
	public void setHoodcapacity(long hoodcapacity) {
		this.hoodcapacity = hoodcapacity;
	}
	public int[] getPresentweights() {
		return presentweights;
	}
	public void setPresentweights(int[] presentweights) {
		this.presentweights = presentweights;
	}
	public Hoodfiller() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hoodfiller [id=" + id + ", hoodcapacity=" + hoodcapacity + ", presentweights="
				+ Arrays.toString(presentweights) + "]";
	}
	
	
	
	
}
