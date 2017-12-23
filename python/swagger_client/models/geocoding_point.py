# coding: utf-8

"""
    GraphHopper Directions API

    You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class GeocodingPoint(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """


    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'lat': 'float',
        'lng': 'float'
    }

    attribute_map = {
        'lat': 'lat',
        'lng': 'lng'
    }

    def __init__(self, lat=None, lng=None):
        """
        GeocodingPoint - a model defined in Swagger
        """

        self._lat = None
        self._lng = None

        if lat is not None:
          self.lat = lat
        if lng is not None:
          self.lng = lng

    @property
    def lat(self):
        """
        Gets the lat of this GeocodingPoint.
        Latitude

        :return: The lat of this GeocodingPoint.
        :rtype: float
        """
        return self._lat

    @lat.setter
    def lat(self, lat):
        """
        Sets the lat of this GeocodingPoint.
        Latitude

        :param lat: The lat of this GeocodingPoint.
        :type: float
        """

        self._lat = lat

    @property
    def lng(self):
        """
        Gets the lng of this GeocodingPoint.
        Longitude

        :return: The lng of this GeocodingPoint.
        :rtype: float
        """
        return self._lng

    @lng.setter
    def lng(self, lng):
        """
        Sets the lng of this GeocodingPoint.
        Longitude

        :param lng: The lng of this GeocodingPoint.
        :type: float
        """

        self._lng = lng

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, GeocodingPoint):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
