package com.example.mysql.rental.projection;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.example.mysql.model.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;

public interface RentalProjn {
	
	public CustomerProjn getCustomer();
	
	interface CustomerProjn{
		public int getCustomerId();
		public byte getActive();
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
		public Date getCreateDate();
		public String getFirstName();
		public String getLastName();
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
		public Timestamp getLastUpdate();
		public List<Payment> getPayments();
	}
}
