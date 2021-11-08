package users;

import lombok.Data;

@Data
public class Sender implements User {
    int id;
    String status;

    public Sender() {
        this.id = IdGenerator.generate();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
