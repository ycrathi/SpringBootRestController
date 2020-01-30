package com.example.demo;

public class ModelClass {

	private String id;
	private String f_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	private String l_name;
	@Override
	public String toString() {
		return "ModelClass [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + "]";
	}
}
