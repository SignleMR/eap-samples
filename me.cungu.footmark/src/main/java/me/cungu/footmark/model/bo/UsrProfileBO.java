package me.cungu.footmark.model.bo;

import java.util.Date;

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
public class UsrProfileBO extends BaseBO {
	
	/** 用户昵称 */
	private String nickName;
	/** 登录密码 */
	private String password;
	/** 手机号 */
	private String mobileNo;
	/** 用户状态 */
	private String status;
	/** 用户来源 */
	private String userSource;
	/** 注册时间 */
	private Date regTime;
	/** 注册IP */
	private String regIp;
	
	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserSource() {
		return this.userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	public Date getRegTime() {
		return this.regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String getRegIp() {
		return this.regIp;
	}
	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}
}