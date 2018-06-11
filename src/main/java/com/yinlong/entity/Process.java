package com.yinlong.entity;

import java.io.Serializable;

/**
 * 流程表
 * 该表应该在数据库初始化时固定好
 * id: 自己写
 * name: 该流程名称
 * 1、质量工程师填写异常反馈单
 * 2、归档处理
 * 
 * 3、无需处理
 * 4、考核通报填写
 * 5、限期整改填写
 * 6、科室主任审核
 * 7、部门领导审批
 * 
 * 8、责任单位申请复核
 * 9、责任单位答复
 * 10、责任单位申请延期
 * 11、责任单位申请关闭
 * 12、责任单位指定下一责任单位
 * 
 * 13、责任单位主任审核
 * 14、责任单位领导审批
 * 15、质量工程师下考核结论
 * 
 * @author KA
 *
 */
@SuppressWarnings("serial")
public class Process implements Serializable {
	
	private String proId;
	private String proName;
	public Process() {
		super();
	}
	
	public Process(String proId, String proName) {
		super();
		this.proId = proId;
		this.proName = proName;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}
	
	
	
	
	
}
