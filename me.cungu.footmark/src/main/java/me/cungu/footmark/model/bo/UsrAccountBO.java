package me.cungu.footmark.model.bo;

import java.math.BigDecimal;

import eap.base.BaseBO;


/**
 * <p> 标题: </p>
 * <p> 描述: </p>
 * @作者 fuumining
 * @创建时间 2015-05-17 11:29:31
 * @版本 1.00
 * @修改记录
 * <pre>
 * 版本       修改人         修改时间         修改内容描述
 * ----------------------------------------
 * 
 * ----------------------------------------
 * </pre>
 */
public class UsrAccountBO extends BaseBO {
	
	/** 登录账号 */
	private String userAccount;
	/** 登录账号类型；UserAccountType */
	private String userAccountType;
	/** 用户ID */
	private BigDecimal userId;
	
	public String getUserAccount() {
		return this.userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserAccountType() {
		return this.userAccountType;
	}
	public void setUserAccountType(String userAccountType) {
		this.userAccountType = userAccountType;
	}
	public BigDecimal getUserId() {
		return this.userId;
	}
	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}
}