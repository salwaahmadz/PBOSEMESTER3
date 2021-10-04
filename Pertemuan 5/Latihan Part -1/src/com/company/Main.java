package com.company;

//Player
class Player{
    String name;
    double health;
    int level;

    //Object Member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        //Akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }else{
            damage=0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " +damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " +this.name);
        System.out.println("Health : " +this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon : " +this.name + " , power : " + this.attackPower);
    }
}

class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + ", defence");
    }
}

public class Main {

    public static void main(String[] args) {

        //Membuat Object Player
        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("Tatang", 50);

        //Membuat Object Weapon
        Weapon pedang = new Weapon("Pedang",15);
        Weapon ketapel = new Weapon("Ketapel",1);

        //Membuat Object Armor
        Armor bajubesi = new Armor("Baju Besi",10);
        Armor kaos = new Armor("Kaos",0);

        //Player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajubesi);
        player1.display();

        //Player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEPISODE - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEPISODE - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
