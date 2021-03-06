package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateComplateAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String userName;

	public Map<String,Object> session;

	private String result;

	private UserCreateComplateDAO userCreateComplateDAO = new UserCreateComplateDAO();

	/**
	 * ユーザー情報登録処理
	 */
	public String execute() throws SQLException {

		userCreateComplateDAO.cerateUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString());

		result = SUCCESS;

		return result ;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*セッションの内容*/
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
