package com.rest.domain;
// Generated Feb 26, 2018 8:43:55 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * UserAccount generated by hbm2java
 */
@Entity
@Table(name = "user_account", catalog = "ifAR")
public class UserAccount implements java.io.Serializable {

	private String username;
	private Role role;
	private String password;
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<SellerRequest> sellerRequests = new HashSet<SellerRequest>(0);
	private Set<Transaction> transactions = new HashSet<Transaction>(0);
	private UserProfile userProfile;
	private Set<SellerStore> sellerStores = new HashSet<SellerStore>(0);

	public UserAccount() {
	}

	public UserAccount(String username, Role role, String password) {
		this.username = username;
		this.role = role;
		this.password = password;
	}

	public UserAccount(String username, Role role, String password, Set<Order> orders,
			Set<SellerRequest> sellerRequests, Set<Transaction> transactions, UserProfile userProfile,
			Set<SellerStore> sellerStores) {
		this.username = username;
		this.role = role;
		this.password = password;
		this.orders = orders;
		this.sellerRequests = sellerRequests;
		this.transactions = transactions;
		this.userProfile = userProfile;
		this.sellerStores = sellerStores;
	}

	@Id

	@Column(name = "username", unique = true, nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAccount")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAccount")
	@JsonBackReference
	public Set<SellerRequest> getSellerRequests() {
		return this.sellerRequests;
	}

	public void setSellerRequests(Set<SellerRequest> sellerRequests) {
		this.sellerRequests = sellerRequests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAccount")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userAccount")
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAccount")
	public Set<SellerStore> getSellerStores() {
		return this.sellerStores;
	}

	public void setSellerStores(Set<SellerStore> sellerStores) {
		this.sellerStores = sellerStores;
	}

}