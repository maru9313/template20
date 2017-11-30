package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	private String result;

	private BuyItemComplateDAO buyItemComplateDAO = new BuyItemComplateDAO();

	/**
	 * 商品購入情報登録処理
	 *
	 * @author internous
	 */
	public String execute() throws SQLException {

		buyItemComplateDAO.buyItemeInfo(
				session.get("id").toString(),
				Integer.parseInt(session.get("buyItem_price").toString()),
				session.get("stock").toString());

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
