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


#include "OAIComDayCqDamCoreImplServletResourceCollectionServletProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::OAIComDayCqDamCoreImplServletResourceCollectionServletProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::OAIComDayCqDamCoreImplServletResourceCollectionServletProperties() {
    init();
}

OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::~OAIComDayCqDamCoreImplServletResourceCollectionServletProperties() {
    this->cleanup();
}

void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::init() {
    sling_servlet_resource_types = new OAIConfigNodePropertyArray();
    m_sling_servlet_resource_types_isSet = false;
    sling_servlet_methods = new OAIConfigNodePropertyString();
    m_sling_servlet_methods_isSet = false;
    sling_servlet_selectors = new OAIConfigNodePropertyString();
    m_sling_servlet_selectors_isSet = false;
    download_config = new OAIConfigNodePropertyString();
    m_download_config_isSet = false;
    view_selector = new OAIConfigNodePropertyString();
    m_view_selector_isSet = false;
    send_email = new OAIConfigNodePropertyBoolean();
    m_send_email_isSet = false;
}

void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::cleanup() {
    if(sling_servlet_resource_types != nullptr) { 
        delete sling_servlet_resource_types;
    }
    if(sling_servlet_methods != nullptr) { 
        delete sling_servlet_methods;
    }
    if(sling_servlet_selectors != nullptr) { 
        delete sling_servlet_selectors;
    }
    if(download_config != nullptr) { 
        delete download_config;
    }
    if(view_selector != nullptr) { 
        delete view_selector;
    }
    if(send_email != nullptr) { 
        delete send_email;
    }
}

OAIComDayCqDamCoreImplServletResourceCollectionServletProperties*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&sling_servlet_resource_types, pJson["sling.servlet.resourceTypes"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&sling_servlet_methods, pJson["sling.servlet.methods"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&sling_servlet_selectors, pJson["sling.servlet.selectors"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&download_config, pJson["download.config"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&view_selector, pJson["view.selector"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&send_email, pJson["send_email"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
}

QString
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::asJsonObject() {
    QJsonObject obj;
    if((sling_servlet_resource_types != nullptr) && (sling_servlet_resource_types->isSet())){
        toJsonValue(QString("sling.servlet.resourceTypes"), sling_servlet_resource_types, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((sling_servlet_methods != nullptr) && (sling_servlet_methods->isSet())){
        toJsonValue(QString("sling.servlet.methods"), sling_servlet_methods, obj, QString("OAIConfigNodePropertyString"));
    }
    if((sling_servlet_selectors != nullptr) && (sling_servlet_selectors->isSet())){
        toJsonValue(QString("sling.servlet.selectors"), sling_servlet_selectors, obj, QString("OAIConfigNodePropertyString"));
    }
    if((download_config != nullptr) && (download_config->isSet())){
        toJsonValue(QString("download.config"), download_config, obj, QString("OAIConfigNodePropertyString"));
    }
    if((view_selector != nullptr) && (view_selector->isSet())){
        toJsonValue(QString("view.selector"), view_selector, obj, QString("OAIConfigNodePropertyString"));
    }
    if((send_email != nullptr) && (send_email->isSet())){
        toJsonValue(QString("send_email"), send_email, obj, QString("OAIConfigNodePropertyBoolean"));
    }

    return obj;
}

OAIConfigNodePropertyArray*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingServletResourceTypes() {
    return sling_servlet_resource_types;
}
void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingServletResourceTypes(OAIConfigNodePropertyArray* sling_servlet_resource_types) {
    this->sling_servlet_resource_types = sling_servlet_resource_types;
    this->m_sling_servlet_resource_types_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingServletMethods() {
    return sling_servlet_methods;
}
void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingServletMethods(OAIConfigNodePropertyString* sling_servlet_methods) {
    this->sling_servlet_methods = sling_servlet_methods;
    this->m_sling_servlet_methods_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingServletSelectors() {
    return sling_servlet_selectors;
}
void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingServletSelectors(OAIConfigNodePropertyString* sling_servlet_selectors) {
    this->sling_servlet_selectors = sling_servlet_selectors;
    this->m_sling_servlet_selectors_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::getDownloadConfig() {
    return download_config;
}
void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::setDownloadConfig(OAIConfigNodePropertyString* download_config) {
    this->download_config = download_config;
    this->m_download_config_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::getViewSelector() {
    return view_selector;
}
void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::setViewSelector(OAIConfigNodePropertyString* view_selector) {
    this->view_selector = view_selector;
    this->m_view_selector_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::getSendEmail() {
    return send_email;
}
void
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::setSendEmail(OAIConfigNodePropertyBoolean* send_email) {
    this->send_email = send_email;
    this->m_send_email_isSet = true;
}


bool
OAIComDayCqDamCoreImplServletResourceCollectionServletProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(sling_servlet_resource_types != nullptr && sling_servlet_resource_types->isSet()){ isObjectUpdated = true; break;}
        if(sling_servlet_methods != nullptr && sling_servlet_methods->isSet()){ isObjectUpdated = true; break;}
        if(sling_servlet_selectors != nullptr && sling_servlet_selectors->isSet()){ isObjectUpdated = true; break;}
        if(download_config != nullptr && download_config->isSet()){ isObjectUpdated = true; break;}
        if(view_selector != nullptr && view_selector->isSet()){ isObjectUpdated = true; break;}
        if(send_email != nullptr && send_email->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
