package com.lightsfive.konohabank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lightsfive.konohabank.util.DBUtil;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getMyDBConnection();
		PreparedStatement ps = con.prepareStatement("SELECT id from public.\"SAMPLE\"");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
		}
	}

}
