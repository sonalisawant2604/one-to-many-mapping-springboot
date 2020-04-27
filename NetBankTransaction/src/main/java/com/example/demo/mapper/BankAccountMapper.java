package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.entity.Benifishiory;

import org.springframework.jdbc.core.RowMapper;

public class BankAccountMapper implements RowMapper<Benifishiory> {

    public static final String BASE_SQL
            = "Select ba.Id, ba.Full_Name, ba.Balance From Benifishiory ba ";

    @Override
    public Benifishiory mapRow(ResultSet rs, int rowNum) throws SQLException {

        Long id = rs.getLong("Id");
        String fullName = rs.getString("Full_Name");
        double balance = rs.getDouble("Balance");

        return new Benifishiory(id, fullName, balance);
    }

}