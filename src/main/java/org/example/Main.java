import net.datafaker.Faker;
import org.example.EroeNonIdoneoException;
import org.example.Hero;

import static java.lang.IO.println;


void main(){
    Faker faker = new Faker();

    int difficoltaMissione = 75;

    try {
        for (int i = 0; i < 5; i++) {
            Hero hero = new Hero(faker.superhero().name(), faker.superhero().power(), faker.number().numberBetween(0, 100));

            hero.svolgimentoMissione(hero.getPowerLevel());
        }
    } catch (EroeNonIdoneoException e) {
        println("Errore:" + e.getMessage());
    } catch (Exception ex) {
        println("errore generale:" + ex.getMessage());
    }

}