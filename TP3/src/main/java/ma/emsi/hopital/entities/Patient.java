package ma.emsi.hopital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 


public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    private int score;

    /* TODO */
    // @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    // private Collection<RendezVous> rendezVous;
}
