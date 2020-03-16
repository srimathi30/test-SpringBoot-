package com.example.test;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends MongoRepository<Device,String> {
		
//		public Device findByModelName(String name);
//		public List<Device> findByVersion(String version);

}
