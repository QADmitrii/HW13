package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class Hardware {
    public Set<String> goods = new HashSet<>();

    void addGoods(String product) {
        goods.add(product);
    }

    void removeGoods(String product) {
        goods.remove(product);
    }

    void searchGoods(String product) {
        for (String subject : goods) {
            if (subject.contains(product)) {
                System.out.println(product + " на полке");
            }
        }
        if (!goods.contains(product)) {
            System.out.println("Такого метиза нет в наличии");
        }
    }
}
