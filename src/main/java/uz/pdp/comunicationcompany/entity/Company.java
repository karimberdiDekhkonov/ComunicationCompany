package uz.pdp.comunicationcompany.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.comunicationcompany.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Company extends AbsEntity {

}
