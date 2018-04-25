/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.dao;

import expenses.dbutil.DBConnExp;
import expenses.pojo.SelfHistory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Maraxys
 */
public class SelfHistoryDAO {

    public static String getTxnId() throws SQLException {

        Connection conn = DBConnExp.getConnection();
        Statement st = conn.createStatement();

        int rowCount = 0;
        String qry = "select count(*) as totalrows from SELF_HISTORY";                    //aliasing is not mandatory but it is recommended
        ResultSet rs = st.executeQuery(qry);

        if (rs.next()) {
            rowCount = rs.getInt(1);
        }
        String newId = "TX-" + (rowCount + 1);
        //System.out.println(newId);
        return newId;
    }

    public static boolean createTransaction(SelfHistory obj) throws SQLException {

        Connection conn = DBConnExp.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into SELF_HISTORY values(?,?,?,?,?,?)");
        ps.setString(1, obj.getTxid());
        ps.setString(2, obj.getUserid());
        ps.setInt(3, obj.getExpense());
        ps.setDate(4, new java.sql.Date(obj.getDate().getTime()));

        ps.setString(5, obj.getCategory());
        ps.setString(6, obj.getDesc());
        //String query="insert into SELF_HISTORY values(?,?,?,?,?,?)";
        int result = ps.executeUpdate();
        return (result > 0);

    }


    public static ArrayList<SelfHistory> getExpenses(String username) throws SQLException {
        Connection conn = DBConnExp.getConnection();
        ArrayList<SelfHistory> selfTxHistory = new ArrayList<>();

        String qry = "select * from SELF_HISTORY where USER_ID=? order by TX_DATE desc";
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, username);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            String userid = rs.getString("USER_ID");
            String txid = rs.getString("TXN_ID");
            int Expense = rs.getInt("AMOUNT");
            Date date = rs.getDate("TX_DATE");
            String category = rs.getString("CATEGORY");
            String desc = rs.getString("DESCRIPTION");
            
            SelfHistory sh=new SelfHistory(userid, txid,Expense,date,category, desc);
            selfTxHistory.add(sh); 

        }
        return selfTxHistory;
        
    }

}
