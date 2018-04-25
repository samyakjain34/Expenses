/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.pojo;

import java.util.Date;

/**
 *
 * @author Maraxys
 */
public class SelfHistory {

    public SelfHistory(String userid, String txid, int Expense, Date date, String category, String desc) {
        this.userid = userid;
        this.txid = txid;
        this.Expense = Expense;
        this.date = date;
        this.category = category;
        this.desc = desc;
    }

    
    private String userid;
    private String txid;
    private int Expense;
    private Date date;
    private String category;
    private  String desc;
    
    
    
    
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public int getExpense() {
        return Expense;
    }

    public void setExpense(int Expense) {
        this.Expense = Expense;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
  
    
}
