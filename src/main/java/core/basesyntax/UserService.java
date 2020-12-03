package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (int i = 0; i < records.length; i++) {
            if (records[i].substring(0, records[i].indexOf(":")).equals(email)) {
                email = records[i].substring(records[i].indexOf(":") + 1);
                return Integer.parseInt(email);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
