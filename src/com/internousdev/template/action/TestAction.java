package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.template.dao.BuyItemComplateDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction  extends ActionSupport  {


	public Map<String, Object>  session;

	private String itemPrice;

	private int stock;

	private String count;


	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	private String product_id;


	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getTotal_count() {
		return total_count;
	}
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public int total_count;

	public ArrayList<BuyItemDTO> home = new ArrayList<BuyItemDTO>();

	public String execute() throws SQLException/*. IOException*/ {

		String[] resultArray1 = itemPrice.split(",");//分解　区切りをなくす

		int count1 = resultArray1.length;
		for(int a = 0;a<count1;a++){
			resultArray1[a] = resultArray1[a].trim();
		}

		String[] resultArray2 = count.split(",");//同様

		int count2 = resultArray2.length;
		for(int a = 0;a<count2;a++){
			resultArray2[a] =resultArray2[a].trim();
		}

		String[] resultArray3 = product_id.split(",");

		int count3 = resultArray3.length;
		for(int a = 0;a<count3;a++){
			resultArray3[a] =resultArray3[a].trim();
		}



		 String result = SUCCESS;

	for(int i = 0; i< resultArray1.length;i++){
		BuyItemComplateDAO dao = new BuyItemComplateDAO();
		Integer.parseInt(resultArray1[i]);

	dao.buyItemeInfo(resultArray3[i],  Integer.parseInt(resultArray1[i])*Integer.parseInt(resultArray2[i]), resultArray2[i]);


	}

	return  result;

	}


	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
}
