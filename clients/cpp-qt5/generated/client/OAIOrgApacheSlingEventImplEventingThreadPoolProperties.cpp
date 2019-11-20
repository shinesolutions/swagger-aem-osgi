/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIOrgApacheSlingEventImplEventingThreadPoolProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingEventImplEventingThreadPoolProperties::OAIOrgApacheSlingEventImplEventingThreadPoolProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIOrgApacheSlingEventImplEventingThreadPoolProperties::OAIOrgApacheSlingEventImplEventingThreadPoolProperties() {
    init();
}

OAIOrgApacheSlingEventImplEventingThreadPoolProperties::~OAIOrgApacheSlingEventImplEventingThreadPoolProperties() {
    this->cleanup();
}

void
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::init() {
    min_pool_size = new OAIConfigNodePropertyInteger();
    m_min_pool_size_isSet = false;
}

void
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::cleanup() {
    if(min_pool_size != nullptr) { 
        delete min_pool_size;
    }
}

OAIOrgApacheSlingEventImplEventingThreadPoolProperties*
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&min_pool_size, pJson["minPoolSize"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
}

QString
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::asJsonObject() {
    QJsonObject obj;
    if((min_pool_size != nullptr) && (min_pool_size->isSet())){
        toJsonValue(QString("minPoolSize"), min_pool_size, obj, QString("OAIConfigNodePropertyInteger"));
    }

    return obj;
}

OAIConfigNodePropertyInteger*
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::getMinPoolSize() {
    return min_pool_size;
}
void
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::setMinPoolSize(OAIConfigNodePropertyInteger* min_pool_size) {
    this->min_pool_size = min_pool_size;
    this->m_min_pool_size_isSet = true;
}


bool
OAIOrgApacheSlingEventImplEventingThreadPoolProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(min_pool_size != nullptr && min_pool_size->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
