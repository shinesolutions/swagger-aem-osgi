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


#include "OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties() {
    this->init();
}

OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::~OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties() {
    
}

void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::init() {
    m_enabled_isSet = false;
    m_config_path_isSet = false;
    m_fallback_paths_isSet = false;
    m_config_collection_inheritance_property_names_isSet = false;
}

void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(enabled, json[QString("enabled")]);
    
    ::OpenAPI::fromJsonValue(config_path, json[QString("configPath")]);
    
    ::OpenAPI::fromJsonValue(fallback_paths, json[QString("fallbackPaths")]);
    
    ::OpenAPI::fromJsonValue(config_collection_inheritance_property_names, json[QString("configCollectionInheritancePropertyNames")]);
    
}

QString
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::asJsonObject() const {
    QJsonObject obj;
	if(enabled.isSet()){
        obj.insert(QString("enabled"), ::OpenAPI::toJsonValue(enabled));
    }
	if(config_path.isSet()){
        obj.insert(QString("configPath"), ::OpenAPI::toJsonValue(config_path));
    }
	if(fallback_paths.isSet()){
        obj.insert(QString("fallbackPaths"), ::OpenAPI::toJsonValue(fallback_paths));
    }
	if(config_collection_inheritance_property_names.isSet()){
        obj.insert(QString("configCollectionInheritancePropertyNames"), ::OpenAPI::toJsonValue(config_collection_inheritance_property_names));
    }
    return obj;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getEnabled() const {
    return enabled;
}
void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setEnabled(const OAIConfigNodePropertyBoolean &enabled) {
    this->enabled = enabled;
    this->m_enabled_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigPath() const {
    return config_path;
}
void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigPath(const OAIConfigNodePropertyString &config_path) {
    this->config_path = config_path;
    this->m_config_path_isSet = true;
}

OAIConfigNodePropertyArray
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getFallbackPaths() const {
    return fallback_paths;
}
void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setFallbackPaths(const OAIConfigNodePropertyArray &fallback_paths) {
    this->fallback_paths = fallback_paths;
    this->m_fallback_paths_isSet = true;
}

OAIConfigNodePropertyArray
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigCollectionInheritancePropertyNames() const {
    return config_collection_inheritance_property_names;
}
void
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigCollectionInheritancePropertyNames(const OAIConfigNodePropertyArray &config_collection_inheritance_property_names) {
    this->config_collection_inheritance_property_names = config_collection_inheritance_property_names;
    this->m_config_collection_inheritance_property_names_isSet = true;
}


bool
OAIOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(enabled.isSet()){ isObjectUpdated = true; break;}
    
        if(config_path.isSet()){ isObjectUpdated = true; break;}
    
        if(fallback_paths.isSet()){ isObjectUpdated = true; break;}
    
        if(config_collection_inheritance_property_names.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
