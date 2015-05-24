package me.cungu.footmark.dao.user.impl;

import org.springframework.stereotype.Repository;

import me.cungu.footmark.dao.user.IUsrAccountDAO;
import me.cungu.footmark.model.bo.UsrAccountBO;

import eap.comps.orm.mybatis.BaseDAO;

/**
 * <p> 标题: </p>
 * <p> 描述: </p>
 * @作者 fuumining
 * @创建时间 2015-05-17 19:58:49
 * @版本 1.00
 * @修改记录
 * <pre>
 * 版本       修改人         修改时间         修改内容描述
 * ----------------------------------------
 * 
 * ----------------------------------------
 * </pre>
 */
@Repository("usrAccountDAO")
public class UsrAccountDAOImpl extends BaseDAO implements IUsrAccountDAO {
	
	public int saveUsrAccountBO(UsrAccountBO usrAccountBO) {
		return sqlExecutor.insert("user.saveUsrAccountBO", usrAccountBO);
	}
	
	public int deleteUsrAccountBOById(Long id) {
		return sqlExecutor.delete("user.deleteUsrAccountBOById", id);
	}
	
	public int updateUsrAccountBOById(UsrAccountBO usrAccountBO) {
		return sqlExecutor.update("user.updateUsrAccountBOById", usrAccountBO);
	}
	
	public UsrAccountBO findUsrAccountBOById(Long id) {
		return sqlExecutor.selectOne("user.findUsrAccountBOById", id);
	}
}