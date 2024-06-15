package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	public String getMyChoice() {
	
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner myChoice = new Scanner(System.in);
		
		String input = myChoice.next();
		
		
		while(!(input.equals("r")) && !(input.equals("s")) && !(input.equals("p"))) {
			System.out.println("正しい手を入力しましょう");
			input = myChoice.next();
		}
		
		return input;
	}
	
	public String getRandom() {
		
		 String enemyChoice[] = {"r","s","p"};
		 
		 int enemyInput = (int) Math.round(Math.random() * 3);
		 
		return enemyChoice[enemyInput];
	}
	
	public void playGame( String myChoice,  String enemyChoice) {
		
		
		HashMap <String, String>  choice= new HashMap<>();
		
		choice.put("r", "グー");
		choice.put("s",  "チョキ");
		choice.put("p", "パー");
		
		System.out.println("自分の手は" + choice.get(myChoice) + ",対戦相手の手は" + choice.get(enemyChoice));
		
		if(choice.get(myChoice) == choice.get(enemyChoice)) {
			System.out.println("あいこです");
		} else if((choice.equals("r") && enemyChoice.equals("s")) || 
                (choice.equals("p") && enemyChoice.equals("r")) || 
                (choice.equals("s") && enemyChoice.equals("p"))) {
          System.out.println("自分の勝ちです");
      } else {
          System.out.println("自分の負けです");
      }
		
	}
}
