package com.github.churakovia.planner.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Событие планировщика.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

  private String id;
  private String title;
  private String description;
  private Date started = new Date();
  private boolean enabled = true;
  private String cron;
}
