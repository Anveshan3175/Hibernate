package com.reverse.generated;
// Generated Jun 10, 2017 3:39:38 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

/**
 * PsTxn generated by hbm2java
 */
public class PsTxn implements java.io.Serializable {

	private PsTxnId id;
	private BigDecimal parentid;
	private Blob content;
	private Date creationDate;

	public PsTxn() {
	}

	public PsTxn(PsTxnId id) {
		this.id = id;
	}

	public PsTxn(PsTxnId id, BigDecimal parentid, Blob content, Date creationDate) {
		this.id = id;
		this.parentid = parentid;
		this.content = content;
		this.creationDate = creationDate;
	}

	public PsTxnId getId() {
		return this.id;
	}

	public void setId(PsTxnId id) {
		this.id = id;
	}

	public BigDecimal getParentid() {
		return this.parentid;
	}

	public void setParentid(BigDecimal parentid) {
		this.parentid = parentid;
	}

	public Blob getContent() {
		return this.content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
