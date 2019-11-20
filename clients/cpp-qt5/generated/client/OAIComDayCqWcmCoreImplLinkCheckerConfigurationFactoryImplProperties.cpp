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


#include "OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties() {
    init();
}

OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::~OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties() {
    this->cleanup();
}

void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::init() {
    link_expired_prefix = new OAIConfigNodePropertyString();
    m_link_expired_prefix_isSet = false;
    link_expired_remove = new OAIConfigNodePropertyBoolean();
    m_link_expired_remove_isSet = false;
    link_expired_suffix = new OAIConfigNodePropertyString();
    m_link_expired_suffix_isSet = false;
    link_invalid_prefix = new OAIConfigNodePropertyString();
    m_link_invalid_prefix_isSet = false;
    link_invalid_remove = new OAIConfigNodePropertyBoolean();
    m_link_invalid_remove_isSet = false;
    link_invalid_suffix = new OAIConfigNodePropertyString();
    m_link_invalid_suffix_isSet = false;
    link_predated_prefix = new OAIConfigNodePropertyString();
    m_link_predated_prefix_isSet = false;
    link_predated_remove = new OAIConfigNodePropertyBoolean();
    m_link_predated_remove_isSet = false;
    link_predated_suffix = new OAIConfigNodePropertyString();
    m_link_predated_suffix_isSet = false;
    link_wcmmodes = new OAIConfigNodePropertyArray();
    m_link_wcmmodes_isSet = false;
}

void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::cleanup() {
    if(link_expired_prefix != nullptr) { 
        delete link_expired_prefix;
    }
    if(link_expired_remove != nullptr) { 
        delete link_expired_remove;
    }
    if(link_expired_suffix != nullptr) { 
        delete link_expired_suffix;
    }
    if(link_invalid_prefix != nullptr) { 
        delete link_invalid_prefix;
    }
    if(link_invalid_remove != nullptr) { 
        delete link_invalid_remove;
    }
    if(link_invalid_suffix != nullptr) { 
        delete link_invalid_suffix;
    }
    if(link_predated_prefix != nullptr) { 
        delete link_predated_prefix;
    }
    if(link_predated_remove != nullptr) { 
        delete link_predated_remove;
    }
    if(link_predated_suffix != nullptr) { 
        delete link_predated_suffix;
    }
    if(link_wcmmodes != nullptr) { 
        delete link_wcmmodes;
    }
}

OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&link_expired_prefix, pJson["link.expired.prefix"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&link_expired_remove, pJson["link.expired.remove"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&link_expired_suffix, pJson["link.expired.suffix"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&link_invalid_prefix, pJson["link.invalid.prefix"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&link_invalid_remove, pJson["link.invalid.remove"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&link_invalid_suffix, pJson["link.invalid.suffix"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&link_predated_prefix, pJson["link.predated.prefix"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&link_predated_remove, pJson["link.predated.remove"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&link_predated_suffix, pJson["link.predated.suffix"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&link_wcmmodes, pJson["link.wcmmodes"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
}

QString
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::asJsonObject() {
    QJsonObject obj;
    if((link_expired_prefix != nullptr) && (link_expired_prefix->isSet())){
        toJsonValue(QString("link.expired.prefix"), link_expired_prefix, obj, QString("OAIConfigNodePropertyString"));
    }
    if((link_expired_remove != nullptr) && (link_expired_remove->isSet())){
        toJsonValue(QString("link.expired.remove"), link_expired_remove, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((link_expired_suffix != nullptr) && (link_expired_suffix->isSet())){
        toJsonValue(QString("link.expired.suffix"), link_expired_suffix, obj, QString("OAIConfigNodePropertyString"));
    }
    if((link_invalid_prefix != nullptr) && (link_invalid_prefix->isSet())){
        toJsonValue(QString("link.invalid.prefix"), link_invalid_prefix, obj, QString("OAIConfigNodePropertyString"));
    }
    if((link_invalid_remove != nullptr) && (link_invalid_remove->isSet())){
        toJsonValue(QString("link.invalid.remove"), link_invalid_remove, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((link_invalid_suffix != nullptr) && (link_invalid_suffix->isSet())){
        toJsonValue(QString("link.invalid.suffix"), link_invalid_suffix, obj, QString("OAIConfigNodePropertyString"));
    }
    if((link_predated_prefix != nullptr) && (link_predated_prefix->isSet())){
        toJsonValue(QString("link.predated.prefix"), link_predated_prefix, obj, QString("OAIConfigNodePropertyString"));
    }
    if((link_predated_remove != nullptr) && (link_predated_remove->isSet())){
        toJsonValue(QString("link.predated.remove"), link_predated_remove, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((link_predated_suffix != nullptr) && (link_predated_suffix->isSet())){
        toJsonValue(QString("link.predated.suffix"), link_predated_suffix, obj, QString("OAIConfigNodePropertyString"));
    }
    if((link_wcmmodes != nullptr) && (link_wcmmodes->isSet())){
        toJsonValue(QString("link.wcmmodes"), link_wcmmodes, obj, QString("OAIConfigNodePropertyArray"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkExpiredPrefix() {
    return link_expired_prefix;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkExpiredPrefix(OAIConfigNodePropertyString* link_expired_prefix) {
    this->link_expired_prefix = link_expired_prefix;
    this->m_link_expired_prefix_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkExpiredRemove() {
    return link_expired_remove;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkExpiredRemove(OAIConfigNodePropertyBoolean* link_expired_remove) {
    this->link_expired_remove = link_expired_remove;
    this->m_link_expired_remove_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkExpiredSuffix() {
    return link_expired_suffix;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkExpiredSuffix(OAIConfigNodePropertyString* link_expired_suffix) {
    this->link_expired_suffix = link_expired_suffix;
    this->m_link_expired_suffix_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkInvalidPrefix() {
    return link_invalid_prefix;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkInvalidPrefix(OAIConfigNodePropertyString* link_invalid_prefix) {
    this->link_invalid_prefix = link_invalid_prefix;
    this->m_link_invalid_prefix_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkInvalidRemove() {
    return link_invalid_remove;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkInvalidRemove(OAIConfigNodePropertyBoolean* link_invalid_remove) {
    this->link_invalid_remove = link_invalid_remove;
    this->m_link_invalid_remove_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkInvalidSuffix() {
    return link_invalid_suffix;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkInvalidSuffix(OAIConfigNodePropertyString* link_invalid_suffix) {
    this->link_invalid_suffix = link_invalid_suffix;
    this->m_link_invalid_suffix_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkPredatedPrefix() {
    return link_predated_prefix;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkPredatedPrefix(OAIConfigNodePropertyString* link_predated_prefix) {
    this->link_predated_prefix = link_predated_prefix;
    this->m_link_predated_prefix_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkPredatedRemove() {
    return link_predated_remove;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkPredatedRemove(OAIConfigNodePropertyBoolean* link_predated_remove) {
    this->link_predated_remove = link_predated_remove;
    this->m_link_predated_remove_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkPredatedSuffix() {
    return link_predated_suffix;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkPredatedSuffix(OAIConfigNodePropertyString* link_predated_suffix) {
    this->link_predated_suffix = link_predated_suffix;
    this->m_link_predated_suffix_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkWcmmodes() {
    return link_wcmmodes;
}
void
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkWcmmodes(OAIConfigNodePropertyArray* link_wcmmodes) {
    this->link_wcmmodes = link_wcmmodes;
    this->m_link_wcmmodes_isSet = true;
}


bool
OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(link_expired_prefix != nullptr && link_expired_prefix->isSet()){ isObjectUpdated = true; break;}
        if(link_expired_remove != nullptr && link_expired_remove->isSet()){ isObjectUpdated = true; break;}
        if(link_expired_suffix != nullptr && link_expired_suffix->isSet()){ isObjectUpdated = true; break;}
        if(link_invalid_prefix != nullptr && link_invalid_prefix->isSet()){ isObjectUpdated = true; break;}
        if(link_invalid_remove != nullptr && link_invalid_remove->isSet()){ isObjectUpdated = true; break;}
        if(link_invalid_suffix != nullptr && link_invalid_suffix->isSet()){ isObjectUpdated = true; break;}
        if(link_predated_prefix != nullptr && link_predated_prefix->isSet()){ isObjectUpdated = true; break;}
        if(link_predated_remove != nullptr && link_predated_remove->isSet()){ isObjectUpdated = true; break;}
        if(link_predated_suffix != nullptr && link_predated_suffix->isSet()){ isObjectUpdated = true; break;}
        if(link_wcmmodes != nullptr && link_wcmmodes->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
