package br.com.mangani;

public class ContactBean {
	
	private int idContact;
	private int idPerson;
	private String ddd;
	private String phone;
	private final PersonBean person;
	
	public ContactBean(PersonBean person) {
		super();
		this.person = person;
	}
	public int getIdContact() {
		return idContact;
	}
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	public int getIdPerson() {
		this.idPerson = this.person == null ? 0 : this.person.getIdPerson();
		return idPerson;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public PersonBean getPerson() {
		return person;
	}
}