package model;

public class CoinConverter {
	private int cents;
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	public CoinConverter() {
		super();
		// TODO Auto-generated constructor stub
		}
	public CoinConverter(int cents) {
		super();
		this.cents = cents;
		setCoins(cents);//NOTICE THIS METHOD CALL
		}
	public void setCents(int cents) {
		this.cents = cents;
		setCoins(cents);//NOTICE THIS METHOD CALL
		}
	private void setDollars(int dollars) {
		this.dollars = dollars;
	}
	private void setQuarters(int quarters) {
		this.quarters = quarters;
	}
	private void setDimes(int dimes) {
		this.dimes = dimes;
	}
	private void setNickels(int nickels) {
		this.nickels = nickels;
	}
	private void setPennies(int pennies) {
		this.pennies = pennies;
	}
	public int getCents() {
		return this.cents;
	}
	public int getDollars() {
		return this.dollars;
	}
	public int getQuarters() {
		return this.quarters;
	}
	public int getNickels() {
		return this.nickels;
	}
	public int getDimes() {
		return this.dimes;
	}
	public int getPennies() {
		return this.pennies;
	}
	//OTHER GETTERS & SETTERS FOR INSTANCE VARIABLES 
	//they are not modified
	public void setCoins(int cents) {
		final int DOLLARS = 100; // number of cents in dollar
		final int QUARTERS = 25; // number of cents in quarter
		final int DIMES = 10; // number of cents in dime
		final int NICKELS = 5; // number of cents in nickel
		int centsLeft;
		setDollars(cents / DOLLARS);
		centsLeft= cents % DOLLARS;
		setQuarters(centsLeft / QUARTERS);
		centsLeft = centsLeft % QUARTERS;
		setDimes(centsLeft / DIMES);
		centsLeft = centsLeft % DIMES;
		setNickels(centsLeft / NICKELS);
		setPennies(centsLeft % NICKELS);
	}
	@Override
	public String toString() {
		return "CoinConverter [cents=" + cents + ", dollars=" + dollars + ", quarters=" + quarters + ", dimes=" + dimes+ ", nickels=" + nickels + ", pennies=" + pennies + "]";
		}
	}