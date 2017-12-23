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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SolutionUnassigned
 */

public class SolutionUnassigned {
  @SerializedName("services")
  private List<String> services = null;

  @SerializedName("shipments")
  private List<String> shipments = null;

  public SolutionUnassigned services(List<String> services) {
    this.services = services;
    return this;
  }

  public SolutionUnassigned addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * An array of ids of unassigned services
   * @return services
  **/
  @ApiModelProperty(value = "An array of ids of unassigned services")
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public SolutionUnassigned shipments(List<String> shipments) {
    this.shipments = shipments;
    return this;
  }

  public SolutionUnassigned addShipmentsItem(String shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<String>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * An array of ids of unassigned shipments
   * @return shipments
  **/
  @ApiModelProperty(value = "An array of ids of unassigned shipments")
  public List<String> getShipments() {
    return shipments;
  }

  public void setShipments(List<String> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionUnassigned solutionUnassigned = (SolutionUnassigned) o;
    return Objects.equals(this.services, solutionUnassigned.services) &&
        Objects.equals(this.shipments, solutionUnassigned.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, shipments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionUnassigned {\n");
    
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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

