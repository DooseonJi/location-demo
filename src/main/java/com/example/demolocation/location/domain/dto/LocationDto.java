package com.example.demolocation.location.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.geolatte.geom.Point;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {

  private Long id;
  private Point position;
  private Double distance;
}
