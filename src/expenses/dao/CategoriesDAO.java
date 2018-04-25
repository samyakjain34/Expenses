/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.dao;

import expenses.dbutil.DBConnExp;
import expenses.pojo.Categories;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Maraxys
 */
public class CategoriesDAO {

    public static void addToCat(String uid, int budget) throws SQLException {
        Connection conn = DBConnExp.getConnection();

        PreparedStatement ps = conn.prepareStatement("insert into catwise_expense(user_id,budget) values(?,?)");
        ps.setString(1, uid);
        ps.setInt(2, budget);
        ps.executeUpdate();
    }

    public static boolean addCategoryExpense(String uid, String cat, int amt) throws SQLException {

        Connection conn = DBConnExp.getConnection();
        String query = "Update CATWISE_EXPENSE set " + cat + " = " + cat + "+ ? where USER_ID= ?";

        PreparedStatement ps = conn.prepareStatement(query);
        //ps.setString(1, cat);
        ps.setInt(1, amt);
        ps.setString(2, uid);

        int a = ps.executeUpdate();

        return (a > 0);

    }

    public static Categories getCatwiseExpense(String username) throws SQLException {
        Connection conn = DBConnExp.getConnection();
        String qry = "select * from CATWISE_EXPENSE where USER_ID=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, username);
        Categories catwise = null;
        //Double budget=0.0,shopping=0.0,travel=0.0,bills=0.0,grocery=0.0,health=0.0,eatout=0.0,entertain=0.0,other=0.0,groupexp=0.0,education=0.0,clothes=0.0;
        //String userId=username;
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            //userId=username;
            Double budget = rs.getDouble("BUDGET");
            Double shopping = rs.getDouble("SHOPPING");
            Double travel = rs.getDouble("TRAVEL");
            Double bills = rs.getDouble("BILLS");
            Double grocery = rs.getDouble("GROCERY");
            Double health = rs.getDouble("HEALTH");
            Double eatout = rs.getDouble("EATOUT");
            Double entertain = rs.getDouble("ENTERTAINMENT");
            Double other = rs.getDouble("OTHER");
            Double groupexp = rs.getDouble("GROUPEXP");
            Double education = rs.getDouble("EDUCATION");
            Double clothes = rs.getDouble("CLOTHES");
            catwise = new Categories(username, budget, shopping, travel, bills, grocery, health, eatout, entertain, other, groupexp, education, clothes);

        }
        // catwise=new Categories(username, budget, shopping, travel, bills, grocery, health, eatout, entertain, other, groupexp, education, clothes);
        return catwise;
    }
}
