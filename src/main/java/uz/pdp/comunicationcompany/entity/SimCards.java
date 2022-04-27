package uz.pdp.comunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SimCards {
    @Id
    @GeneratedValue
    private UUID id;

    private boolean active;

    @Column(unique = true)
    private String number;

    @ManyToOne
    private User user;
}
