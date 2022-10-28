package com.example.demolocation.location.infra;

import com.example.demolocation.location.domain.Location;
import com.example.demolocation.location.domain.dto.LocationDistanceDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

  @Query(value = ""
      + "select l.location_id as id, st_x(l.position) as lng, st_y(l.position) as lat, "
      + " st_distance_sphere(position, Point(127.0341289, 37.4990484)) as distance "
      + "from app_location as l "
      + "order by distance",
  nativeQuery = true)
  List<LocationDistanceDto> getAllWithDistance();

}
