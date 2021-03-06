package com.company;

public class Hero {
    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    private String heroesAttackType;
    private int heroesHealth;
    private int heroesDamage;

    public Hero() {
    }

    public Hero(String heroesAttackType, int heroesDamage, int heroesHealth) {
        this.heroesAttackType = heroesAttackType;
        this.heroesDamage = heroesDamage;
        this.heroesHealth = heroesHealth;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;

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