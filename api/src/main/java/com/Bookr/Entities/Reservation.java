/**
 * 
 */
package com.Bookr.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.Bookr.Utilities.DateAndTimeDeserialize;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Ayodeji Tolu-ojo 300249754
 * Gahyun Lee 300289068 Modified
 */

@Entity
@Table(name="reservations")
public class Reservation {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="room_id")
	@NotNull
	private Integer _room_id;
	
	@Column(name="user_id")
	private Integer _user_id;
	
	@NotNull
	@Column(name="start_date")
	private String _start_date;
	
	@NotNull
	@Column(name="end_date")
	private String _end_date;
	
	@NotEmpty
	@Column(name="reservation_number")
	private String _res_number;
	
	
	@NotEmpty
	@Column(name="event_title")
	private String _event_title;

	/**
	 * @return the _event_title
	 */
	public String get_event_title() {
		return _event_title;
	}

	/**
	 * @param _event_title the _event_title to set
	 */
	public void set_event_title(String _event_title) {
		this._event_title = _event_title;
	}

	/**
	 * @return the _user_id
	 */
	public Integer get_user_id() {
		return _user_id;
	}

	/**
	 * @param _user_id the _user_id to set
	 */
	public void set_user_id(Integer _user_id) {
		this._user_id = _user_id;
	}
	
	/**
	 * @return the _room_id
	 */
	public Integer get_room_id() {
		return _room_id;
	}

	/**
	 * @param _room_id the _room_id to set
	 */
	public void set_room_id(Integer _room_id) {
		this._room_id = _room_id;
	}

	/**
	 * @return the _start_date
	 */
	public String get_start_date() {
		return _start_date;
	}

	/**
	 * @param _start_date the _start_date to set
	 */
	public void set_start_date(String _start_date) {
		this._start_date = _start_date;
	}

	/**
	 * @return the _end_date
	 */
	public String get_end_date() {
		return _end_date;
	}

	/**
	 * @param _end_date the _end_date to set
	 */
	public void set_end_date(String _end_date) {
		this._end_date = _end_date;
	}

	/**
	 * @return the _res_number
	 */
	public String get_res_number() {
		return _res_number;
	}

	/**
	 * @param _res_number the _res_number to set
	 */
	public void set_res_number(String _res_number) {
		this._res_number = _res_number;
	}

	/**
	 * @return the _id
	 */
	public Integer get_id() {
		return id;
	}

	public Reservation() {
		
	}
}
