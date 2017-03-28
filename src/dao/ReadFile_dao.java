package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import dto.ReadFile_dto;

public class ReadFile_dao {

	public void insertrecord(List<ReadFile_dto> list) {

		

			try {

				 String query =
				 "insert into nyse(exchange,stock_symbol,dt,stock_price_open,stock_price_high,stock_price_low,stock_price_close,stock_volume,stock_price_adj_close) values(?,?,?,?,?,?,?,?,?)";

				

				Class.forName("oracle.jdbc.driver.OracleDriver");

				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "test", "test");

				
				  PreparedStatement ps = con.prepareStatement(query);
				 
			
				  for (ReadFile_dto rd : list) {
				  
				  ps.setString(1,rd.getExchange());
				  
				  ps.setString(2,rd.getS_sym());
				  
				 ps.setString(3,rd.getDt());
				  
				  ps.setFloat(4,rd.getS_p_o());
				  
				  ps.setFloat(5,rd.getS_p_h());
				  
				  ps.setFloat(6,rd.getS_p_l());
				
				 ps.setFloat(7,rd.getS_p_c());
				 
				  ps.setInt(8,rd.getS_v());
				 
				  ps.setFloat(9,rd.getS_p_a_c());
				  
				  ps.addBatch();
			}
				  ps.executeBatch();
				 //int i = ps.executeUpdate();
				 

			}

			catch (Exception ex) {

				ex.printStackTrace();

			}

		}

	}

