package com.Mobi.Sacco.MobiSacco.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HBRDBAL")
public class Account {
	@Id
	@Column(name="ACCNO")
	private String accNo;
	
	@Column(name="ACNAME")
	private String accName;
	
	@Column(name="FLEXY")
	private String flexyBal;
	
	@Column(name="LOAN")
	private String loanBal;
	
	@Column(name="KIDDY")
	private String kiddyBal;
	
	@Column(name="SAVINGS")
	private String savingsBal;
	
	@Column(name="SHARES")
	private String shares;
	
	@Column(name="CELLPHONE")
	private String cellPhone;
	
	@Column(name="ACTIVE")
	private int active;
	
	@Column(name="PINFLAG")
	private int pinFlag;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getFlexyBal() {
		return flexyBal;
	}

	public void setFlexyBal(String flexyBal) {
		this.flexyBal = flexyBal;
	}

	public String getLoanBal() {
		return loanBal;
	}

	public void setLoanBal(String loanBal) {
		this.loanBal = loanBal;
	}

	public String getKiddyBal() {
		return kiddyBal;
	}

	public void setKiddyBal(String kiddyBal) {
		this.kiddyBal = kiddyBal;
	}

	public String getSavingsBal() {
		return savingsBal;
	}

	public void setSavingsBal(String savingsBal) {
		this.savingsBal = savingsBal;
	}

	public String getShares() {
		return shares;
	}

	public void setShares(String shares) {
		this.shares = shares;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getPinFlag() {
		return pinFlag;
	}

	public void setPinFlag(int pinFlag) {
		this.pinFlag = pinFlag;
	}
	
}
