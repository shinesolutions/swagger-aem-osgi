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


#include "OAIComDayCqWcmFoundationFormsImplMailServletProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqWcmFoundationFormsImplMailServletProperties::OAIComDayCqWcmFoundationFormsImplMailServletProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqWcmFoundationFormsImplMailServletProperties::OAIComDayCqWcmFoundationFormsImplMailServletProperties() {
    init();
}

OAIComDayCqWcmFoundationFormsImplMailServletProperties::~OAIComDayCqWcmFoundationFormsImplMailServletProperties() {
    this->cleanup();
}

void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::init() {
    sling_servlet_resource_types = new OAIConfigNodePropertyString();
    m_sling_servlet_resource_types_isSet = false;
    sling_servlet_selectors = new OAIConfigNodePropertyString();
    m_sling_servlet_selectors_isSet = false;
    resource_whitelist = new OAIConfigNodePropertyArray();
    m_resource_whitelist_isSet = false;
    resource_blacklist = new OAIConfigNodePropertyString();
    m_resource_blacklist_isSet = false;
}

void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::cleanup() {
    if(sling_servlet_resource_types != nullptr) { 
        delete sling_servlet_resource_types;
    }
    if(sling_servlet_selectors != nullptr) { 
        delete sling_servlet_selectors;
    }
    if(resource_whitelist != nullptr) { 
        delete resource_whitelist;
    }
    if(resource_blacklist != nullptr) { 
        delete resource_blacklist;
    }
}

OAIComDayCqWcmFoundationFormsImplMailServletProperties*
OAIComDayCqWcmFoundationFormsImplMailServletProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&sling_servlet_resource_types, pJson["sling.servlet.resourceTypes"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&sling_servlet_selectors, pJson["sling.servlet.selectors"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&resource_whitelist, pJson["resource.whitelist"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&resource_blacklist, pJson["resource.blacklist"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComDayCqWcmFoundationFormsImplMailServletProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqWcmFoundationFormsImplMailServletProperties::asJsonObject() {
    QJsonObject obj;
    if((sling_servlet_resource_types != nullptr) && (sling_servlet_resource_types->isSet())){
        toJsonValue(QString("sling.servlet.resourceTypes"), sling_servlet_resource_types, obj, QString("OAIConfigNodePropertyString"));
    }
    if((sling_servlet_selectors != nullptr) && (sling_servlet_selectors->isSet())){
        toJsonValue(QString("sling.servlet.selectors"), sling_servlet_selectors, obj, QString("OAIConfigNodePropertyString"));
    }
    if((resource_whitelist != nullptr) && (resource_whitelist->isSet())){
        toJsonValue(QString("resource.whitelist"), resource_whitelist, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((resource_blacklist != nullptr) && (resource_blacklist->isSet())){
        toJsonValue(QString("resource.blacklist"), resource_blacklist, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmFoundationFormsImplMailServletProperties::getSlingServletResourceTypes() {
    return sling_servlet_resource_types;
}
void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::setSlingServletResourceTypes(OAIConfigNodePropertyString* sling_servlet_resource_types) {
    this->sling_servlet_resource_types = sling_servlet_resource_types;
    this->m_sling_servlet_resource_types_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmFoundationFormsImplMailServletProperties::getSlingServletSelectors() {
    return sling_servlet_selectors;
}
void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::setSlingServletSelectors(OAIConfigNodePropertyString* sling_servlet_selectors) {
    this->sling_servlet_selectors = sling_servlet_selectors;
    this->m_sling_servlet_selectors_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComDayCqWcmFoundationFormsImplMailServletProperties::getResourceWhitelist() {
    return resource_whitelist;
}
void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::setResourceWhitelist(OAIConfigNodePropertyArray* resource_whitelist) {
    this->resource_whitelist = resource_whitelist;
    this->m_resource_whitelist_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmFoundationFormsImplMailServletProperties::getResourceBlacklist() {
    return resource_blacklist;
}
void
OAIComDayCqWcmFoundationFormsImplMailServletProperties::setResourceBlacklist(OAIConfigNodePropertyString* resource_blacklist) {
    this->resource_blacklist = resource_blacklist;
    this->m_resource_blacklist_isSet = true;
}


bool
OAIComDayCqWcmFoundationFormsImplMailServletProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(sling_servlet_resource_types != nullptr && sling_servlet_resource_types->isSet()){ isObjectUpdated = true; break;}
        if(sling_servlet_selectors != nullptr && sling_servlet_selectors->isSet()){ isObjectUpdated = true; break;}
        if(resource_whitelist != nullptr && resource_whitelist->isSet()){ isObjectUpdated = true; break;}
        if(resource_blacklist != nullptr && resource_blacklist->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
