import model.People;
import services.PeopleService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        PeopleService peopleService = new PeopleService();
        People people = new People("Igor","Ukupnikaa");
        peopleService.savePeople(people);

    }
}
