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


#include "OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties() {
    init();
}

OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::~OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties() {
    this->cleanup();
}

void
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::init() {
    cq_dam_allow_all_mime = new OAIConfigNodePropertyBoolean();
    m_cq_dam_allow_all_mime_isSet = false;
    cq_dam_allowed_asset_mimes = new OAIConfigNodePropertyArray();
    m_cq_dam_allowed_asset_mimes_isSet = false;
}

void
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::cleanup() {
    if(cq_dam_allow_all_mime != nullptr) { 
        delete cq_dam_allow_all_mime;
    }
    if(cq_dam_allowed_asset_mimes != nullptr) { 
        delete cq_dam_allowed_asset_mimes;
    }
}

OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties*
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&cq_dam_allow_all_mime, pJson["cq.dam.allow.all.mime"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&cq_dam_allowed_asset_mimes, pJson["cq.dam.allowed.asset.mimes"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
}

QString
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::asJsonObject() {
    QJsonObject obj;
    if((cq_dam_allow_all_mime != nullptr) && (cq_dam_allow_all_mime->isSet())){
        toJsonValue(QString("cq.dam.allow.all.mime"), cq_dam_allow_all_mime, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((cq_dam_allowed_asset_mimes != nullptr) && (cq_dam_allowed_asset_mimes->isSet())){
        toJsonValue(QString("cq.dam.allowed.asset.mimes"), cq_dam_allowed_asset_mimes, obj, QString("OAIConfigNodePropertyArray"));
    }

    return obj;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::getCqDamAllowAllMime() {
    return cq_dam_allow_all_mime;
}
void
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::setCqDamAllowAllMime(OAIConfigNodePropertyBoolean* cq_dam_allow_all_mime) {
    this->cq_dam_allow_all_mime = cq_dam_allow_all_mime;
    this->m_cq_dam_allow_all_mime_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::getCqDamAllowedAssetMimes() {
    return cq_dam_allowed_asset_mimes;
}
void
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::setCqDamAllowedAssetMimes(OAIConfigNodePropertyArray* cq_dam_allowed_asset_mimes) {
    this->cq_dam_allowed_asset_mimes = cq_dam_allowed_asset_mimes;
    this->m_cq_dam_allowed_asset_mimes_isSet = true;
}


bool
OAIComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(cq_dam_allow_all_mime != nullptr && cq_dam_allow_all_mime->isSet()){ isObjectUpdated = true; break;}
        if(cq_dam_allowed_asset_mimes != nullptr && cq_dam_allowed_asset_mimes->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
