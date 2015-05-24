package me.cungu.footmark.bizprocess.user.bs.impl;

import me.cungu.footmark.bizprocess.user.bs.IUserBS;
import me.cungu.footmark.dao.user.IUsrProfileDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <p> 标题: </p>
 * <p> 描述: </p>
 * @作者 fuumining
 * @创建时间 2015-05-17 20:18:25
 * @版本 1.00
 * @修改记录
 * <pre>
 * 版本       修改人         修改时间         修改内容描述
 * ----------------------------------------
 * 
 * ----------------------------------------
 * </pre>
 */
@Service("userBS")
public class UserBSImpl implements IUserBS {
	
	@Autowired
	@Qualifier("usrProfileDAO")
	private IUsrProfileDAO usrProfileDAO;
	
}