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

#ifndef _SWG_SWGVrpApi_H_
#define _SWG_SWGVrpApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGJobId.h"
#include "SWGRequest.h"

#include <QObject>

namespace Swagger {

class SWGVrpApi: public QObject {
    Q_OBJECT

public:
    SWGVrpApi();
    SWGVrpApi(QString host, QString basePath);
    ~SWGVrpApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void postVrp(QString* key, SWGRequest body);
    
private:
    void postVrpCallback (HttpRequestWorker * worker);
    
signals:
    void postVrpSignal(SWGJobId* summary);
    
    void postVrpSignalE(SWGJobId* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
