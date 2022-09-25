package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Mark {
    Map<String, String> markEquip = new HashMap<>();

    public void addMark(String number, String brand) {
        markEquip.put(number, brand);
    }

    public void removeMark(String number) {
        markEquip.remove(number);
    }

    public void showAllMark() {
        for (Map.Entry<String, String> entry : markEquip.entrySet()) {
            System.out.println("Номер инструмента: " + entry.getKey() + ", Производитель: " + entry.getValue());
        }
    }
}
