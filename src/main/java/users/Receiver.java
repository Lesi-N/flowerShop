package users;

import lombok.Data;

@Data
public class Receiver implements User{
    int id;
    String status;

    public Receiver() {
        this.id = IdGenerator.generate();
    }
    @Override
    public void update(String status) {
        this.status = status;
    }
}
