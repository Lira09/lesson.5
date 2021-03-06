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
        Hero magical = new Hero( 50, 300);
        Hero kinetic = new Hero( "Gamora",60, 300);

        Hero[] heroes = {magical, kinetic, physical};

        return heroes;
    }


}
