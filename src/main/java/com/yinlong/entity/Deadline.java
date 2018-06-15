package com.yinlong.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 限期整改填写
 * @author KA
 *
 */
@Entity
@Table(name = "YL_Deadline")
@SuppressWarnings("serial")
public class Deadline implements Serializable {
	
	private int		deaId;				// 
	private int 	deaIsSafeAfter;		// 是否引发售后
	private String 	deaCauseAnalysis;	// 初步原因分析
	private String	deaHandlingComments;// 处理意见
	private Date	deaIssuedDate;		// 要求整改方案下发日期
	private Date	deaCompleteDate;	// 要求整改完成日期
	private Date	deaHandleDate;		// 处理时间(默认当前)
	
	private PlaceFile placeFile;		// 对应的归档操作表 

	public Deadline() {
		super();
	}

	public Deadline(int deaId, int deaIsSafeAfter, String deaCauseAnalysis, String deaHandlingComments,
			Date deaIssuedDate, Date deaCompleteDate, Date deaHandleDate) {
		super();
		this.deaId = deaId;
		this.deaIsSafeAfter = deaIsSafeAfter;
		this.deaCauseAnalysis = deaCauseAnalysis;
		this.deaHandlingComments = deaHandlingComments;
		this.deaIssuedDate = deaIssuedDate;
		this.deaCompleteDate = deaCompleteDate;
		this.deaHandleDate = deaHandleDate;
	}

	@Id
	@GeneratedValue(generator = "deadline")    
	@GenericGenerator(name = "deadline", strategy = "uuid")    
	public int getDeaId() {
		return deaId;
	}

	public void setDeaId(int deaId) {
		this.deaId = deaId;
	}

	public int getDeaIsSafeAfter() {
		return deaIsSafeAfter;
	}

	public void setDeaIsSafeAfter(int deaIsSafeAfter) {
		this.deaIsSafeAfter = deaIsSafeAfter;
	}

	public String getDeaCauseAnalysis() {
		return deaCauseAnalysis;
	}

	public void setDeaCauseAnalysis(String deaCauseAnalysis) {
		this.deaCauseAnalysis = deaCauseAnalysis;
	}

	public String getDeaHandlingComments() {
		return deaHandlingComments;
	}

	public void setDeaHandlingComments(String deaHandlingComments) {
		this.deaHandlingComments = deaHandlingComments;
	}

	public Date getDeaIssuedDate() {
		return deaIssuedDate;
	}

	public void setDeaIssuedDate(Date deaIssuedDate) {
		this.deaIssuedDate = deaIssuedDate;
	}

	public Date getDeaCompleteDate() {
		return deaCompleteDate;
	}

	public void setDeaCompleteDate(Date deaCompleteDate) {
		this.deaCompleteDate = deaCompleteDate;
	}

	public Date getDeaHandleDate() {
		return deaHandleDate;
	}

	public void setDeaHandleDate(Date deaHandleDate) {
		this.deaHandleDate = deaHandleDate;
	}

	@OneToOne(cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	@JoinColumn(name="plaId")
	public PlaceFile getPlaceFile() {
		return placeFile;
	}

	public void setPlaceFile(PlaceFile placeFile) {
		this.placeFile = placeFile;
	}
	
	
}
