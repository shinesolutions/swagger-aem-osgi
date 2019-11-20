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


#include "OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties() {
    init();
}

OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::~OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties() {
    this->cleanup();
}

void
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::init() {
    hc_tags = new OAIConfigNodePropertyArray();
    m_hc_tags_isSet = false;
    webserver_address = new OAIConfigNodePropertyString();
    m_webserver_address_isSet = false;
}

void
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::cleanup() {
    if(hc_tags != nullptr) { 
        delete hc_tags;
    }
    if(webserver_address != nullptr) { 
        delete webserver_address;
    }
}

OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties*
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&hc_tags, pJson["hc.tags"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&webserver_address, pJson["webserver.address"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::asJsonObject() {
    QJsonObject obj;
    if((hc_tags != nullptr) && (hc_tags->isSet())){
        toJsonValue(QString("hc.tags"), hc_tags, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((webserver_address != nullptr) && (webserver_address->isSet())){
        toJsonValue(QString("webserver.address"), webserver_address, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyArray*
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::getHcTags() {
    return hc_tags;
}
void
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::setHcTags(OAIConfigNodePropertyArray* hc_tags) {
    this->hc_tags = hc_tags;
    this->m_hc_tags_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::getWebserverAddress() {
    return webserver_address;
}
void
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::setWebserverAddress(OAIConfigNodePropertyString* webserver_address) {
    this->webserver_address = webserver_address;
    this->m_webserver_address_isSet = true;
}


bool
OAIComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(hc_tags != nullptr && hc_tags->isSet()){ isObjectUpdated = true; break;}
        if(webserver_address != nullptr && webserver_address->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
