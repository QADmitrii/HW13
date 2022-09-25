package guru.qa;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        Scanner scanner = new Scanner(System.in);
        String equip;

        System.out.println("Добавьте инструмент");
        equip = scanner.next();
        shelf.addNewEquipment(equip);
        System.out.println("Добавьте инструмент");
        equip = scanner.next();
        shelf.addNewEquipment(equip);
        System.out.println("Добавьте инструмент");
        equip = scanner.next();
        shelf.addNewEquipment(equip);
        System.out.println("Найдите инструмент");
        equip = scanner.next();
        shelf.searchEquipment(equip);
        System.out.println("Удалите инструмент");
        equip = scanner.next();
        shelf.removeEquipment(equip);

        shelf.printAllEquipments();

        Hardware hardware = new Hardware();
        hardware.addGoods("Болт М5");
        hardware.addGoods("Гайка М5");
        hardware.addGoods("Шайба М5");
        hardware.addGoods("Болт М6");
        hardware.removeGoods("Гайка М5");
        hardware.searchGoods("Гайка М10");

        Mark equipmentMark = new Mark();
        equipmentMark.addMark("NM5664", "Bosh");
        equipmentMark.addMark("NM6644", "Metabo");
        equipmentMark.addMark("NM7684", "Stayer");
        equipmentMark.removeMark("NM5664");
        equipmentMark.showAllMark();
    }
}
