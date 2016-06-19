package com.spring.learning.customer.Model;


import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by konstantin on 19.06.16.
 */
public class CustomerRowMapper implements RowMapper{

    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setCustId(rs.getInt("CUST_ID"));
        customer.setName(rs.getString("NAME"));
        customer.setAge(rs.getInt("AGE"));
        return null;
    }
}
