package com.example.demolocation.location.domain.dto;

import org.springframework.data.geo.Point;

public interface LocationDistanceDto {

  Long getId();
  Float getLng();

  Float getLat();
  Double getDistance();
}
