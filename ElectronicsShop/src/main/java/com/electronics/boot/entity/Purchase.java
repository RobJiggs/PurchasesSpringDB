/**
 * 
 */
package com.electronics.boot.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 24, 2022
 */
@Entity
@Table(name="Purchases")
public class Purchase {
	 @Id
	 private int id;
	 private String productname;
	 private double cost; 
	 private Date date_of_purchase;
	 private Date delivery_date;
	 private String customer_feedback;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the productname
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * @param productname the productname to set
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the date_of_purchase
	 */
	public Date getDate_of_purchase() {
		return date_of_purchase;
	}
	/**
	 * @param date_of_purchase the date_of_purchase to set
	 */
	public void setDate_of_purchase(Date date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
	/**
	 * @return the delivery_date
	 */
	public Date getDelivery_date() {
		return delivery_date;
	}
	/**
	 * @param delivery_date the delivery_date to set
	 */
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	/**
	 * @return the customer_feedback
	 */
	public String getCustomer_feedback() {
		return customer_feedback;
	}
	/**
	 * @param customer_feedback the customer_feedback to set
	 */
	public void setCustomer_feedback(String customer_feedback) {
		this.customer_feedback = customer_feedback;
	}
	/**
	 * @param id
	 * @param productname
	 * @param cost
	 * @param date_of_purchase
	 * @param delivery_date
	 * @param customer_feedback
	 */
	public Purchase(int id, String productname, double cost, Date date_of_purchase, Date delivery_date,
			String customer_feedback) {
		super();
		this.id = id;
		this.productname = productname;
		this.cost = cost;
		this.date_of_purchase = date_of_purchase;
		this.delivery_date = delivery_date;
		this.customer_feedback = customer_feedback;
	}
	/**
	 * 
	 */
	public Purchase() {
		super();
	}
	 
	 


}
