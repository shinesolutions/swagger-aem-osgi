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


#include "OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties() {
    init();
}

OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::~OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties() {
    this->cleanup();
}

void
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::init() {
    event_filter = new OAIConfigNodePropertyString();
    m_event_filter_isSet = false;
    enabled = new OAIConfigNodePropertyBoolean();
    m_enabled_isSet = false;
}

void
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::cleanup() {
    if(event_filter != nullptr) { 
        delete event_filter;
    }
    if(enabled != nullptr) { 
        delete enabled;
    }
}

OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties*
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&event_filter, pJson["event.filter"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&enabled, pJson["enabled"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
}

QString
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::asJsonObject() {
    QJsonObject obj;
    if((event_filter != nullptr) && (event_filter->isSet())){
        toJsonValue(QString("event.filter"), event_filter, obj, QString("OAIConfigNodePropertyString"));
    }
    if((enabled != nullptr) && (enabled->isSet())){
        toJsonValue(QString("enabled"), enabled, obj, QString("OAIConfigNodePropertyBoolean"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEventFilter() {
    return event_filter;
}
void
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEventFilter(OAIConfigNodePropertyString* event_filter) {
    this->event_filter = event_filter;
    this->m_event_filter_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEnabled() {
    return enabled;
}
void
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEnabled(OAIConfigNodePropertyBoolean* enabled) {
    this->enabled = enabled;
    this->m_enabled_isSet = true;
}


bool
OAIComDayCqDamCoreImplEventDamEventAuditListenerProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(event_filter != nullptr && event_filter->isSet()){ isObjectUpdated = true; break;}
        if(enabled != nullptr && enabled->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
