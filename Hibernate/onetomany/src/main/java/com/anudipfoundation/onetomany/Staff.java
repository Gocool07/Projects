package com.anudipfoundation.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int staff_id;
	private String staff_name;
	private String staff_designation;
	private int salary; 
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="staff_id")
    
    private List<Batch>batches;
}
