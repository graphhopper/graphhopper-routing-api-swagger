//
// Routing.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

/** This contains all routing specific configurations. */
public struct Routing: Codable {

    public enum NetworkDataProvider: String, Codable { 
        case openstreetmap = "openstreetmap"
        case tomtom = "tomtom"
    }
    /** It lets you specify whether the API should provide you with route geometries for vehicle routes or not. Thus, you do not need to do extra routing to get the polyline for each route. */
    public var calcPoints: Bool?

    /** indicates whether historical traffic information should be considered */
    public var considerTraffic: Bool?
    /** specifies the data provider, read more about it [here](#section/Map-Data-and-Routing-Profiles). */
    public var networkDataProvider: NetworkDataProvider?

    /** indicates whether matrix calculation should fail fast when points cannot be connected */
    public var failFast: Bool?

    /** Indicates whether a solution includes snapped waypoints. In contrary to the address coordinate a snapped waypoint is the access point to the (road) network. */
    public var returnSnappedWaypoints: Bool?
    public init(calcPoints: Bool?, considerTraffic: Bool?, networkDataProvider: NetworkDataProvider?, failFast: Bool?, returnSnappedWaypoints: Bool?) { 
        self.calcPoints = calcPoints
        self.considerTraffic = considerTraffic
        self.networkDataProvider = networkDataProvider
        self.failFast = failFast
        self.returnSnappedWaypoints = returnSnappedWaypoints
    }
    public enum CodingKeys: String, CodingKey { 
        case calcPoints = "calc_points"
        case considerTraffic = "consider_traffic"
        case networkDataProvider = "network_data_provider"
        case failFast = "fail_fast"
        case returnSnappedWaypoints = "return_snapped_waypoints"
    }

}