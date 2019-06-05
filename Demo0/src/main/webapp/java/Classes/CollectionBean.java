package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public String[] strings;
    public List<String> stringList;
    public Set<String> stringSet;
    public Map<String,String> stringMap;

    @Override
    public String toString() {
        return "CollectionBean{" +
                "strings=" + Arrays.toString(strings) +
                ", stringList=" + stringList +
                ", stringSet=" + stringSet +
                ", stringMap=" + stringMap +
                '}';
    }
}
