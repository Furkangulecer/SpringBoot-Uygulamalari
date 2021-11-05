package com.examples.repository;

import com.examples.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository  <Kullanici ,String>{



}
