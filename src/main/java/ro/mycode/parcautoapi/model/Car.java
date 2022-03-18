package ro.mycode.parcautoapi.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Data// @Data se foloseste pt gettere si settere
@Entity(name="Car") // clasa Car este o entitate pe care trebuie sa o mentionam;
@Table(name="cars") //tabelul pentru baza de date
public class Car {
    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO
    )
    Long id;
    private int idM;
    private String marcaM;
    private int pretM;
    private int anM;

}
