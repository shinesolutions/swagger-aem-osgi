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


#include "OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties() {
    this->init();
}

OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::~OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties() {
    
}

void
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::init() {
    m_adapter_condition_isSet = false;
}

void
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(adapter_condition, json[QString("adapter.condition")]);
    
}

QString
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::asJsonObject() const {
    QJsonObject obj;
	if(adapter_condition.isSet()){
        obj.insert(QString("adapter.condition"), ::OpenAPI::toJsonValue(adapter_condition));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::getAdapterCondition() const {
    return adapter_condition;
}
void
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::setAdapterCondition(const OAIConfigNodePropertyString &adapter_condition) {
    this->adapter_condition = adapter_condition;
    this->m_adapter_condition_isSet = true;
}


bool
OAIComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(adapter_condition.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
