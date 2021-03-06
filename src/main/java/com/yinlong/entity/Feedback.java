package com.yinlong.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * 反馈单信息
 * @author KA
 *
 */
@Entity
@Table(name = "YL_Feedback")
@SuppressWarnings("serial")
public class Feedback implements Serializable {
	
	private String	docId;				// ID 异常反馈单号	自动
	private Date	docCreateDate;		// 创建时间		隐藏
	private String	docTheme;			// 主题			
	private File	docFile;			// 附件
	private Date	docFindDate;		// 发现时间		
	private String	docFindAddr;		// 发现地点		
	private String	docCustName;		// 客户名称
	private String	docProMode;			// 产品型号
	private String	docOrderNum;		// 订单号
	private String	docProDep;			// 生产单位
	private String 	docProTeam;			// 生产班组
	private String	docResStation;		// 责任工序岗位
	private String	docItemType;		// 物料类型
	private String	docItemName;		// 物料名称
	private String	docItemNum;			// 物料编码
	private String	docSupName;			// 供应商名称
	private int		docIsStopLine;		// 是否停线
	private	String 	docLoss;			// 停线工时损失
	private String	docSeverityLevel;	// 不合格严重等级
	private int		docUsedCounts;		// 使用数量
	private int		docDefproCounts;	// 不良品数量
	private String	docFindDep;			// 发现异常单位
	private int		docIsBatch;			// 是否批量
	private String	docDescribe;		// 异常描述
	private String	docStatus; 			// 状态

	private String	docAddrEmail;		// 添加的收件人邮箱
	private String	docCopyEmail;		// 抄送的邮箱
	
	private ProductType productType;	// 产品类别
	private Process	process;			// 下一流程节点

	private Set<Appraise> appSet = new HashSet<Appraise>();		// 责任单位
	
	private Set<User> addrUsers = new HashSet<User>();
	private Set<User> copyUsers = new HashSet<User>();
	
	
	public Feedback() {
		super();
	}
	public Feedback(String docId, Date docCreateDate, String docTheme, File docFile, Date docFindDate,
			String docFindAddr, String docCustName, String docProMode, String docOrderNum, String docProDep,
			String docProTeam, String docResStation, String docItemType, String docItemName, String docItemNum,
			String docSupName, int docIsStopLine, String docLoss, String docSeverityLevel, int docUsedCounts,
			int docDefproCounts, String docFindDep, int docIsBatch, String docDescribe, String docStatus) {
		super();
		this.docId = docId;
		this.docCreateDate = docCreateDate;
		this.docTheme = docTheme;
		this.docFile = docFile;
		this.docFindDate = docFindDate;
		this.docFindAddr = docFindAddr;
		this.docCustName = docCustName;
		this.docProMode = docProMode;
		this.docOrderNum = docOrderNum;
		this.docProDep = docProDep;
		this.docProTeam = docProTeam;
		this.docResStation = docResStation;
		this.docItemType = docItemType;
		this.docItemName = docItemName;
		this.docItemNum = docItemNum;
		this.docSupName = docSupName;
		this.docIsStopLine = docIsStopLine;
		this.docLoss = docLoss;
		this.docSeverityLevel = docSeverityLevel;
		this.docUsedCounts = docUsedCounts;
		this.docDefproCounts = docDefproCounts;
		this.docFindDep = docFindDep;
		this.docIsBatch = docIsBatch;
		this.docDescribe = docDescribe;
		this.docStatus = docStatus;
	}

	@Id
	@GeneratedValue(generator = "feedback")    
	@GenericGenerator(name = "feedback", strategy = "uuid")    
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public Date getDocCreateDate() {
		return docCreateDate;
	}
	public void setDocCreateDate(Date docCreateDate) {
		this.docCreateDate = docCreateDate;
	}
	public String getDocTheme() {
		return docTheme;
	}
	public void setDocTheme(String docTheme) {
		this.docTheme = docTheme;
	}
	public File getDocFile() {
		return docFile;
	}
	public void setDocFile(File docFile) {
		this.docFile = docFile;
	}
	public Date getDocFindDate() {
		return docFindDate;
	}
	public void setDocFindDate(Date docFindDate) {
		this.docFindDate = docFindDate;
	}
	public String getDocFindAddr() {
		return docFindAddr;
	}
	public void setDocFindAddr(String docFindAddr) {
		this.docFindAddr = docFindAddr;
	}
	public String getDocCustName() {
		return docCustName;
	}
	public void setDocCustName(String docCustName) {
		this.docCustName = docCustName;
	}
	public String getDocProMode() {
		return docProMode;
	}
	public void setDocProMode(String docProMode) {
		this.docProMode = docProMode;
	}
	public String getDocOrderNum() {
		return docOrderNum;
	}
	public void setDocOrderNum(String docOrderNum) {
		this.docOrderNum = docOrderNum;
	}
	public String getDocProDep() {
		return docProDep;
	}
	public void setDocProDep(String docProDep) {
		this.docProDep = docProDep;
	}
	public String getDocProTeam() {
		return docProTeam;
	}
	public void setDocProTeam(String docProTeam) {
		this.docProTeam = docProTeam;
	}
	public String getDocResStation() {
		return docResStation;
	}
	public void setDocResStation(String docResStation) {
		this.docResStation = docResStation;
	}
	public String getDocItemType() {
		return docItemType;
	}
	public void setDocItemType(String docItemType) {
		this.docItemType = docItemType;
	}
	public String getDocItemName() {
		return docItemName;
	}
	public void setDocItemName(String docItemName) {
		this.docItemName = docItemName;
	}
	public String getDocItemNum() {
		return docItemNum;
	}
	public void setDocItemNum(String docItemNum) {
		this.docItemNum = docItemNum;
	}
	public String getDocSupName() {
		return docSupName;
	}
	public void setDocSupName(String docSupName) {
		this.docSupName = docSupName;
	}
	public int getDocIsStopLine() {
		return docIsStopLine;
	}
	public void setDocIsStopLine(int docIsStopLine) {
		this.docIsStopLine = docIsStopLine;
	}
	public String getDocLoss() {
		return docLoss;
	}
	public void setDocLoss(String docLoss) {
		this.docLoss = docLoss;
	}
	public String getDocSeverityLevel() {
		return docSeverityLevel;
	}
	public void setDocSeverityLevel(String docSeverityLevel) {
		this.docSeverityLevel = docSeverityLevel;
	}
	public int getDocUsedCounts() {
		return docUsedCounts;
	}
	public void setDocUsedCounts(int docUsedCounts) {
		this.docUsedCounts = docUsedCounts;
	}
	public int getDocDefproCounts() {
		return docDefproCounts;
	}
	public void setDocDefproCounts(int docDefproCounts) {
		this.docDefproCounts = docDefproCounts;
	}
	public String getDocFindDep() {
		return docFindDep;
	}
	public void setDocFindDep(String docFindDep) {
		this.docFindDep = docFindDep;
	}
	public int getDocIsBatch() {
		return docIsBatch;
	}
	public void setDocIsBatch(int docIsBatch) {
		this.docIsBatch = docIsBatch;
	}
	public String getDocDescribe() {
		return docDescribe;
	}
	public void setDocDescribe(String docDescribe) {
		this.docDescribe = docDescribe;
	}
	public String getDocStatus() {
		return docStatus;
	}
	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}
	public String getDocAddrEmail() {
		return docAddrEmail;
	}
	public void setDocAddrEmail(String docAddrEmail) {
		this.docAddrEmail = docAddrEmail;
	}
	public String getDocCopyEmail() {
		return docCopyEmail;
	}
	public void setDocCopyEmail(String docCopyEmail) {
		this.docCopyEmail = docCopyEmail;
	}
	@OneToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="pdtId")
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	@OneToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="proId")
	public Process getProcess() {
		return process;
	}
	public void setProcess(Process process) {
		this.process = process;
	}
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="docId")
	public Set<Appraise> getAppSet() {
		return appSet;
	}
	public void setAppSet(Set<Appraise> appSet) {
		this.appSet = appSet;
	}

	@ManyToMany(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinTable(name = "YL_Feedback_Addrs",
			joinColumns = {@JoinColumn(name = "doc_id")},			// JoinColumns定义本方在中间表的主键映射
			inverseJoinColumns = {@JoinColumn(name = "user_id")})	// inverseJoinColumns定义另一在中间表的主键
	public Set<User> getAddrUsers() {
		return addrUsers;
	}
	public void setAddrUsers(Set<User> addrUsers) {
		this.addrUsers = addrUsers;
	}
	
	@ManyToMany(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinTable(name = "YL_Feedback_Copys",
			joinColumns = {@JoinColumn(name = "doc_id")},//JoinColumns定义本方在中间表的主键映射
			inverseJoinColumns = {@JoinColumn(name = "user_id")})//inverseJoinColumns定义另一在中间表的主键
	public Set<User> getCopyUsers() {
		return copyUsers;
	}
	public void setCopyUsers(Set<User> copyUsers) {
		this.copyUsers = copyUsers;
	}
	
	
}
