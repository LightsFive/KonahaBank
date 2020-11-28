package com.lightsfive.konohabank.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Map;
import java.util.Set;

import com.lightsfive.konohabank.util.DBUtil;

public class Repository {

	/**
	 * This Method takes query and corresponding parameters as arguments and inserts or updates the record.
	 * @param query - inserts or updates record
	 * @param parameters - sets parameters to given query
	 * @return boolean - true if record is inserted
	 * @throws SQLException
	 */
	public boolean add(String query, Map<Integer, Object> parameters) throws SQLException {
		boolean result = false;
		
		Connection con = DBUtil.getMyDBConnection();
		PreparedStatement pt = con.prepareStatement(query);
		setParameters(parameters, pt);
		int res = pt.executeUpdate();
		if (res > 0) {
			result = true;
		}
		DBUtil.closeAll(con, pt, null);
		return result;
	}

	private void setParameters(Map<Integer, Object> parameters, PreparedStatement pt) throws SQLException {
		Set<Integer> keys = parameters.keySet();
		for (int key : keys) {
			if (parameters.get(key) instanceof String)
				pt.setString(key, (String) parameters.get(key));
			else if (parameters.get(key) instanceof Integer)
				pt.setInt(key, (Integer) parameters.get(key));
			else if (parameters.get(key) instanceof Long)
				pt.setLong(key, (Long) parameters.get(key));
			else if (parameters.get(key) instanceof Date)
				pt.setDate(key, (Date) parameters.get(key));
			else if (parameters.get(key) instanceof Character)
				pt.setString(key, String.valueOf(parameters.get(key)));
			else if (parameters.get(key) instanceof Timestamp)
				pt.setTimestamp(key, (Timestamp) parameters.get(key));
			else
				throw new IllegalArgumentException("Invalid Parameter Type");
		}
	}

}
