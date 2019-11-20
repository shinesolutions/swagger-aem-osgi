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


#include "OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties() {
    init();
}

OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::~OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties() {
    this->cleanup();
}

void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::init() {
    translation_factory = new OAIConfigNodePropertyString();
    m_translation_factory_isSet = false;
    default_connector_label = new OAIConfigNodePropertyString();
    m_default_connector_label_isSet = false;
    default_connector_attribution = new OAIConfigNodePropertyString();
    m_default_connector_attribution_isSet = false;
    default_connector_workspace_id = new OAIConfigNodePropertyString();
    m_default_connector_workspace_id_isSet = false;
    default_connector_subscription_key = new OAIConfigNodePropertyString();
    m_default_connector_subscription_key_isSet = false;
    language_map_location = new OAIConfigNodePropertyString();
    m_language_map_location_isSet = false;
    category_map_location = new OAIConfigNodePropertyString();
    m_category_map_location_isSet = false;
    retry_attempts = new OAIConfigNodePropertyInteger();
    m_retry_attempts_isSet = false;
    timeout_count = new OAIConfigNodePropertyInteger();
    m_timeout_count_isSet = false;
}

void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::cleanup() {
    if(translation_factory != nullptr) { 
        delete translation_factory;
    }
    if(default_connector_label != nullptr) { 
        delete default_connector_label;
    }
    if(default_connector_attribution != nullptr) { 
        delete default_connector_attribution;
    }
    if(default_connector_workspace_id != nullptr) { 
        delete default_connector_workspace_id;
    }
    if(default_connector_subscription_key != nullptr) { 
        delete default_connector_subscription_key;
    }
    if(language_map_location != nullptr) { 
        delete language_map_location;
    }
    if(category_map_location != nullptr) { 
        delete category_map_location;
    }
    if(retry_attempts != nullptr) { 
        delete retry_attempts;
    }
    if(timeout_count != nullptr) { 
        delete timeout_count;
    }
}

OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&translation_factory, pJson["translationFactory"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&default_connector_label, pJson["defaultConnectorLabel"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&default_connector_attribution, pJson["defaultConnectorAttribution"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&default_connector_workspace_id, pJson["defaultConnectorWorkspaceId"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&default_connector_subscription_key, pJson["defaultConnectorSubscriptionKey"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&language_map_location, pJson["languageMapLocation"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&category_map_location, pJson["categoryMapLocation"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&retry_attempts, pJson["retryAttempts"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&timeout_count, pJson["timeoutCount"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
}

QString
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::asJsonObject() {
    QJsonObject obj;
    if((translation_factory != nullptr) && (translation_factory->isSet())){
        toJsonValue(QString("translationFactory"), translation_factory, obj, QString("OAIConfigNodePropertyString"));
    }
    if((default_connector_label != nullptr) && (default_connector_label->isSet())){
        toJsonValue(QString("defaultConnectorLabel"), default_connector_label, obj, QString("OAIConfigNodePropertyString"));
    }
    if((default_connector_attribution != nullptr) && (default_connector_attribution->isSet())){
        toJsonValue(QString("defaultConnectorAttribution"), default_connector_attribution, obj, QString("OAIConfigNodePropertyString"));
    }
    if((default_connector_workspace_id != nullptr) && (default_connector_workspace_id->isSet())){
        toJsonValue(QString("defaultConnectorWorkspaceId"), default_connector_workspace_id, obj, QString("OAIConfigNodePropertyString"));
    }
    if((default_connector_subscription_key != nullptr) && (default_connector_subscription_key->isSet())){
        toJsonValue(QString("defaultConnectorSubscriptionKey"), default_connector_subscription_key, obj, QString("OAIConfigNodePropertyString"));
    }
    if((language_map_location != nullptr) && (language_map_location->isSet())){
        toJsonValue(QString("languageMapLocation"), language_map_location, obj, QString("OAIConfigNodePropertyString"));
    }
    if((category_map_location != nullptr) && (category_map_location->isSet())){
        toJsonValue(QString("categoryMapLocation"), category_map_location, obj, QString("OAIConfigNodePropertyString"));
    }
    if((retry_attempts != nullptr) && (retry_attempts->isSet())){
        toJsonValue(QString("retryAttempts"), retry_attempts, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((timeout_count != nullptr) && (timeout_count->isSet())){
        toJsonValue(QString("timeoutCount"), timeout_count, obj, QString("OAIConfigNodePropertyInteger"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getTranslationFactory() {
    return translation_factory;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setTranslationFactory(OAIConfigNodePropertyString* translation_factory) {
    this->translation_factory = translation_factory;
    this->m_translation_factory_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorLabel() {
    return default_connector_label;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorLabel(OAIConfigNodePropertyString* default_connector_label) {
    this->default_connector_label = default_connector_label;
    this->m_default_connector_label_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorAttribution() {
    return default_connector_attribution;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorAttribution(OAIConfigNodePropertyString* default_connector_attribution) {
    this->default_connector_attribution = default_connector_attribution;
    this->m_default_connector_attribution_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorWorkspaceId() {
    return default_connector_workspace_id;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorWorkspaceId(OAIConfigNodePropertyString* default_connector_workspace_id) {
    this->default_connector_workspace_id = default_connector_workspace_id;
    this->m_default_connector_workspace_id_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorSubscriptionKey() {
    return default_connector_subscription_key;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorSubscriptionKey(OAIConfigNodePropertyString* default_connector_subscription_key) {
    this->default_connector_subscription_key = default_connector_subscription_key;
    this->m_default_connector_subscription_key_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getLanguageMapLocation() {
    return language_map_location;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setLanguageMapLocation(OAIConfigNodePropertyString* language_map_location) {
    this->language_map_location = language_map_location;
    this->m_language_map_location_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getCategoryMapLocation() {
    return category_map_location;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setCategoryMapLocation(OAIConfigNodePropertyString* category_map_location) {
    this->category_map_location = category_map_location;
    this->m_category_map_location_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getRetryAttempts() {
    return retry_attempts;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setRetryAttempts(OAIConfigNodePropertyInteger* retry_attempts) {
    this->retry_attempts = retry_attempts;
    this->m_retry_attempts_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getTimeoutCount() {
    return timeout_count;
}
void
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setTimeoutCount(OAIConfigNodePropertyInteger* timeout_count) {
    this->timeout_count = timeout_count;
    this->m_timeout_count_isSet = true;
}


bool
OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(translation_factory != nullptr && translation_factory->isSet()){ isObjectUpdated = true; break;}
        if(default_connector_label != nullptr && default_connector_label->isSet()){ isObjectUpdated = true; break;}
        if(default_connector_attribution != nullptr && default_connector_attribution->isSet()){ isObjectUpdated = true; break;}
        if(default_connector_workspace_id != nullptr && default_connector_workspace_id->isSet()){ isObjectUpdated = true; break;}
        if(default_connector_subscription_key != nullptr && default_connector_subscription_key->isSet()){ isObjectUpdated = true; break;}
        if(language_map_location != nullptr && language_map_location->isSet()){ isObjectUpdated = true; break;}
        if(category_map_location != nullptr && category_map_location->isSet()){ isObjectUpdated = true; break;}
        if(retry_attempts != nullptr && retry_attempts->isSet()){ isObjectUpdated = true; break;}
        if(timeout_count != nullptr && timeout_count->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
