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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * MatrixRequest
 */

public class MatrixRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("points")
  private List<List<Double>> points = null;

  @SerializedName("from_points")
  private List<List<Double>> fromPoints = null;

  @SerializedName("to_points")
  private List<List<Double>> toPoints = null;

  @SerializedName("point_hints")
  private List<String> pointHints = null;

  @SerializedName("from_point_hints")
  private List<String> fromPointHints = null;

  @SerializedName("to_point_hints")
  private List<String> toPointHints = null;

  @SerializedName("out_arrays")
  private List<String> outArrays = null;

  @SerializedName("vehicle")
  private String vehicle = null;

  public MatrixRequest points(List<List<Double>> points) {
    this.points = points;
    return this;
  }

  public MatrixRequest addPointsItem(List<Double> pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<List<Double>>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude.
   * @return points
  **/
  @ApiModelProperty(value = "Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude.")
  public List<List<Double>> getPoints() {
    return points;
  }

  public void setPoints(List<List<Double>> points) {
    this.points = points;
  }

  public MatrixRequest fromPoints(List<List<Double>> fromPoints) {
    this.fromPoints = fromPoints;
    return this;
  }

  public MatrixRequest addFromPointsItem(List<Double> fromPointsItem) {
    if (this.fromPoints == null) {
      this.fromPoints = new ArrayList<List<Double>>();
    }
    this.fromPoints.add(fromPointsItem);
    return this;
  }

   /**
   * The starting points for the routes. E.g. if you want to calculate the three routes A-&amp;gt;1, A-&amp;gt;2, A-&amp;gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude.
   * @return fromPoints
  **/
  @ApiModelProperty(value = "The starting points for the routes. E.g. if you want to calculate the three routes A-&gt;1, A-&gt;2, A-&gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude.")
  public List<List<Double>> getFromPoints() {
    return fromPoints;
  }

  public void setFromPoints(List<List<Double>> fromPoints) {
    this.fromPoints = fromPoints;
  }

  public MatrixRequest toPoints(List<List<Double>> toPoints) {
    this.toPoints = toPoints;
    return this;
  }

  public MatrixRequest addToPointsItem(List<Double> toPointsItem) {
    if (this.toPoints == null) {
      this.toPoints = new ArrayList<List<Double>>();
    }
    this.toPoints.add(toPointsItem);
    return this;
  }

   /**
   * The destination points for the routes. Is a string with the format longitude,latitude.
   * @return toPoints
  **/
  @ApiModelProperty(value = "The destination points for the routes. Is a string with the format longitude,latitude.")
  public List<List<Double>> getToPoints() {
    return toPoints;
  }

  public void setToPoints(List<List<Double>> toPoints) {
    this.toPoints = toPoints;
  }

  public MatrixRequest pointHints(List<String> pointHints) {
    this.pointHints = pointHints;
    return this;
  }

  public MatrixRequest addPointHintsItem(String pointHintsItem) {
    if (this.pointHints == null) {
      this.pointHints = new ArrayList<String>();
    }
    this.pointHints.add(pointHintsItem);
    return this;
  }

   /**
   * Optional parameter. Specifies a hint for each point in the &#x60;points&#x60; array to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up.
   * @return pointHints
  **/
  @ApiModelProperty(value = "Optional parameter. Specifies a hint for each point in the `points` array to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up.")
  public List<String> getPointHints() {
    return pointHints;
  }

  public void setPointHints(List<String> pointHints) {
    this.pointHints = pointHints;
  }

  public MatrixRequest fromPointHints(List<String> fromPointHints) {
    this.fromPointHints = fromPointHints;
    return this;
  }

  public MatrixRequest addFromPointHintsItem(String fromPointHintsItem) {
    if (this.fromPointHints == null) {
      this.fromPointHints = new ArrayList<String>();
    }
    this.fromPointHints.add(fromPointHintsItem);
    return this;
  }

   /**
   * More information for the &#x60;from_points&#x60; array. See &#x60;point_hints&#x60;
   * @return fromPointHints
  **/
  @ApiModelProperty(value = "More information for the `from_points` array. See `point_hints`")
  public List<String> getFromPointHints() {
    return fromPointHints;
  }

  public void setFromPointHints(List<String> fromPointHints) {
    this.fromPointHints = fromPointHints;
  }

  public MatrixRequest toPointHints(List<String> toPointHints) {
    this.toPointHints = toPointHints;
    return this;
  }

  public MatrixRequest addToPointHintsItem(String toPointHintsItem) {
    if (this.toPointHints == null) {
      this.toPointHints = new ArrayList<String>();
    }
    this.toPointHints.add(toPointHintsItem);
    return this;
  }

   /**
   * More information for the &#x60;to_points&#x60; array. See &#x60;point_hints&#x60;
   * @return toPointHints
  **/
  @ApiModelProperty(value = "More information for the `to_points` array. See `point_hints`")
  public List<String> getToPointHints() {
    return toPointHints;
  }

  public void setToPointHints(List<String> toPointHints) {
    this.toPointHints = toPointHints;
  }

  public MatrixRequest outArrays(List<String> outArrays) {
    this.outArrays = outArrays;
    return this;
  }

  public MatrixRequest addOutArraysItem(String outArraysItem) {
    if (this.outArrays == null) {
      this.outArrays = new ArrayList<String>();
    }
    this.outArrays.add(outArraysItem);
    return this;
  }

   /**
   * Specifies which arrays should be included in the response. Specify one or more of the following options &#39;weights&#39;, &#39;times&#39;, &#39;distances&#39;. To specify more than one array use e.g. out_array&#x3D;times&amp;amp;out_array&#x3D;distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API.
   * @return outArrays
  **/
  @ApiModelProperty(value = "Specifies which arrays should be included in the response. Specify one or more of the following options 'weights', 'times', 'distances'. To specify more than one array use e.g. out_array=times&amp;out_array=distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API.")
  public List<String> getOutArrays() {
    return outArrays;
  }

  public void setOutArrays(List<String> outArrays) {
    this.outArrays = outArrays;
  }

  public MatrixRequest vehicle(String vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * The vehicle for which the route should be calculated. Other vehicles are foot, small_truck etc, see here for the details.
   * @return vehicle
  **/
  @ApiModelProperty(value = "The vehicle for which the route should be calculated. Other vehicles are foot, small_truck etc, see here for the details.")
  public String getVehicle() {
    return vehicle;
  }

  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatrixRequest matrixRequest = (MatrixRequest) o;
    return Objects.equals(this.points, matrixRequest.points) &&
        Objects.equals(this.fromPoints, matrixRequest.fromPoints) &&
        Objects.equals(this.toPoints, matrixRequest.toPoints) &&
        Objects.equals(this.pointHints, matrixRequest.pointHints) &&
        Objects.equals(this.fromPointHints, matrixRequest.fromPointHints) &&
        Objects.equals(this.toPointHints, matrixRequest.toPointHints) &&
        Objects.equals(this.outArrays, matrixRequest.outArrays) &&
        Objects.equals(this.vehicle, matrixRequest.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, fromPoints, toPoints, pointHints, fromPointHints, toPointHints, outArrays, vehicle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatrixRequest {\n");
    
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    fromPoints: ").append(toIndentedString(fromPoints)).append("\n");
    sb.append("    toPoints: ").append(toIndentedString(toPoints)).append("\n");
    sb.append("    pointHints: ").append(toIndentedString(pointHints)).append("\n");
    sb.append("    fromPointHints: ").append(toIndentedString(fromPointHints)).append("\n");
    sb.append("    toPointHints: ").append(toIndentedString(toPointHints)).append("\n");
    sb.append("    outArrays: ").append(toIndentedString(outArrays)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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

