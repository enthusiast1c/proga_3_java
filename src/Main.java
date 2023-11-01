import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.InputCompany();
        Soldier soldier = new Soldier();
        soldier.InputSoldier();
        Weapon weapon = new Weapon();
        weapon.InputWeapon(company);
        Control operation = new Control();
        operation.InputControl(weapon,soldier);
        Armory armory = new Armory();
        armory.InputArmory(weapon,soldier,operation);
        int exit = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Создан оружейный склад.");
            int choice;
            do {
                System.out.println("Выберите действие:\n |1|Вывести оружейный склад\n |2|Добавить солдата\n |3|Добавить оружие\n |4|Добавить выдачу/сдачу оружия\n |5|Завершение программы\nВаш выбор: ");
                choice = sc.nextInt();
            } while (choice < 1 || choice >5);
            switch (choice) {
                case 1:
                    armory.OutputArmory();
                    break;
                case 2:
                    Soldier NewSoldier = new Soldier();
                    NewSoldier.InputSoldier();
                    armory.SoldierToArmory(NewSoldier);
                    armory.OutputArmory();
                    break;
                case 3:
                    Weapon NewWeapon = new Weapon();
                    Company NewCompany = new Company();
                    NewCompany.InputCompany();
                    NewWeapon.InputWeapon(NewCompany);
                    armory.WeaponToArmory(NewWeapon);
                    armory.OutputArmory();
                    break;
                case 4:
                    Weapon NewWeapon1 = new Weapon();
                    Company NewCompany1 = new Company();
                    NewCompany1.InputCompany();
                    NewWeapon1.InputWeapon(NewCompany1);
                    Soldier NewSoldier1 = new Soldier();
                    NewSoldier1.InputSoldier();
                    Control NewOperation = new Control();
                    NewOperation.InputControl(NewWeapon1,NewSoldier1);
                    armory.OperationToArmory(operation);
                    armory.OutputArmory();
                    break;
                case 5:
                    int yesno;
                    do {
                        System.out.println("Вы уверены, что хотите выйти?\n|1|Да\n|2|Нет\nВаш выбор: ");
                        yesno = sc.nextInt();
                    } while (yesno != 1 && yesno != 2);
                    if (yesno == 1) {
                        exit = 1;
                        break;
                    }
            }
        } while (exit == 0);
    }
}