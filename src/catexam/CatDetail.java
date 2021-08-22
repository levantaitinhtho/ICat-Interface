package catexam;

import java.util.Scanner;

public class CatDetail implements ICat{
    String species;
    String color;
    String where;

    public CatDetail() {
    }

    public CatDetail(String species, String color, String where) {
        this.species = species;
        this.color = color;
        this.where = where;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    @Override
    public void input() {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter Species: ");
        species = input.nextLine();
        System.out.println("Enter Color: ");
        color = input.nextLine();
        System.out.println("Where to live: ");
        where = input.nextLine();
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CatDetail{" +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", where='" + where + '\'' +
                ",name='"+ Name+'\''+
                '}';
    }
}
