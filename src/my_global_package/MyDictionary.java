package my_global_package;

import java.util.ArrayList;
import java.util.List;

class MiniList<TKey, TValue> {
    public TKey key;
    public TValue value;

    public MiniList(TKey key, TValue value) {
        this.key = key;
        this.value = value;
    }
}

class MyDictionary<TKey, TValue> {
    public List<MiniList> myDictionary;

    public MyDictionary() {
        this.myDictionary = new ArrayList<>();
    }

    public String getArrToSrting() {
        String arrString = "";
        for (MiniList itr : myDictionary) {
            arrString = arrString + "[" + itr.key + "] " + itr.value + "\n";
        }
        return arrString;
    }

    public int count() {
        return myDictionary.size();
    }

    public void add(TKey key, TValue value) {
        myDictionary.add(new MiniList<TKey, TValue>(key, value));
    }

}
