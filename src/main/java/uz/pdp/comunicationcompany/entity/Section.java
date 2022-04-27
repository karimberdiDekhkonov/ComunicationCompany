package uz.pdp.comunicationcompany.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.comunicationcompany.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Section extends AbsEntity {

    @ManyToOne
    private Company company;
}
