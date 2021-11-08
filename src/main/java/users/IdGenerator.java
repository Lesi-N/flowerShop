package users;

public class IdGenerator {
    static int globalid = 0;

    public static int generate() {
        globalid++;
        return globalid;
    }
}
