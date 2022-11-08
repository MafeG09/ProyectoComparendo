package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Infractor implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String numeroDocumento;

    private String tipoDocumento;

    private String tipoInfractor;

    private String nombre;

    private String apellido;

    private String direccion;

    private String telefono;

    private String edad;

    private String municipio;

    @OneToMany(mappedBy = "infractor")
    private List<Comparendo> comparendos;

    @OneToMany(mappedBy = "infractor")
    private List<Licencia> licencias;

}
