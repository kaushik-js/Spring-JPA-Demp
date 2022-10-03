package com.kosec.secondapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.kosec.secondapp.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord,String>
{

}