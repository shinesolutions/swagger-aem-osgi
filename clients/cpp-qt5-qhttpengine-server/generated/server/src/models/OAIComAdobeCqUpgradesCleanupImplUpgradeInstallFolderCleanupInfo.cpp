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


#include "OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo() {
    this->init();
}

OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::~OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo() {
    
}

void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::init() {
    m_pid_isSet = false;
    m_title_isSet = false;
    m_description_isSet = false;
    m_properties_isSet = false;
}

void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(pid, json[QString("pid")]);
    
    ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    
    ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    
    ::OpenAPI::fromJsonValue(properties, json[QString("properties")]);
    
}

QString
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::asJsonObject() const {
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
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getPid() const {
    return pid;
}
void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setPid(const QString &pid) {
    this->pid = pid;
    this->m_pid_isSet = true;
}

QString
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getTitle() const {
    return title;
}
void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

QString
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getDescription() const {
    return description;
}
void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getProperties() const {
    return properties;
}
void
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setProperties(const OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties &properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::isSet() const {
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

