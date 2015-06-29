package jp.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Member {

	@Id
//	@Size(min=4, max=6, message="error!")
	@Pattern(regexp="\\d{4,6}", message="id��4,6�Ԃ̐���")
	private String id;
	
	@NotNull
	@Size(min=4, max=20, message="4~20�����ŕ\�L")
	private String name;
	@NotNull
	@Size(min=4, max=20, message="4~20�����ŕ\�L")
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
