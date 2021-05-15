package concretes;

import abstracts.UserCheckService;
import entities.Gamer;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean chechkIfRealPerson(Gamer gamer) {
        return true;
    }
}