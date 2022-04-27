package uz.pdp.comunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Tariff {
    @Id
    @GeneratedValue
    private UUID id;

    String name;

    boolean jismoniyShaxs;

    private double tariffPrice;

    private double changeTariffPrice;

    private Timestamp startedAt;

    private Timestamp deadline;

    private double mb;

    private double sms;

    private double minute;

    private boolean active;

    @OneToOne
    private USSDCode ussdCode;

    @OneToOne
    private User user;
}
