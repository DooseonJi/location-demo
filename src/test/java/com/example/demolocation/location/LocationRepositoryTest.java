package com.example.demolocation.location;

import com.example.demolocation.location.domain.Location;
import com.example.demolocation.location.infra.LocationRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class LocationRepositoryTest {

  @Autowired
  private LocationRepository locationRepository;

  @Test
  public void findAllWithLocation(){
    var result = locationRepository.getAllWithDistance();
    result.forEach(aResult -> {
      System.out.println(String.format("locationId: %s", aResult.getId()));
      System.out.println(String.format("lng: %s, lat: %s", aResult.getLng(), aResult.getLat()));
      System.out.println(String.format("distance: %s", aResult.getDistance()));
    });
    Assertions.assertNotNull(result);
  }

  @Test
  public void findAll(){
    List<Location> result = locationRepository.findAll();
    result.forEach(location -> {
      System.out.println(String.format("locationId: %s", location.getId()));
      System.out.println(String.format("position: %s", location.getPosition()));
    });
    Assertions.assertNotNull(result);
  }
}
