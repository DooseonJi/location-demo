package com.example.demolocation.location.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.geolatte.geom.Point;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "app_location")
public class Location {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "location_id", nullable = false)
  private Integer id;

  @Column(name = "position", columnDefinition = "geometry")
  private Point position;
}
