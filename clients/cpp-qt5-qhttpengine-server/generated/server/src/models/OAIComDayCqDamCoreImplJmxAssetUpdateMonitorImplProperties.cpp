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


#include "OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties() {
    this->init();
}

OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::~OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties() {
    
}

void
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::init() {
    m_jmx_objectname_isSet = false;
    m_active_isSet = false;
}

void
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(jmx_objectname, json[QString("jmx.objectname")]);
    
    ::OpenAPI::fromJsonValue(active, json[QString("active")]);
    
}

QString
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(jmx_objectname.isSet()){
        obj.insert(QString("jmx.objectname"), ::OpenAPI::toJsonValue(jmx_objectname));
    }
	if(active.isSet()){
        obj.insert(QString("active"), ::OpenAPI::toJsonValue(active));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::getJmxObjectname() const {
    return jmx_objectname;
}
void
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::setJmxObjectname(const OAIConfigNodePropertyString &jmx_objectname) {
    this->jmx_objectname = jmx_objectname;
    this->m_jmx_objectname_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::getActive() const {
    return active;
}
void
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::setActive(const OAIConfigNodePropertyBoolean &active) {
    this->active = active;
    this->m_active_isSet = true;
}


bool
OAIComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(jmx_objectname.isSet()){ isObjectUpdated = true; break;}
    
        if(active.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
