/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.pojo;

/**
 *
 * @author Maraxys
 */
public class Categories {
    
    public Categories(String userId, double budget, double shopping, double travel, double bills, double grocery, double health, double eatout, double entertain, double other, double groupexp, double education, double clothes) {
        this.userId = userId;
        this.budget = budget;
        this.shopping = shopping;
        this.travel = travel;
        this.bills = bills;
        this.grocery = grocery;
        this.health = health;
        this.eatout = eatout;
        this.entertain = entertain;
        this.other = other;
        this.groupexp = groupexp;
        this.education = education;
        this.clothes = clothes;
    }
    
    private String userId;
    private double budget;
    private double shopping;
    private double travel;
    private double bills;
    private double grocery;
    private double health;
    private double eatout;
    private double entertain;
    private double other;
    private double groupexp;
    private double education;
    private double clothes;
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getShopping() {
        return shopping;
    }

    public void setShopping(double shopping) {
        this.shopping = shopping;
    }

    public double getTravel() {
        return travel;
    }

    public void setTravel(double travel) {
        this.travel = travel;
    }

    public double getBills() {
        return bills;
    }

    public void setBills(double bills) {
        this.bills = bills;
    }

    public double getGrocery() {
        return grocery;
    }

    public void setGrocery(double grocery) {
        this.grocery = grocery;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getEatout() {
        return eatout;
    }

    public void setEatout(double eatout) {
        this.eatout = eatout;
    }

    public double getEntertain() {
        return entertain;
    }

    public void setEntertain(double entertain) {
        this.entertain = entertain;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    public double getGroupexp() {
        return groupexp;
    }

    public void setGroupexp(double groupexp) {
        this.groupexp = groupexp;
    }

    public double getEducation() {
        return education;
    }

    public void setEducation(double education) {
        this.education = education;
    }

    public double getClothes() {
        return clothes;
    }

    public void setClothes(double clothes) {
        this.clothes = clothes;
    }
    
}
