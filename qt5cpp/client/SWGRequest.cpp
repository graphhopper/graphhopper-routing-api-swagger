/**
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


#include "SWGRequest.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGRequest::SWGRequest(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRequest::SWGRequest() {
    init();
}

SWGRequest::~SWGRequest() {
    this->cleanup();
}

void
SWGRequest::init() {
    vehicles = new QList<SWGVehicle*>();
    vehicle_types = new QList<SWGVehicleType*>();
    services = new QList<SWGService*>();
    shipments = new QList<SWGShipment*>();
    relations = new QList<SWGRelation*>();
    algorithm = new SWGAlgorithm();
    objectives = new QList<SWGObjective*>();
    cost_matrices = new QList<SWGCostMatrix*>();
    configuration = new SWGConfiguration();
}

void
SWGRequest::cleanup() {
    
    if(vehicles != nullptr) {
        QList<SWGVehicle*>* arr = vehicles;
        foreach(SWGVehicle* o, *arr) {
            delete o;
        }
        delete vehicles;
    }

    if(vehicle_types != nullptr) {
        QList<SWGVehicleType*>* arr = vehicle_types;
        foreach(SWGVehicleType* o, *arr) {
            delete o;
        }
        delete vehicle_types;
    }

    if(services != nullptr) {
        QList<SWGService*>* arr = services;
        foreach(SWGService* o, *arr) {
            delete o;
        }
        delete services;
    }

    if(shipments != nullptr) {
        QList<SWGShipment*>* arr = shipments;
        foreach(SWGShipment* o, *arr) {
            delete o;
        }
        delete shipments;
    }

    if(relations != nullptr) {
        QList<SWGRelation*>* arr = relations;
        foreach(SWGRelation* o, *arr) {
            delete o;
        }
        delete relations;
    }

    if(algorithm != nullptr) {
        delete algorithm;
    }

    if(objectives != nullptr) {
        QList<SWGObjective*>* arr = objectives;
        foreach(SWGObjective* o, *arr) {
            delete o;
        }
        delete objectives;
    }

    if(cost_matrices != nullptr) {
        QList<SWGCostMatrix*>* arr = cost_matrices;
        foreach(SWGCostMatrix* o, *arr) {
            delete o;
        }
        delete cost_matrices;
    }

    if(configuration != nullptr) {
        delete configuration;
    }
}

SWGRequest*
SWGRequest::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRequest::fromJsonObject(QJsonObject &pJson) {
    
    ::Swagger::setValue(&vehicles, pJson["vehicles"], "QList", "SWGVehicle");
    
    
    ::Swagger::setValue(&vehicle_types, pJson["vehicle_types"], "QList", "SWGVehicleType");
    
    
    ::Swagger::setValue(&services, pJson["services"], "QList", "SWGService");
    
    
    ::Swagger::setValue(&shipments, pJson["shipments"], "QList", "SWGShipment");
    
    
    ::Swagger::setValue(&relations, pJson["relations"], "QList", "SWGRelation");
    
    ::Swagger::setValue(&algorithm, pJson["algorithm"], "SWGAlgorithm", "SWGAlgorithm");
    
    ::Swagger::setValue(&objectives, pJson["objectives"], "QList", "SWGObjective");
    
    
    ::Swagger::setValue(&cost_matrices, pJson["cost_matrices"], "QList", "SWGCostMatrix");
    
    ::Swagger::setValue(&configuration, pJson["configuration"], "SWGConfiguration", "SWGConfiguration");
}

QString
SWGRequest::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRequest::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    QJsonArray vehiclesJsonArray;
    toJsonArray((QList<void*>*)vehicles, &vehiclesJsonArray, "vehicles", "SWGVehicle");
    obj->insert("vehicles", vehiclesJsonArray);

    QJsonArray vehicle_typesJsonArray;
    toJsonArray((QList<void*>*)vehicle_types, &vehicle_typesJsonArray, "vehicle_types", "SWGVehicleType");
    obj->insert("vehicle_types", vehicle_typesJsonArray);

    QJsonArray servicesJsonArray;
    toJsonArray((QList<void*>*)services, &servicesJsonArray, "services", "SWGService");
    obj->insert("services", servicesJsonArray);

    QJsonArray shipmentsJsonArray;
    toJsonArray((QList<void*>*)shipments, &shipmentsJsonArray, "shipments", "SWGShipment");
    obj->insert("shipments", shipmentsJsonArray);

    QJsonArray relationsJsonArray;
    toJsonArray((QList<void*>*)relations, &relationsJsonArray, "relations", "SWGRelation");
    obj->insert("relations", relationsJsonArray);

    toJsonValue(QString("algorithm"), algorithm, obj, QString("SWGAlgorithm"));

    QJsonArray objectivesJsonArray;
    toJsonArray((QList<void*>*)objectives, &objectivesJsonArray, "objectives", "SWGObjective");
    obj->insert("objectives", objectivesJsonArray);

    QJsonArray cost_matricesJsonArray;
    toJsonArray((QList<void*>*)cost_matrices, &cost_matricesJsonArray, "cost_matrices", "SWGCostMatrix");
    obj->insert("cost_matrices", cost_matricesJsonArray);

    toJsonValue(QString("configuration"), configuration, obj, QString("SWGConfiguration"));

    return obj;
}

QList<SWGVehicle*>*
SWGRequest::getVehicles() {
    return vehicles;
}
void
SWGRequest::setVehicles(QList<SWGVehicle*>* vehicles) {
    this->vehicles = vehicles;
}

QList<SWGVehicleType*>*
SWGRequest::getVehicleTypes() {
    return vehicle_types;
}
void
SWGRequest::setVehicleTypes(QList<SWGVehicleType*>* vehicle_types) {
    this->vehicle_types = vehicle_types;
}

QList<SWGService*>*
SWGRequest::getServices() {
    return services;
}
void
SWGRequest::setServices(QList<SWGService*>* services) {
    this->services = services;
}

QList<SWGShipment*>*
SWGRequest::getShipments() {
    return shipments;
}
void
SWGRequest::setShipments(QList<SWGShipment*>* shipments) {
    this->shipments = shipments;
}

QList<SWGRelation*>*
SWGRequest::getRelations() {
    return relations;
}
void
SWGRequest::setRelations(QList<SWGRelation*>* relations) {
    this->relations = relations;
}

SWGAlgorithm*
SWGRequest::getAlgorithm() {
    return algorithm;
}
void
SWGRequest::setAlgorithm(SWGAlgorithm* algorithm) {
    this->algorithm = algorithm;
}

QList<SWGObjective*>*
SWGRequest::getObjectives() {
    return objectives;
}
void
SWGRequest::setObjectives(QList<SWGObjective*>* objectives) {
    this->objectives = objectives;
}

QList<SWGCostMatrix*>*
SWGRequest::getCostMatrices() {
    return cost_matrices;
}
void
SWGRequest::setCostMatrices(QList<SWGCostMatrix*>* cost_matrices) {
    this->cost_matrices = cost_matrices;
}

SWGConfiguration*
SWGRequest::getConfiguration() {
    return configuration;
}
void
SWGRequest::setConfiguration(SWGConfiguration* configuration) {
    this->configuration = configuration;
}


}

