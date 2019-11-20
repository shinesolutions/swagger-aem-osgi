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


#include "OAIOrgApacheFelixSystemreadyImplServicesCheckProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::OAIOrgApacheFelixSystemreadyImplServicesCheckProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::OAIOrgApacheFelixSystemreadyImplServicesCheckProperties() {
    this->init();
}

OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::~OAIOrgApacheFelixSystemreadyImplServicesCheckProperties() {
    
}

void
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::init() {
    m_services_list_isSet = false;
    m_type_isSet = false;
}

void
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(services_list, json[QString("services.list")]);
    
    ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    
}

QString
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::asJsonObject() const {
    QJsonObject obj;
	if(services_list.isSet()){
        obj.insert(QString("services.list"), ::OpenAPI::toJsonValue(services_list));
    }
	if(type.isSet()){
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    return obj;
}

OAIConfigNodePropertyArray
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::getServicesList() const {
    return services_list;
}
void
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::setServicesList(const OAIConfigNodePropertyArray &services_list) {
    this->services_list = services_list;
    this->m_services_list_isSet = true;
}

OAIConfigNodePropertyDropDown
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::getType() const {
    return type;
}
void
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::setType(const OAIConfigNodePropertyDropDown &type) {
    this->type = type;
    this->m_type_isSet = true;
}


bool
OAIOrgApacheFelixSystemreadyImplServicesCheckProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(services_list.isSet()){ isObjectUpdated = true; break;}
    
        if(type.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
