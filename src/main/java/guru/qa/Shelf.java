package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<String> equipments = new ArrayList<>();

    void addNewEquipment(String item) {
        if (!equipments.contains(item)) {
            equipments.add(item);
            System.out.println("Инструмент " + item + " Добавлен в гараж");
        }
    }

    void removeEquipment(String item) {

        if (equipments.contains(item)) {
            equipments.remove(item);
            System.out.println(item + " Удален из гаража");
        } else {
            System.out.println("Инструмент не найден в гараже");
        }
    }

    void searchEquipment(String itemName) {
        for (String equipment : equipments) {
            if (equipment.contains(itemName)) {
                System.out.println(itemName + " В гараже");
            }

        }
    }

    public void printAllEquipments() {
        for (String equipment : equipments) {
            System.out.println("Инструмент: " + equipments);
        }
    }
}
