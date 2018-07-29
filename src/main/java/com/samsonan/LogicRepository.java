package com.samsonan;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogicRepository extends CrudRepository<Logic, Long> {

    List<Logic> findById(Logic id);
}