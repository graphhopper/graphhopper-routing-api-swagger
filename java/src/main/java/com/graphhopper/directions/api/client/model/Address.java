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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Address
 */

public class Address implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("location_id")
  private String locationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lon")
  private Double lon = null;

  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("street_hint")
  private String streetHint = null;

  public Address locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Unique identifier of location
   * @return locationId
  **/
  @ApiModelProperty(value = "Unique identifier of location")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Address name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of location, e.g. street name plus house number
   * @return name
  **/
  @ApiModelProperty(value = "name of location, e.g. street name plus house number")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address lon(Double lon) {
    this.lon = lon;
    return this;
  }

   /**
   * longitude
   * @return lon
  **/
  @ApiModelProperty(value = "longitude")
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public Address lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * latitude
   * @return lat
  **/
  @ApiModelProperty(value = "latitude")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Address streetHint(String streetHint) {
    this.streetHint = streetHint;
    return this;
  }

   /**
   * Optional parameter. Specifies a hint for each address to better snap the coordinates (lon,lat) to road network. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up.
   * @return streetHint
  **/
  @ApiModelProperty(value = "Optional parameter. Specifies a hint for each address to better snap the coordinates (lon,lat) to road network. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up.")
  public String getStreetHint() {
    return streetHint;
  }

  public void setStreetHint(String streetHint) {
    this.streetHint = streetHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.locationId, address.locationId) &&
        Objects.equals(this.name, address.name) &&
        Objects.equals(this.lon, address.lon) &&
        Objects.equals(this.lat, address.lat) &&
        Objects.equals(this.streetHint, address.streetHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, lon, lat, streetHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    streetHint: ").append(toIndentedString(streetHint)).append("\n");
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

