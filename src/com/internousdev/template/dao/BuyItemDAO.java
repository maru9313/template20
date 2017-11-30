package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private BuyItemDTO buyItemDTO;

	private List<BuyItemDTO> buyItemList;

	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public BuyItemDTO getBuyItemInfo() {

		String sql = "SELECT * FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));

			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return buyItemDTO;
	}


	/**
	 * 商品情報リスト取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public  List<BuyItemDTO> getBuyItemInfoList() {			/*DTOリスト*/
					/*↑ここに情報を飛ばす*/
		String sql = "SELECT * FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			buyItemList=new ArrayList<BuyItemDTO>();

			while(resultSet.next()) {
							/*↑ここで１行ずつ検索をかけていく*/
				buyItemDTO = new BuyItemDTO();
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				buyItemList.add(buyItemDTO);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return buyItemList;
					/*↑上(while文の中)で検索かけた一覧ができる*/
	}



	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}


	public void inMaster(String string, int total_price, String string2) {
String sql="INSERT INTO user_buy_item_transaction( total_price,total_count, ) VALUES(?, ?, ?);  ";
		
	}
}