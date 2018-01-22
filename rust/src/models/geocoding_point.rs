/* 
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct GeocodingPoint {
  /// Latitude
  #[serde(rename = "lat")]
  lat: Option<f64>,
  /// Longitude
  #[serde(rename = "lng")]
  lng: Option<f64>
}

impl GeocodingPoint {
  pub fn new() -> GeocodingPoint {
    GeocodingPoint {
      lat: None,
      lng: None
    }
  }

  pub fn set_lat(&mut self, lat: f64) {
    self.lat = Some(lat);
  }

  pub fn with_lat(mut self, lat: f64) -> GeocodingPoint {
    self.lat = Some(lat);
    self
  }

  pub fn lat(&self) -> Option<&f64> {
    self.lat.as_ref()
  }

  pub fn reset_lat(&mut self) {
    self.lat = None;
  }

  pub fn set_lng(&mut self, lng: f64) {
    self.lng = Some(lng);
  }

  pub fn with_lng(mut self, lng: f64) -> GeocodingPoint {
    self.lng = Some(lng);
    self
  }

  pub fn lng(&self) -> Option<&f64> {
    self.lng.as_ref()
  }

  pub fn reset_lng(&mut self) {
    self.lng = None;
  }

}


