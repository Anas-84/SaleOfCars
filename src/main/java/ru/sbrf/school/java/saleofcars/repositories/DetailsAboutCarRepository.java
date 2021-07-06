package ru.sbrf.school.java.saleofcars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.school.java.saleofcars.entities.Detail;

public interface DetailsAboutCarRepository extends JpaRepository<Detail, Integer> {

}


