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


#include "OAIComAdobeGraniteFragsImplRandomFeatureProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteFragsImplRandomFeatureProperties::OAIComAdobeGraniteFragsImplRandomFeatureProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteFragsImplRandomFeatureProperties::OAIComAdobeGraniteFragsImplRandomFeatureProperties() {
    this->init();
}

OAIComAdobeGraniteFragsImplRandomFeatureProperties::~OAIComAdobeGraniteFragsImplRandomFeatureProperties() {
    
}

void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::init() {
    m_feature_name_isSet = false;
    m_feature_description_isSet = false;
    m_active_percentage_isSet = false;
    m_cookie_name_isSet = false;
    m_cookie_max_age_isSet = false;
}

void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(feature_name, json[QString("feature.name")]);
    
    ::OpenAPI::fromJsonValue(feature_description, json[QString("feature.description")]);
    
    ::OpenAPI::fromJsonValue(active_percentage, json[QString("active.percentage")]);
    
    ::OpenAPI::fromJsonValue(cookie_name, json[QString("cookie.name")]);
    
    ::OpenAPI::fromJsonValue(cookie_max_age, json[QString("cookie.maxAge")]);
    
}

QString
OAIComAdobeGraniteFragsImplRandomFeatureProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteFragsImplRandomFeatureProperties::asJsonObject() const {
    QJsonObject obj;
	if(feature_name.isSet()){
        obj.insert(QString("feature.name"), ::OpenAPI::toJsonValue(feature_name));
    }
	if(feature_description.isSet()){
        obj.insert(QString("feature.description"), ::OpenAPI::toJsonValue(feature_description));
    }
	if(active_percentage.isSet()){
        obj.insert(QString("active.percentage"), ::OpenAPI::toJsonValue(active_percentage));
    }
	if(cookie_name.isSet()){
        obj.insert(QString("cookie.name"), ::OpenAPI::toJsonValue(cookie_name));
    }
	if(cookie_max_age.isSet()){
        obj.insert(QString("cookie.maxAge"), ::OpenAPI::toJsonValue(cookie_max_age));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteFragsImplRandomFeatureProperties::getFeatureName() const {
    return feature_name;
}
void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::setFeatureName(const OAIConfigNodePropertyString &feature_name) {
    this->feature_name = feature_name;
    this->m_feature_name_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteFragsImplRandomFeatureProperties::getFeatureDescription() const {
    return feature_description;
}
void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::setFeatureDescription(const OAIConfigNodePropertyString &feature_description) {
    this->feature_description = feature_description;
    this->m_feature_description_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteFragsImplRandomFeatureProperties::getActivePercentage() const {
    return active_percentage;
}
void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::setActivePercentage(const OAIConfigNodePropertyString &active_percentage) {
    this->active_percentage = active_percentage;
    this->m_active_percentage_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteFragsImplRandomFeatureProperties::getCookieName() const {
    return cookie_name;
}
void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::setCookieName(const OAIConfigNodePropertyString &cookie_name) {
    this->cookie_name = cookie_name;
    this->m_cookie_name_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeGraniteFragsImplRandomFeatureProperties::getCookieMaxAge() const {
    return cookie_max_age;
}
void
OAIComAdobeGraniteFragsImplRandomFeatureProperties::setCookieMaxAge(const OAIConfigNodePropertyInteger &cookie_max_age) {
    this->cookie_max_age = cookie_max_age;
    this->m_cookie_max_age_isSet = true;
}


bool
OAIComAdobeGraniteFragsImplRandomFeatureProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(feature_name.isSet()){ isObjectUpdated = true; break;}
    
        if(feature_description.isSet()){ isObjectUpdated = true; break;}
    
        if(active_percentage.isSet()){ isObjectUpdated = true; break;}
    
        if(cookie_name.isSet()){ isObjectUpdated = true; break;}
    
        if(cookie_max_age.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
