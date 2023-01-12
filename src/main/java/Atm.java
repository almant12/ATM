import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Atm {

    private String name;

    private String password;

    private Integer balance = 0;
}
