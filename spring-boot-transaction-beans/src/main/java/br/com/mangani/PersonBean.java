package br.com.mangani;

import java.util.List;

public class PersonBean {
	
	private int idPerson;
	private String name;
	private List<ContactBean> contacts;
	
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ContactBean> getContacts() {
		return contacts;
	}
	public void setContacts(List<ContactBean> contacts) {
		this.contacts = contacts;
	}
}