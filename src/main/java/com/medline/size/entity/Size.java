package com.medline.size.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Size {
	@Id
	@Column(name="size_id")
	private Long sizeid;
	@Column(name="size_name")
	private String sizename;

}
