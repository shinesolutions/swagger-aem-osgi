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


#include "OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties() {
    this->init();
}

OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::~OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties() {
    
}

void
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::init() {
    m_default_connector_name_isSet = false;
    m_default_category_isSet = false;
}

void
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(default_connector_name, json[QString("defaultConnectorName")]);
    
    ::OpenAPI::fromJsonValue(default_category, json[QString("defaultCategory")]);
    
}

QString
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(default_connector_name.isSet()){
        obj.insert(QString("defaultConnectorName"), ::OpenAPI::toJsonValue(default_connector_name));
    }
	if(default_category.isSet()){
        obj.insert(QString("defaultCategory"), ::OpenAPI::toJsonValue(default_category));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::getDefaultConnectorName() const {
    return default_connector_name;
}
void
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::setDefaultConnectorName(const OAIConfigNodePropertyString &default_connector_name) {
    this->default_connector_name = default_connector_name;
    this->m_default_connector_name_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::getDefaultCategory() const {
    return default_category;
}
void
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::setDefaultCategory(const OAIConfigNodePropertyString &default_category) {
    this->default_category = default_category;
    this->m_default_category_isSet = true;
}


bool
OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(default_connector_name.isSet()){ isObjectUpdated = true; break;}
    
        if(default_category.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
