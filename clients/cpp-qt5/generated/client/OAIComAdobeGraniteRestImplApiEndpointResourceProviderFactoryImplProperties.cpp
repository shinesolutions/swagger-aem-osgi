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


#include "OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties() {
    init();
}

OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::~OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties() {
    this->cleanup();
}

void
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::init() {
    provider_roots = new OAIConfigNodePropertyString();
    m_provider_roots_isSet = false;
}

void
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::cleanup() {
    if(provider_roots != nullptr) { 
        delete provider_roots;
    }
}

OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties*
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&provider_roots, pJson["provider.roots"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::asJsonObject() {
    QJsonObject obj;
    if((provider_roots != nullptr) && (provider_roots->isSet())){
        toJsonValue(QString("provider.roots"), provider_roots, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::getProviderRoots() {
    return provider_roots;
}
void
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::setProviderRoots(OAIConfigNodePropertyString* provider_roots) {
    this->provider_roots = provider_roots;
    this->m_provider_roots_isSet = true;
}


bool
OAIComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(provider_roots != nullptr && provider_roots->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
