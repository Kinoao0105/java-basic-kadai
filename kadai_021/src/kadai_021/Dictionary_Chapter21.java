package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    private HashMap<String, String> dictionary;

    // コンストラクタで辞書を初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<String, String>();

        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    String[] searchWords = new String[4];
    
    // 検索メソッド
    public void searchWord(String searchWords[]) {
    	for(String word : searchWords) {
    		if (dictionary.containsKey(word)) {
    			 System.out.println(word + "は" + dictionary.get(word) + "です");
    		} else {
    			 System.out.println( word + "は辞書に存在しません");
    		}
    		
    	}
    	
    }
}
