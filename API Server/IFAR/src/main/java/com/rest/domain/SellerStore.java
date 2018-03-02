package com.rest.domain;
// Generated Feb 26, 2018 8:43:55 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * SellerStore generated by hbm2java
 */
@Entity
@Table(name = "seller_store", catalog = "ifAR", uniqueConstraints = @UniqueConstraint(columnNames = "id_card"))
public class SellerStore implements java.io.Serializable {

	private String name;
	private SellerStore sellerStore;
	private UserAccount userAccount;
	private String idCard;
	private String address;
	private String phone;
	private double balance;
	private Date createdAt;
	private Date updatedAt;
	private int status;
	private String rejectReason;
	private Set<SellerStore> sellerStores = new HashSet<SellerStore>(0);

	public SellerStore() {
	}

	public SellerStore(String name, UserAccount userAccount, String idCard, String address, String phone,
			double balance, Date createdAt, Date updatedAt, int status, String rejectReason) {
		this.name = name;
		this.userAccount = userAccount;
		this.idCard = idCard;
		this.address = address;
		this.phone = phone;
		this.balance = balance;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.rejectReason = rejectReason;
	}

	public SellerStore(String name, SellerStore sellerStore, UserAccount userAccount, String idCard, String address,
			String phone, double balance, Date createdAt, Date updatedAt, int status, String rejectReason,
			Set<SellerStore> sellerStores) {
		this.name = name;
		this.sellerStore = sellerStore;
		this.userAccount = userAccount;
		this.idCard = idCard;
		this.address = address;
		this.phone = phone;
		this.balance = balance;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.rejectReason = rejectReason;
		this.sellerStores = sellerStores;
	}

	@Id

	@Column(name = "name", unique = true, nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller_store_name")
	public SellerStore getSellerStore() {
		return this.sellerStore;
	}

	public void setSellerStore(SellerStore sellerStore) {
		this.sellerStore = sellerStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_account_username", nullable = false)
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Column(name = "id_card", unique = true, nullable = false, length = 12)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "address", nullable = false, length = 250)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", nullable = false, length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "balance", nullable = false, precision = 22, scale = 0)
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "reject_reason", nullable = false, length = 250)
	public String getRejectReason() {
		return this.rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sellerStore")
	public Set<SellerStore> getSellerStores() {
		return this.sellerStores;
	}

	public void setSellerStores(Set<SellerStore> sellerStores) {
		this.sellerStores = sellerStores;
	}

}