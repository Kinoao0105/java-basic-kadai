package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter26 Jyanken = new Jyanken_Chapter26();
		
		String myChoice = Jyanken.getMyChoice();
		String enemyChoice = Jyanken.getRandom();
		
		Jyanken.playGame(myChoice, enemyChoice);
	}

}

