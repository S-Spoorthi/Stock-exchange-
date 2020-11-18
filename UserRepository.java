package com.waleed.stock.training;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(nativeQuery=true,value="select * from user")List<User> searchUser();
}
