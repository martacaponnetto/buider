/*Crea una classe Person con i campi firstName, lastName, age e address,
i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video*/
public class Main {
    public static void main(String[] args) {
        Person person1 = new Builder("Marta", "Caponnetto", 29, "via Messina" ).build();
        System.out.println(person1);
        Person person2 = new Builder("Gino", "Rossi", 30, "via U.Foscolo").setHeight(180).build();
        System.out.println(person2);

        //ho inserito una variabile opzionale in più che sarebbe "height"



    }
}