package uz.pdp.comunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.comunicationcompany.entity.enums.UserType;

import javax.persistence.*;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Users {
    @Id
    @GeneratedValue
    private UUID id;

    private String fullName;

    @Enumerated(value = EnumType.STRING)
    private UserType userType;

    private String email;

    private String password;

    @OneToOne
    private Address address;
 }
