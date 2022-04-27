package uz.pdp.comunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Bankamat {
    @Id
    @GeneratedValue
    private UUID id;

    private double maxMoney;

    @ManyToOne
    private Bank bank;

    @OneToOne
    private Address address;
}
