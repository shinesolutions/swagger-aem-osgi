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


#include "OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo() {
    init();
}

OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::~OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo() {
    this->cleanup();
}

void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::init() {
    pid = new QString("");
    m_pid_isSet = false;
    title = new QString("");
    m_title_isSet = false;
    description = new QString("");
    m_description_isSet = false;
    properties = new OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties();
    m_properties_isSet = false;
}

void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::cleanup() {
    if(pid != nullptr) { 
        delete pid;
    }
    if(title != nullptr) { 
        delete title;
    }
    if(description != nullptr) { 
        delete description;
    }
    if(properties != nullptr) { 
        delete properties;
    }
}

OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo*
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&pid, pJson["pid"], "QString", "QString");
    
    ::OpenAPI::setValue(&title, pJson["title"], "QString", "QString");
    
    ::OpenAPI::setValue(&description, pJson["description"], "QString", "QString");
    
    ::OpenAPI::setValue(&properties, pJson["properties"], "OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties", "OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties");
    
}

QString
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::asJsonObject() {
    QJsonObject obj;
    if(pid != nullptr && *pid != QString("")){
        toJsonValue(QString("pid"), pid, obj, QString("QString"));
    }
    if(title != nullptr && *title != QString("")){
        toJsonValue(QString("title"), title, obj, QString("QString"));
    }
    if(description != nullptr && *description != QString("")){
        toJsonValue(QString("description"), description, obj, QString("QString"));
    }
    if((properties != nullptr) && (properties->isSet())){
        toJsonValue(QString("properties"), properties, obj, QString("OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties"));
    }

    return obj;
}

QString*
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getPid() {
    return pid;
}
void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setPid(QString* pid) {
    this->pid = pid;
    this->m_pid_isSet = true;
}

QString*
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getTitle() {
    return title;
}
void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setTitle(QString* title) {
    this->title = title;
    this->m_title_isSet = true;
}

QString*
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getDescription() {
    return description;
}
void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setDescription(QString* description) {
    this->description = description;
    this->m_description_isSet = true;
}

OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties*
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getProperties() {
    return properties;
}
void
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setProperties(OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties* properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::isSet(){
    bool isObjectUpdated = false;
    do{
        if(pid != nullptr && *pid != QString("")){ isObjectUpdated = true; break;}
        if(title != nullptr && *title != QString("")){ isObjectUpdated = true; break;}
        if(description != nullptr && *description != QString("")){ isObjectUpdated = true; break;}
        if(properties != nullptr && properties->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
