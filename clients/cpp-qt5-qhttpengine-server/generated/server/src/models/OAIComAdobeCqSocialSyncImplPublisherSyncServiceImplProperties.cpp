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


#include "OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties() {
    this->init();
}

OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::~OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties() {
    
}

void
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::init() {
    m_active_run_modes_isSet = false;
}

void
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(active_run_modes, json[QString("activeRunModes")]);
    
}

QString
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(active_run_modes.isSet()){
        obj.insert(QString("activeRunModes"), ::OpenAPI::toJsonValue(active_run_modes));
    }
    return obj;
}

OAIConfigNodePropertyArray
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::getActiveRunModes() const {
    return active_run_modes;
}
void
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::setActiveRunModes(const OAIConfigNodePropertyArray &active_run_modes) {
    this->active_run_modes = active_run_modes;
    this->m_active_run_modes_isSet = true;
}


bool
OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(active_run_modes.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
