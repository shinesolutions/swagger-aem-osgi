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


#include "OAIComAdobeGraniteRestImplServletDefaultGETServletProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::OAIComAdobeGraniteRestImplServletDefaultGETServletProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::OAIComAdobeGraniteRestImplServletDefaultGETServletProperties() {
    this->init();
}

OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::~OAIComAdobeGraniteRestImplServletDefaultGETServletProperties() {
    
}

void
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::init() {
    m_default_limit_isSet = false;
    m_use_absolute_uri_isSet = false;
}

void
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(default_limit, json[QString("default.limit")]);
    
    ::OpenAPI::fromJsonValue(use_absolute_uri, json[QString("use.absolute.uri")]);
    
}

QString
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::asJsonObject() const {
    QJsonObject obj;
	if(default_limit.isSet()){
        obj.insert(QString("default.limit"), ::OpenAPI::toJsonValue(default_limit));
    }
	if(use_absolute_uri.isSet()){
        obj.insert(QString("use.absolute.uri"), ::OpenAPI::toJsonValue(use_absolute_uri));
    }
    return obj;
}

OAIConfigNodePropertyInteger
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::getDefaultLimit() const {
    return default_limit;
}
void
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::setDefaultLimit(const OAIConfigNodePropertyInteger &default_limit) {
    this->default_limit = default_limit;
    this->m_default_limit_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::getUseAbsoluteUri() const {
    return use_absolute_uri;
}
void
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::setUseAbsoluteUri(const OAIConfigNodePropertyBoolean &use_absolute_uri) {
    this->use_absolute_uri = use_absolute_uri;
    this->m_use_absolute_uri_isSet = true;
}


bool
OAIComAdobeGraniteRestImplServletDefaultGETServletProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(default_limit.isSet()){ isObjectUpdated = true; break;}
    
        if(use_absolute_uri.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
