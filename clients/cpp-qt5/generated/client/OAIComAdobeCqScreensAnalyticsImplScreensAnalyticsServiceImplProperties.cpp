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


#include "OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties() {
    init();
}

OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::~OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties() {
    this->cleanup();
}

void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::init() {
    com_adobe_cq_screens_analytics_impl_url = new OAIConfigNodePropertyString();
    m_com_adobe_cq_screens_analytics_impl_url_isSet = false;
    com_adobe_cq_screens_analytics_impl_apikey = new OAIConfigNodePropertyString();
    m_com_adobe_cq_screens_analytics_impl_apikey_isSet = false;
    com_adobe_cq_screens_analytics_impl_project = new OAIConfigNodePropertyString();
    m_com_adobe_cq_screens_analytics_impl_project_isSet = false;
    com_adobe_cq_screens_analytics_impl_environment = new OAIConfigNodePropertyDropDown();
    m_com_adobe_cq_screens_analytics_impl_environment_isSet = false;
    com_adobe_cq_screens_analytics_impl_send_frequency = new OAIConfigNodePropertyInteger();
    m_com_adobe_cq_screens_analytics_impl_send_frequency_isSet = false;
}

void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::cleanup() {
    if(com_adobe_cq_screens_analytics_impl_url != nullptr) { 
        delete com_adobe_cq_screens_analytics_impl_url;
    }
    if(com_adobe_cq_screens_analytics_impl_apikey != nullptr) { 
        delete com_adobe_cq_screens_analytics_impl_apikey;
    }
    if(com_adobe_cq_screens_analytics_impl_project != nullptr) { 
        delete com_adobe_cq_screens_analytics_impl_project;
    }
    if(com_adobe_cq_screens_analytics_impl_environment != nullptr) { 
        delete com_adobe_cq_screens_analytics_impl_environment;
    }
    if(com_adobe_cq_screens_analytics_impl_send_frequency != nullptr) { 
        delete com_adobe_cq_screens_analytics_impl_send_frequency;
    }
}

OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties*
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&com_adobe_cq_screens_analytics_impl_url, pJson["com.adobe.cq.screens.analytics.impl.url"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&com_adobe_cq_screens_analytics_impl_apikey, pJson["com.adobe.cq.screens.analytics.impl.apikey"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&com_adobe_cq_screens_analytics_impl_project, pJson["com.adobe.cq.screens.analytics.impl.project"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&com_adobe_cq_screens_analytics_impl_environment, pJson["com.adobe.cq.screens.analytics.impl.environment"], "OAIConfigNodePropertyDropDown", "OAIConfigNodePropertyDropDown");
    
    ::OpenAPI::setValue(&com_adobe_cq_screens_analytics_impl_send_frequency, pJson["com.adobe.cq.screens.analytics.impl.sendFrequency"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
}

QString
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::asJsonObject() {
    QJsonObject obj;
    if((com_adobe_cq_screens_analytics_impl_url != nullptr) && (com_adobe_cq_screens_analytics_impl_url->isSet())){
        toJsonValue(QString("com.adobe.cq.screens.analytics.impl.url"), com_adobe_cq_screens_analytics_impl_url, obj, QString("OAIConfigNodePropertyString"));
    }
    if((com_adobe_cq_screens_analytics_impl_apikey != nullptr) && (com_adobe_cq_screens_analytics_impl_apikey->isSet())){
        toJsonValue(QString("com.adobe.cq.screens.analytics.impl.apikey"), com_adobe_cq_screens_analytics_impl_apikey, obj, QString("OAIConfigNodePropertyString"));
    }
    if((com_adobe_cq_screens_analytics_impl_project != nullptr) && (com_adobe_cq_screens_analytics_impl_project->isSet())){
        toJsonValue(QString("com.adobe.cq.screens.analytics.impl.project"), com_adobe_cq_screens_analytics_impl_project, obj, QString("OAIConfigNodePropertyString"));
    }
    if((com_adobe_cq_screens_analytics_impl_environment != nullptr) && (com_adobe_cq_screens_analytics_impl_environment->isSet())){
        toJsonValue(QString("com.adobe.cq.screens.analytics.impl.environment"), com_adobe_cq_screens_analytics_impl_environment, obj, QString("OAIConfigNodePropertyDropDown"));
    }
    if((com_adobe_cq_screens_analytics_impl_send_frequency != nullptr) && (com_adobe_cq_screens_analytics_impl_send_frequency->isSet())){
        toJsonValue(QString("com.adobe.cq.screens.analytics.impl.sendFrequency"), com_adobe_cq_screens_analytics_impl_send_frequency, obj, QString("OAIConfigNodePropertyInteger"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComAdobeCqScreensAnalyticsImplUrl() {
    return com_adobe_cq_screens_analytics_impl_url;
}
void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComAdobeCqScreensAnalyticsImplUrl(OAIConfigNodePropertyString* com_adobe_cq_screens_analytics_impl_url) {
    this->com_adobe_cq_screens_analytics_impl_url = com_adobe_cq_screens_analytics_impl_url;
    this->m_com_adobe_cq_screens_analytics_impl_url_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComAdobeCqScreensAnalyticsImplApikey() {
    return com_adobe_cq_screens_analytics_impl_apikey;
}
void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComAdobeCqScreensAnalyticsImplApikey(OAIConfigNodePropertyString* com_adobe_cq_screens_analytics_impl_apikey) {
    this->com_adobe_cq_screens_analytics_impl_apikey = com_adobe_cq_screens_analytics_impl_apikey;
    this->m_com_adobe_cq_screens_analytics_impl_apikey_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComAdobeCqScreensAnalyticsImplProject() {
    return com_adobe_cq_screens_analytics_impl_project;
}
void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComAdobeCqScreensAnalyticsImplProject(OAIConfigNodePropertyString* com_adobe_cq_screens_analytics_impl_project) {
    this->com_adobe_cq_screens_analytics_impl_project = com_adobe_cq_screens_analytics_impl_project;
    this->m_com_adobe_cq_screens_analytics_impl_project_isSet = true;
}

OAIConfigNodePropertyDropDown*
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComAdobeCqScreensAnalyticsImplEnvironment() {
    return com_adobe_cq_screens_analytics_impl_environment;
}
void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComAdobeCqScreensAnalyticsImplEnvironment(OAIConfigNodePropertyDropDown* com_adobe_cq_screens_analytics_impl_environment) {
    this->com_adobe_cq_screens_analytics_impl_environment = com_adobe_cq_screens_analytics_impl_environment;
    this->m_com_adobe_cq_screens_analytics_impl_environment_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComAdobeCqScreensAnalyticsImplSendFrequency() {
    return com_adobe_cq_screens_analytics_impl_send_frequency;
}
void
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComAdobeCqScreensAnalyticsImplSendFrequency(OAIConfigNodePropertyInteger* com_adobe_cq_screens_analytics_impl_send_frequency) {
    this->com_adobe_cq_screens_analytics_impl_send_frequency = com_adobe_cq_screens_analytics_impl_send_frequency;
    this->m_com_adobe_cq_screens_analytics_impl_send_frequency_isSet = true;
}


bool
OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(com_adobe_cq_screens_analytics_impl_url != nullptr && com_adobe_cq_screens_analytics_impl_url->isSet()){ isObjectUpdated = true; break;}
        if(com_adobe_cq_screens_analytics_impl_apikey != nullptr && com_adobe_cq_screens_analytics_impl_apikey->isSet()){ isObjectUpdated = true; break;}
        if(com_adobe_cq_screens_analytics_impl_project != nullptr && com_adobe_cq_screens_analytics_impl_project->isSet()){ isObjectUpdated = true; break;}
        if(com_adobe_cq_screens_analytics_impl_environment != nullptr && com_adobe_cq_screens_analytics_impl_environment->isSet()){ isObjectUpdated = true; break;}
        if(com_adobe_cq_screens_analytics_impl_send_frequency != nullptr && com_adobe_cq_screens_analytics_impl_send_frequency->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
