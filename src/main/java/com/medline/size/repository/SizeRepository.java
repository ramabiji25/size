package com.medline.size.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medline.size.entity.Size;
@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {

}
