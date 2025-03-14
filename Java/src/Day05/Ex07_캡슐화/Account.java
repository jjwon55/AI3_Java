package Day05.Ex07_캡슐화;

public class Account {
/**
 * 통장걔좌
 * 예금액
 * 예금주
 * 계전번화
 * 은행명
 */
	

	
	private int deposit;
	private String depositor;
	private String DepoNumber;
	private String bank;
	public Account() {
		this(0, "예금주 없음", "000000-00-000000", "은행없음");
	}
	
	
	
	public Account(int deposit, String depositor, String depoNumber, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		DepoNumber = depoNumber;
		this.bank = bank;
	}



	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if( deposit < 0) return;
		this.deposit = deposit;
	}
	public String getDepositor() {
		return depositor;
	}
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	public String getDepoNumber() {
		return DepoNumber;
	}
	public void setDepoNumber(String depoNumber) {
		DepoNumber = depoNumber;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [deposit=" + deposit + ", depositor=" + depositor + ", DepoNumber=" + DepoNumber + ", bank="
				+ bank + "]";
	}
	
	
}
