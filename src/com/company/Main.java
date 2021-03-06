package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b = new Boss();
        b.setBossDefence("Magical, ");
        b.setBossDamage(70);
        b.setBossHealth(400);
        System.out.println(b.getBossDefence() + b.getBossHealth() + " HP, [" + b.getBossDamage() + "]  ");
        Main hero = new Main();
        Hero[] heroes = hero.createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(heroes[i].getHeroesAttackType() + " " + heroes[i].getHeroesHealth() + " " + heroes[i].getHeroesDamage());
        }

    }

    public static Hero[] createHeroes() {
        Hero physical = new Hero("Vision", 30, 300);
        Hero magical = new Hero("Gamora", 50, 300);
        Hero kinetic = new Hero("Iron Man", 60, 300);

        Hero[] heroes = {magical, kinetic, physical};

        return heroes;
    }


}
/*
Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
● Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
Добавить в класс геттеры и сеттеры для всех полей.
● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
Затем распечатать всю информацию о боссе.
 */
/*
Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй). Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes.
● Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл


*/
