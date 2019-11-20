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


#include "OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo() {
    this->init();
}

OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::~OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo() {
    
}

void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::init() {
    m_pid_isSet = false;
    m_title_isSet = false;
    m_description_isSet = false;
    m_properties_isSet = false;
}

void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(pid, json[QString("pid")]);
    
    ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    
    ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    
    ::OpenAPI::fromJsonValue(properties, json[QString("properties")]);
    
}

QString
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::asJsonObject() const {
    QJsonObject obj;
	if(m_pid_isSet){
        obj.insert(QString("pid"), ::OpenAPI::toJsonValue(pid));
    }
	if(m_title_isSet){
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
	if(m_description_isSet){
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
	if(properties.isSet()){
        obj.insert(QString("properties"), ::OpenAPI::toJsonValue(properties));
    }
    return obj;
}

QString
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getPid() const {
    return pid;
}
void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setPid(const QString &pid) {
    this->pid = pid;
    this->m_pid_isSet = true;
}

QString
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getTitle() const {
    return title;
}
void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

QString
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getDescription() const {
    return description;
}
void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getProperties() const {
    return properties;
}
void
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setProperties(const OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties &properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_pid_isSet){ isObjectUpdated = true; break;}
    
        if(m_title_isSet){ isObjectUpdated = true; break;}
    
        if(m_description_isSet){ isObjectUpdated = true; break;}
    
        if(properties.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
