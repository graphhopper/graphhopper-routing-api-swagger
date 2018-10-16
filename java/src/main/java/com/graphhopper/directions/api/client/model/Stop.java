/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.graphhopper.directions.api.client.model.Address;
import com.graphhopper.directions.api.client.model.TimeWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Stop
 */

public class Stop implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("preparation_time")
  private Long preparationTime = null;

  @SerializedName("time_windows")
  private List<TimeWindow> timeWindows = null;

  public Stop address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Stop duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * duration of stop, i.e. time in seconds the corresponding activity takes
   * @return duration
  **/
  @ApiModelProperty(value = "duration of stop, i.e. time in seconds the corresponding activity takes")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Stop preparationTime(Long preparationTime) {
    this.preparationTime = preparationTime;
    return this;
  }

   /**
   * preparation time of service, e.g. search for a parking space. it only falls due if the location of previous activity differs from this location
   * @return preparationTime
  **/
  @ApiModelProperty(value = "preparation time of service, e.g. search for a parking space. it only falls due if the location of previous activity differs from this location")
  public Long getPreparationTime() {
    return preparationTime;
  }

  public void setPreparationTime(Long preparationTime) {
    this.preparationTime = preparationTime;
  }

  public Stop timeWindows(List<TimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
    return this;
  }

  public Stop addTimeWindowsItem(TimeWindow timeWindowsItem) {
    if (this.timeWindows == null) {
      this.timeWindows = new ArrayList<TimeWindow>();
    }
    this.timeWindows.add(timeWindowsItem);
    return this;
  }

   /**
   * array of time windows. currently, only a single time window is allowed
   * @return timeWindows
  **/
  @ApiModelProperty(value = "array of time windows. currently, only a single time window is allowed")
  public List<TimeWindow> getTimeWindows() {
    return timeWindows;
  }

  public void setTimeWindows(List<TimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stop stop = (Stop) o;
    return Objects.equals(this.address, stop.address) &&
        Objects.equals(this.duration, stop.duration) &&
        Objects.equals(this.preparationTime, stop.preparationTime) &&
        Objects.equals(this.timeWindows, stop.timeWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, duration, preparationTime, timeWindows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    preparationTime: ").append(toIndentedString(preparationTime)).append("\n");
    sb.append("    timeWindows: ").append(toIndentedString(timeWindows)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

