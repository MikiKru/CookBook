package utility;

import model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryDB {
    public static List<User> users = new ArrayList<User>(
            Arrays.asList(
                    new User("test","test"),
                    new User("test1","test1"),
                    new User("test2","test2")
            )
    );
}
