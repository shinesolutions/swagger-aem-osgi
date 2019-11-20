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


#include "OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo(QString json) {
    init();
    this->fromJson(json);
}

OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo() {
    init();
}

OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::~OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo() {
    this->cleanup();
}

void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::init() {
    pid = new QString("");
    m_pid_isSet = false;
    title = new QString("");
    m_title_isSet = false;
    description = new QString("");
    m_description_isSet = false;
    properties = new OAIOrgApacheSlingHcCoreImplCompositeHealthCheckProperties();
    m_properties_isSet = false;
}

void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::cleanup() {
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

OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo*
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&pid, pJson["pid"], "QString", "QString");
    
    ::OpenAPI::setValue(&title, pJson["title"], "QString", "QString");
    
    ::OpenAPI::setValue(&description, pJson["description"], "QString", "QString");
    
    ::OpenAPI::setValue(&properties, pJson["properties"], "OAIOrgApacheSlingHcCoreImplCompositeHealthCheckProperties", "OAIOrgApacheSlingHcCoreImplCompositeHealthCheckProperties");
    
}

QString
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::asJsonObject() {
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
        toJsonValue(QString("properties"), properties, obj, QString("OAIOrgApacheSlingHcCoreImplCompositeHealthCheckProperties"));
    }

    return obj;
}

QString*
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getPid() {
    return pid;
}
void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setPid(QString* pid) {
    this->pid = pid;
    this->m_pid_isSet = true;
}

QString*
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getTitle() {
    return title;
}
void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setTitle(QString* title) {
    this->title = title;
    this->m_title_isSet = true;
}

QString*
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getDescription() {
    return description;
}
void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setDescription(QString* description) {
    this->description = description;
    this->m_description_isSet = true;
}

OAIOrgApacheSlingHcCoreImplCompositeHealthCheckProperties*
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getProperties() {
    return properties;
}
void
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setProperties(OAIOrgApacheSlingHcCoreImplCompositeHealthCheckProperties* properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIOrgApacheSlingHcCoreImplCompositeHealthCheckInfo::isSet(){
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
