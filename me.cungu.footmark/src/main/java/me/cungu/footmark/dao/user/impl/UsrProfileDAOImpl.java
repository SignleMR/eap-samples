package me.cungu.footmark.dao.user.impl;

import org.springframework.stereotype.Repository;

import me.cungu.footmark.dao.user.IUsrProfileDAO;
import me.cungu.footmark.model.bo.UsrProfileBO;

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
@Repository("usrProfileDAO")
public class UsrProfileDAOImpl extends BaseDAO implements IUsrProfileDAO {
	
	public int saveUsrProfileBO(UsrProfileBO usrProfileBO) {
		return sqlExecutor.insert("user.saveUsrProfileBO", usrProfileBO);
	}
	
	public int deleteUsrProfileBOById(Long id) {
		return sqlExecutor.delete("user.deleteUsrProfileBOById", id);
	}
	
	public int updateUsrProfileBOById(UsrProfileBO usrProfileBO) {
		return sqlExecutor.update("user.updateUsrProfileBOById", usrProfileBO);
	}
	
	public UsrProfileBO findUsrProfileBOById(Long id) {
		return sqlExecutor.selectOne("user.findUsrProfileBOById", id);
	}
}