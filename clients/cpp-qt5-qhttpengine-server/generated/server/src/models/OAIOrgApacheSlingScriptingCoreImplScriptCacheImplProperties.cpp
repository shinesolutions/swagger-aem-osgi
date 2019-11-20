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


#include "OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties() {
    this->init();
}

OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::~OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties() {
    
}

void
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::init() {
    m_org_apache_sling_scripting_cache_size_isSet = false;
    m_org_apache_sling_scripting_cache_additional_extensions_isSet = false;
}

void
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(org_apache_sling_scripting_cache_size, json[QString("org.apache.sling.scripting.cache.size")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_scripting_cache_additional_extensions, json[QString("org.apache.sling.scripting.cache.additional_extensions")]);
    
}

QString
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(org_apache_sling_scripting_cache_size.isSet()){
        obj.insert(QString("org.apache.sling.scripting.cache.size"), ::OpenAPI::toJsonValue(org_apache_sling_scripting_cache_size));
    }
	if(org_apache_sling_scripting_cache_additional_extensions.isSet()){
        obj.insert(QString("org.apache.sling.scripting.cache.additional_extensions"), ::OpenAPI::toJsonValue(org_apache_sling_scripting_cache_additional_extensions));
    }
    return obj;
}

OAIConfigNodePropertyInteger
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::getOrgApacheSlingScriptingCacheSize() const {
    return org_apache_sling_scripting_cache_size;
}
void
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::setOrgApacheSlingScriptingCacheSize(const OAIConfigNodePropertyInteger &org_apache_sling_scripting_cache_size) {
    this->org_apache_sling_scripting_cache_size = org_apache_sling_scripting_cache_size;
    this->m_org_apache_sling_scripting_cache_size_isSet = true;
}

OAIConfigNodePropertyArray
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::getOrgApacheSlingScriptingCacheAdditionalExtensions() const {
    return org_apache_sling_scripting_cache_additional_extensions;
}
void
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::setOrgApacheSlingScriptingCacheAdditionalExtensions(const OAIConfigNodePropertyArray &org_apache_sling_scripting_cache_additional_extensions) {
    this->org_apache_sling_scripting_cache_additional_extensions = org_apache_sling_scripting_cache_additional_extensions;
    this->m_org_apache_sling_scripting_cache_additional_extensions_isSet = true;
}


bool
OAIOrgApacheSlingScriptingCoreImplScriptCacheImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(org_apache_sling_scripting_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_scripting_cache_additional_extensions.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
