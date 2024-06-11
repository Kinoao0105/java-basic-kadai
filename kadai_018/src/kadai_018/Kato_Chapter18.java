package kadai_018;

public class Kato_Chapter18 {


	public String familyName;
	public String givenName;
	public String address;  

	
	public Kato_Chapter18(String familyName, String givenName, String address) {
		this.familyName  = familyName;
		this.givenName = givenName;
		this.address = address;
	}

	public void commonIntroduce(){
		this.familyName = "加藤";
        this.address = "東京都中野区◯x";
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}


}
