package AB03;

abstract class Person{
    protected String name;
    protected String vorname;
    protected int id;
    protected int alter;

    public Person(String n, String v, int i, int a){
        name = n;
        vorname = v;
        id = i;
        alter = a;
    }

    public void print(Person person, int ferien){
        System.out.println("---------------------------------------------");
        System.out.println("Name: " + person.name);
        System.out.println("Vorname: " + person.vorname);
        System.out.println("Id: " + person.id);
        System.out.println("Ferien: " + ferien + " Wochen");
    }

    public abstract int ferienBerechnen(int alter);
}

class Chef extends Person {
    protected String abteilung;
    public Chef(String n, String v, int i, int al, String a){
        super(n,v,i,al);
        abteilung = a;
    }
    public int ferienBerechnen(int alter){
        if(alter < 45){
            return 4;
        }else if (44 < alter && alter < 54){
            return 5;
        }else{
            return 6;
        }
    }
}

class Fachangestellter extends Person {
    protected Chef vorgesetzter;
    public Fachangestellter(String n, String v, int i, int a, Chef vor){
        super(n,v,i,a);
        vorgesetzter = vor;
    }
    public int ferienBerechnen(int alter){
        if(alter < 50){
            return 4;
        }else if (49 < alter && alter < 59){
            return 5;
        }else{
            return 6;
        }
    }
}

class Lernender extends Person {
    protected Chef vorgesetzter;
    public Lernender(String n, String v, int i, int a, Chef vor){
        super(n,v,i,a);
        vorgesetzter = vor;
    }
    public int ferienBerechnen(int alter){
        return 5;
    }
}

class Firma{
    protected Person[] mitarbeiter;
    public Firma(Person[] m){
        mitarbeiter = m;
    }
}

public class AB03 {
    public static void main(String[] args) {
        Person[] angestellte = new Person[4];
        angestellte[0] = new Chef("chef", "chefchef", 1, 53, "firma");
        angestellte[1] = new Fachangestellter("f1", "f1", 2, 25, (Chef) angestellte[0]);
        angestellte[2] = new Fachangestellter("f2", "f2", 3, 62, (Chef) angestellte[0]);
        angestellte[3] = new Lernender("l1", "l2", 4, 20, (Chef) angestellte[0]);

        for (Person angestellter : angestellte) {
            angestellter.print(angestellter, angestellter.ferienBerechnen(angestellter.alter));
        }
    }
}
