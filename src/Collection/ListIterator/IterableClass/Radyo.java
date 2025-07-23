package Collection.ListIterator.IterableClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String>{
    private ArrayList<String> kanalList=new ArrayList<String>();

    @Override
    public Iterator<String> iterator() {
        return kanalList.iterator();
    }

    public Radyo(String[] kanallar) {
        for (String kanal : kanallar) {
            kanalList.add(kanal);
        }



    }
}
