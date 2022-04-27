package uz.pdp.comunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.comunicationcompany.entity.Bank;
import uz.pdp.comunicationcompany.entity.enums.CradType;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Card {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Bank bank;

    private int CVV;

    private Date expireDate;

    private int password;

    @Enumerated(value = EnumType.STRING)
    private CradType cardType;
}
