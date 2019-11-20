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


#include "OAIComDayCqContentsyncImplContentSyncManagerImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqContentsyncImplContentSyncManagerImplProperties::OAIComDayCqContentsyncImplContentSyncManagerImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqContentsyncImplContentSyncManagerImplProperties::OAIComDayCqContentsyncImplContentSyncManagerImplProperties() {
    init();
}

OAIComDayCqContentsyncImplContentSyncManagerImplProperties::~OAIComDayCqContentsyncImplContentSyncManagerImplProperties() {
    this->cleanup();
}

void
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::init() {
    contentsync_fallback_authorizable = new OAIConfigNodePropertyString();
    m_contentsync_fallback_authorizable_isSet = false;
    contentsync_fallback_updateuser = new OAIConfigNodePropertyString();
    m_contentsync_fallback_updateuser_isSet = false;
}

void
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::cleanup() {
    if(contentsync_fallback_authorizable != nullptr) { 
        delete contentsync_fallback_authorizable;
    }
    if(contentsync_fallback_updateuser != nullptr) { 
        delete contentsync_fallback_updateuser;
    }
}

OAIComDayCqContentsyncImplContentSyncManagerImplProperties*
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&contentsync_fallback_authorizable, pJson["contentsync.fallback.authorizable"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&contentsync_fallback_updateuser, pJson["contentsync.fallback.updateuser"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::asJsonObject() {
    QJsonObject obj;
    if((contentsync_fallback_authorizable != nullptr) && (contentsync_fallback_authorizable->isSet())){
        toJsonValue(QString("contentsync.fallback.authorizable"), contentsync_fallback_authorizable, obj, QString("OAIConfigNodePropertyString"));
    }
    if((contentsync_fallback_updateuser != nullptr) && (contentsync_fallback_updateuser->isSet())){
        toJsonValue(QString("contentsync.fallback.updateuser"), contentsync_fallback_updateuser, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::getContentsyncFallbackAuthorizable() {
    return contentsync_fallback_authorizable;
}
void
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::setContentsyncFallbackAuthorizable(OAIConfigNodePropertyString* contentsync_fallback_authorizable) {
    this->contentsync_fallback_authorizable = contentsync_fallback_authorizable;
    this->m_contentsync_fallback_authorizable_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::getContentsyncFallbackUpdateuser() {
    return contentsync_fallback_updateuser;
}
void
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::setContentsyncFallbackUpdateuser(OAIConfigNodePropertyString* contentsync_fallback_updateuser) {
    this->contentsync_fallback_updateuser = contentsync_fallback_updateuser;
    this->m_contentsync_fallback_updateuser_isSet = true;
}


bool
OAIComDayCqContentsyncImplContentSyncManagerImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(contentsync_fallback_authorizable != nullptr && contentsync_fallback_authorizable->isSet()){ isObjectUpdated = true; break;}
        if(contentsync_fallback_updateuser != nullptr && contentsync_fallback_updateuser->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
