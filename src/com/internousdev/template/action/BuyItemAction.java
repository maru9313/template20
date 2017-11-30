package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {


//	private List<BuyItemDTO>  buyItemList = new ArrayList<BuyItemDTO>();

/*public int itemPrice*/;


	private String itemName;

	private String itemPrice;

	private int stock;

	private String payment;

	private String pay;

	private int buyItemPrice;


	/**
	 * アイテム情報を格納
	 */
	public Map<String, Object>  session;




	/**
	 * 商品情報取得メソッド
	 *
	 * @author internous
	 */
	public String execute(){


//		session.put("stock", stock);
//		int intStock = Integer.parseInt(session.get("stock").toString());
//		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());

//		buyItemPrice=intStock * intPrice;

		//buyItemPrice=stock * (Integer.parseInt(itemPrice));
System.out.println(itemPrice);
//		session.put("buyItem_price", intStock * intPrice);
//		String payment;

/*
		if(pay.equals("1")) {

			payment = "現金払い";
			session.put("pay", payment);
		} else {

			payment = "クレジットカード";
			session.put("pay", payment);
		}*/
		 String result = SUCCESS;

		return result;
	}





	public String getPayment() {
		return payment;
	}





	public void setPayment(String payment) {
		this.payment = payment;
	}





	public Map<String, Object> getSession() {
		return session;
	}





	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getItemPrice() {
		return itemPrice;
	}



	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}



	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}




	public int getBuyItemPrice() {
		return buyItemPrice;
	}



	public void setBuyItemPrice(int buyItemPrice) {
		this.buyItemPrice = buyItemPrice;
	}



	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}



//	public List<BuyItemDTO> getBuyItemList() {
//		return buyItemList;
//	}
//
//	public void setBuyItemList(List<BuyItemDTO> buyItemList) {
//		this.buyItemList = buyItemList;
//	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		/*↑取得したデータを一時的に保持*/
	}
}
