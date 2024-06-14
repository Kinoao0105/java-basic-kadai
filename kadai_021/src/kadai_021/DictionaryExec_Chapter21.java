package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // 辞書のインスタンス化
        Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();

        // 検索したい単語を配列に格納
        String[] searchWords = {"apple", "banana","grape", "orange"};

        myDictionary.searchWord(searchWords);
    }
}
