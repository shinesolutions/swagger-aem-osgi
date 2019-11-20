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


#include "OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties() {
    init();
}

OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::~OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties() {
    this->cleanup();
}

void
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::init() {
    granite_workflow_workflow_publish_event_service_enabled = new OAIConfigNodePropertyBoolean();
    m_granite_workflow_workflow_publish_event_service_enabled_isSet = false;
}

void
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::cleanup() {
    if(granite_workflow_workflow_publish_event_service_enabled != nullptr) { 
        delete granite_workflow_workflow_publish_event_service_enabled;
    }
}

OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties*
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&granite_workflow_workflow_publish_event_service_enabled, pJson["granite.workflow.WorkflowPublishEventService.enabled"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
}

QString
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::asJsonObject() {
    QJsonObject obj;
    if((granite_workflow_workflow_publish_event_service_enabled != nullptr) && (granite_workflow_workflow_publish_event_service_enabled->isSet())){
        toJsonValue(QString("granite.workflow.WorkflowPublishEventService.enabled"), granite_workflow_workflow_publish_event_service_enabled, obj, QString("OAIConfigNodePropertyBoolean"));
    }

    return obj;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::getGraniteWorkflowWorkflowPublishEventServiceEnabled() {
    return granite_workflow_workflow_publish_event_service_enabled;
}
void
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::setGraniteWorkflowWorkflowPublishEventServiceEnabled(OAIConfigNodePropertyBoolean* granite_workflow_workflow_publish_event_service_enabled) {
    this->granite_workflow_workflow_publish_event_service_enabled = granite_workflow_workflow_publish_event_service_enabled;
    this->m_granite_workflow_workflow_publish_event_service_enabled_isSet = true;
}


bool
OAIComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(granite_workflow_workflow_publish_event_service_enabled != nullptr && granite_workflow_workflow_publish_event_service_enabled->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
