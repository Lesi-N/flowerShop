package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    Connection con1 = Connection.getConnection();
    Connection con2 = Connection.getConnection();
    @BeforeEach
    void setUp() {
    }

    @Test
    void getConnection() {
        assertSame(con1, con2);
    }
}