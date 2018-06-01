/***
Created by Javier Advani
on Jun 1, 2018
***/
package es.wata.example.withdraw;

public class Account {
	private double money;

	public Account(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public double withdrawMoney(double ammount) {
		setMoney(money - ammount);
		return ammount;

	}

	public void setMoney(double money) {
		this.money = money;
	}

}
