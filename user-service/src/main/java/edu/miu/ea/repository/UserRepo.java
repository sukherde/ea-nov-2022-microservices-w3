package edu.miu.ea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.ea.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
