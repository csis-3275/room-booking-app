/**
 * 
 */
package com.Bookr.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Ayodeji Tolu-ojo 300249754
 *
 */

@Entity
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(targetEntity=Reservation.class,cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@NotNull
	@JsonIgnore
	@JoinColumn(name="user_id", referencedColumnName="id")
	private List<Reservation> _reservations;
	
	@Column(name="role_id")
	@NotNull
	private Integer _role_id;
	
	@Column(name="firstname")
	@NotBlank(message="firstname cannot be blank")
	private String _firstname;
	
	@Column(name="lastname")
	@NotBlank(message="lastname cannot be blank")
	private String _lastname;
	
	@Column(name="email")
	@NotBlank(message="email cannot be blank")
	private String _email;
	
	
	/**
	 * @void add new reservation to _reservations
	 * @param reserve
	 * 
	 */
	public void add_reservations(Reservation reserve)
	{
		this._reservations.add(reserve);
	}
	
	/**
	 * @return _reservations
	 * @param reserve
	 * 
	 */
	public Object[] get_reservations()
	{
		return this._reservations.toArray();
	}
	
	/**
	 * @return the _role
	 */
	public Integer get_role() {
		return _role_id;
	}

	/**
	 * @param _role the _role to set
	 */
	public void set_role(Integer _role_id) {
		this._role_id = _role_id;
	}

	/**
	 * @return the _firstname
	 */
	public String get_firstname() {
		return _firstname;
	}

	/**
	 * @param _firstname the _firstname to set
	 */
	public void set_firstname(String _firstname) {
		this._firstname = _firstname;
	}

	/**
	 * @return the _lastname
	 */
	public String get_lastname() {
		return _lastname;
	}

	/**
	 * @param _lastname the _lastname to set
	 */
	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}

	/**
	 * @return the _email
	 */
	public String get_email() {
		return _email;
	}

	/**
	 * @param _email the _email to set
	 */
	public void set_email(String _email) {
		this._email = _email;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
}
