package _11;

public class Account {

	String number;
	String name;
	int money;
	int password;
	
	public Account() {
		this("계좌없음", "이름없음", 0, 0);
	}

	public Account(String number, String name, int money, int password) {
		this.number = number;
		this.name = name;
		this.money = money;
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + ", password=" + password + "]";
	}
	
	
}
