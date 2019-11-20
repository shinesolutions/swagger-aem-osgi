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


#include "OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties() {
    this->init();
}

OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::~OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties() {
    
}

void
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::init() {
    m_offloading_transporter_isSet = false;
    m_offloading_cleanup_payload_isSet = false;
}

void
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(offloading_transporter, json[QString("offloading.transporter")]);
    
    ::OpenAPI::fromJsonValue(offloading_cleanup_payload, json[QString("offloading.cleanup.payload")]);
    
}

QString
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::asJsonObject() const {
    QJsonObject obj;
	if(offloading_transporter.isSet()){
        obj.insert(QString("offloading.transporter"), ::OpenAPI::toJsonValue(offloading_transporter));
    }
	if(offloading_cleanup_payload.isSet()){
        obj.insert(QString("offloading.cleanup.payload"), ::OpenAPI::toJsonValue(offloading_cleanup_payload));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::getOffloadingTransporter() const {
    return offloading_transporter;
}
void
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::setOffloadingTransporter(const OAIConfigNodePropertyString &offloading_transporter) {
    this->offloading_transporter = offloading_transporter;
    this->m_offloading_transporter_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::getOffloadingCleanupPayload() const {
    return offloading_cleanup_payload;
}
void
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::setOffloadingCleanupPayload(const OAIConfigNodePropertyBoolean &offloading_cleanup_payload) {
    this->offloading_cleanup_payload = offloading_cleanup_payload;
    this->m_offloading_cleanup_payload_isSet = true;
}


bool
OAIComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(offloading_transporter.isSet()){ isObjectUpdated = true; break;}
    
        if(offloading_cleanup_payload.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
