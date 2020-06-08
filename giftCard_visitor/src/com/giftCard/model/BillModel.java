package com.giftCard.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "bill_info")
public class BillModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column
	private String billTitle;

	@Column
	private String category;

	@Column
	private double amount;

	@Column
	private Date dateOfEntry;

	@Column
	private Date dueDate;

	@Column
	private String paid;

	@Column
	private String unpaid;

	public BillModel() {
	}

	public BillModel(String id, String billTitle, String category, double amount, Date dateOfEntry, Date dueDate,
			String paid, String unpaid) {

		super();
		this.id = id;
		this.billTitle = billTitle;
		this.category = category;
		this.amount = amount;
		this.dateOfEntry = dateOfEntry;
		this.dueDate = dueDate;
		this.paid = paid;
		this.unpaid = unpaid;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBillTitle() {
		return billTitle;
	}

	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(Date dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getUnpaid() {
		return unpaid;
	}

	public void setUnpaid(String unpaid) {
		this.unpaid = unpaid;
	}

	@Override
	public String toString() {
		return "BillModel [id=" + id + ", billTitle=" + billTitle + ", category=" + category + ", amount=" + amount
				+ ", dateOfEntry=" + dateOfEntry + ", dueDate=" + dueDate + ", paid=" + paid + ", unpaid=" + unpaid
				+ "]";
	}
	
	

}
