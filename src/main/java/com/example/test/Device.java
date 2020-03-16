package com.example.test;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
@Entity
public class Device 
{

	@Id
	public String id;

	public String deviceName;
	public String deviceDesc;
	public String deviceVersion;

	public Device() {}

	public Device(String devName,String devDesc, String devV)
		{
				this.deviceName=devName;
				this.deviceDesc=devDesc;
				this.deviceVersion=devV;
		}


}
