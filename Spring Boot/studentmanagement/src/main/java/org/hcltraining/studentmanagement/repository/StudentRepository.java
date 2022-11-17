package org.hcltraining.studentmanagement.repository;

import org.hcltraining.studentmanagement.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}