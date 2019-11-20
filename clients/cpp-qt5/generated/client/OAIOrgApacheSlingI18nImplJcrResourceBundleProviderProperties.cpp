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


#include "OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties() {
    init();
}

OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::~OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties() {
    this->cleanup();
}

void
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::init() {
    locale_default = new OAIConfigNodePropertyString();
    m_locale_default_isSet = false;
    preload_bundles = new OAIConfigNodePropertyBoolean();
    m_preload_bundles_isSet = false;
    invalidation_delay = new OAIConfigNodePropertyInteger();
    m_invalidation_delay_isSet = false;
}

void
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::cleanup() {
    if(locale_default != nullptr) { 
        delete locale_default;
    }
    if(preload_bundles != nullptr) { 
        delete preload_bundles;
    }
    if(invalidation_delay != nullptr) { 
        delete invalidation_delay;
    }
}

OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties*
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&locale_default, pJson["locale.default"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&preload_bundles, pJson["preload.bundles"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&invalidation_delay, pJson["invalidation.delay"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
}

QString
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::asJsonObject() {
    QJsonObject obj;
    if((locale_default != nullptr) && (locale_default->isSet())){
        toJsonValue(QString("locale.default"), locale_default, obj, QString("OAIConfigNodePropertyString"));
    }
    if((preload_bundles != nullptr) && (preload_bundles->isSet())){
        toJsonValue(QString("preload.bundles"), preload_bundles, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((invalidation_delay != nullptr) && (invalidation_delay->isSet())){
        toJsonValue(QString("invalidation.delay"), invalidation_delay, obj, QString("OAIConfigNodePropertyInteger"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getLocaleDefault() {
    return locale_default;
}
void
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setLocaleDefault(OAIConfigNodePropertyString* locale_default) {
    this->locale_default = locale_default;
    this->m_locale_default_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getPreloadBundles() {
    return preload_bundles;
}
void
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setPreloadBundles(OAIConfigNodePropertyBoolean* preload_bundles) {
    this->preload_bundles = preload_bundles;
    this->m_preload_bundles_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getInvalidationDelay() {
    return invalidation_delay;
}
void
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setInvalidationDelay(OAIConfigNodePropertyInteger* invalidation_delay) {
    this->invalidation_delay = invalidation_delay;
    this->m_invalidation_delay_isSet = true;
}


bool
OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(locale_default != nullptr && locale_default->isSet()){ isObjectUpdated = true; break;}
        if(preload_bundles != nullptr && preload_bundles->isSet()){ isObjectUpdated = true; break;}
        if(invalidation_delay != nullptr && invalidation_delay->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
