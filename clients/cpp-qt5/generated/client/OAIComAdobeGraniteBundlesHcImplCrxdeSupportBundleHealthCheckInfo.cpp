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


#include "OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo() {
    init();
}

OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::~OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo() {
    this->cleanup();
}

void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::init() {
    pid = new QString("");
    m_pid_isSet = false;
    title = new QString("");
    m_title_isSet = false;
    description = new QString("");
    m_description_isSet = false;
    properties = new OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties();
    m_properties_isSet = false;
}

void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::cleanup() {
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

OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo*
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&pid, pJson["pid"], "QString", "QString");
    
    ::OpenAPI::setValue(&title, pJson["title"], "QString", "QString");
    
    ::OpenAPI::setValue(&description, pJson["description"], "QString", "QString");
    
    ::OpenAPI::setValue(&properties, pJson["properties"], "OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties", "OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties");
    
}

QString
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::asJsonObject() {
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
        toJsonValue(QString("properties"), properties, obj, QString("OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties"));
    }

    return obj;
}

QString*
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getPid() {
    return pid;
}
void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setPid(QString* pid) {
    this->pid = pid;
    this->m_pid_isSet = true;
}

QString*
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getTitle() {
    return title;
}
void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setTitle(QString* title) {
    this->title = title;
    this->m_title_isSet = true;
}

QString*
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getDescription() {
    return description;
}
void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setDescription(QString* description) {
    this->description = description;
    this->m_description_isSet = true;
}

OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties*
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getProperties() {
    return properties;
}
void
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setProperties(OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties* properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::isSet(){
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
