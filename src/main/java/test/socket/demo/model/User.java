package test.socket.demo.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private String name;
    private String password;
}
