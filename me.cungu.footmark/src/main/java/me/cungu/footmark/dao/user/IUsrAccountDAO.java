package me.cungu.footmark.dao.user;

import me.cungu.footmark.model.bo.UsrAccountBO;

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
public interface IUsrAccountDAO {
	int saveUsrAccountBO(UsrAccountBO usrAccountBO);
	int deleteUsrAccountBOById(Long id);
	int updateUsrAccountBOById(UsrAccountBO usrAccountBO);
	UsrAccountBO findUsrAccountBOById(Long id);
}