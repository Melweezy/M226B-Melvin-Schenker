package AB02;

public class AB02 {
    public static void main(String[] args) {
        Chef chef = new Chef("Schenker", "Melvin", 1, "Tech");
        Fachangestellter f1 = new Fachangestellter("XY", "Z", 2, chef);
        System.out.println(chef.abteilung + ", " + f1.name + " " + f1.vorname);

        Firma f = new Firma(new Person[]{
                new Fachangestellter("FA", "Eins", 22, new Chef("Cheffo", "Eins", 12, "Gam")),
                new Lernende("LE","Eins",23,4),
                new Lernende("LE","Zwei",22,1),
        });
    }
}

class Person{
    protected String name;
    protected String vorname;
    protected int id;

    public Person(String name, String vorname, int id){
        this.name = name;
        this.vorname = vorname;
        this.id = id;
    }
}

class Chef extends Person{
    protected String abteilung;
    public Chef(String name, String vorname, int id, String abteilung){
        super(name,vorname,id);
        this.abteilung = abteilung;
    }
}

class Fachangestellter extends Person{
    protected Chef vorgesetzter;
    public Fachangestellter(String name, String vorname, int id, Chef vorgesetzter){
        super(name,vorname,id);
        this.vorgesetzter = vorgesetzter;
    }
}

class Lernende extends Person{
    protected int lehrjahr;
    public Lernende(String name, String vorname, int id, int lehrjahr){
        super(name,vorname,id);
        this.lehrjahr = lehrjahr;
    }
}

class Firma{
    protected Person[] mitarbeiter;
    public Firma(Person[] mitarbeiter){
        this.mitarbeiter = mitarbeiter;
    }
}