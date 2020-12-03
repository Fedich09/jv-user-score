package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        String emailFromRecords = "";
        int indexChar = 0;
        int returnValue = 0;
        for (int i = 0; i < records.length; i++) {
            indexChar = records[i].indexOf(":");
            emailFromRecords = records[i].substring(0, indexChar);
            if (emailFromRecords.equals(email)) {
                returnValue = Integer.parseInt(records[i].substring(indexChar + 1));
            }
        }
        if (returnValue == 0) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return returnValue;
    }
}
