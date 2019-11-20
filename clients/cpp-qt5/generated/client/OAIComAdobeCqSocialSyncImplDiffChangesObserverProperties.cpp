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


#include "OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties() {
    init();
}

OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::~OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties() {
    this->cleanup();
}

void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::init() {
    enabled = new OAIConfigNodePropertyBoolean();
    m_enabled_isSet = false;
    agent_name = new OAIConfigNodePropertyString();
    m_agent_name_isSet = false;
    diff_path = new OAIConfigNodePropertyString();
    m_diff_path_isSet = false;
    property_names = new OAIConfigNodePropertyString();
    m_property_names_isSet = false;
}

void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::cleanup() {
    if(enabled != nullptr) { 
        delete enabled;
    }
    if(agent_name != nullptr) { 
        delete agent_name;
    }
    if(diff_path != nullptr) { 
        delete diff_path;
    }
    if(property_names != nullptr) { 
        delete property_names;
    }
}

OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties*
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&enabled, pJson["enabled"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&agent_name, pJson["agentName"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&diff_path, pJson["diffPath"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&property_names, pJson["propertyNames"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::asJsonObject() {
    QJsonObject obj;
    if((enabled != nullptr) && (enabled->isSet())){
        toJsonValue(QString("enabled"), enabled, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((agent_name != nullptr) && (agent_name->isSet())){
        toJsonValue(QString("agentName"), agent_name, obj, QString("OAIConfigNodePropertyString"));
    }
    if((diff_path != nullptr) && (diff_path->isSet())){
        toJsonValue(QString("diffPath"), diff_path, obj, QString("OAIConfigNodePropertyString"));
    }
    if((property_names != nullptr) && (property_names->isSet())){
        toJsonValue(QString("propertyNames"), property_names, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::getEnabled() {
    return enabled;
}
void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::setEnabled(OAIConfigNodePropertyBoolean* enabled) {
    this->enabled = enabled;
    this->m_enabled_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::getAgentName() {
    return agent_name;
}
void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::setAgentName(OAIConfigNodePropertyString* agent_name) {
    this->agent_name = agent_name;
    this->m_agent_name_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::getDiffPath() {
    return diff_path;
}
void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::setDiffPath(OAIConfigNodePropertyString* diff_path) {
    this->diff_path = diff_path;
    this->m_diff_path_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::getPropertyNames() {
    return property_names;
}
void
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::setPropertyNames(OAIConfigNodePropertyString* property_names) {
    this->property_names = property_names;
    this->m_property_names_isSet = true;
}


bool
OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(enabled != nullptr && enabled->isSet()){ isObjectUpdated = true; break;}
        if(agent_name != nullptr && agent_name->isSet()){ isObjectUpdated = true; break;}
        if(diff_path != nullptr && diff_path->isSet()){ isObjectUpdated = true; break;}
        if(property_names != nullptr && property_names->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
