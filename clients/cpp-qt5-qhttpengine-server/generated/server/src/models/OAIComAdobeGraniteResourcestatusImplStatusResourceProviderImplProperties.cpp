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


#include "OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties() {
    this->init();
}

OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::~OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties() {
    
}

void
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::init() {
    m_provider_root_isSet = false;
}

void
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(provider_root, json[QString("provider.root")]);
    
}

QString
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(provider_root.isSet()){
        obj.insert(QString("provider.root"), ::OpenAPI::toJsonValue(provider_root));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::getProviderRoot() const {
    return provider_root;
}
void
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::setProviderRoot(const OAIConfigNodePropertyString &provider_root) {
    this->provider_root = provider_root;
    this->m_provider_root_isSet = true;
}


bool
OAIComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(provider_root.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
