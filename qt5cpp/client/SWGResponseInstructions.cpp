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


#include "SWGResponseInstructions.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGResponseInstructions::SWGResponseInstructions(QString* json) {
    init();
    this->fromJson(*json);
}

SWGResponseInstructions::SWGResponseInstructions() {
    init();
}

SWGResponseInstructions::~SWGResponseInstructions() {
    this->cleanup();
}

void
SWGResponseInstructions::init() {
}

void
SWGResponseInstructions::cleanup() {
    }

SWGResponseInstructions*
SWGResponseInstructions::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGResponseInstructions::fromJsonObject(QJsonObject &pJson) {
}

QString
SWGResponseInstructions::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGResponseInstructions::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    return obj;
}


}

