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


#include "OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties() {
    init();
}

OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::~OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties() {
    this->cleanup();
}

void
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::init() {
    delete_zip_file = new OAIConfigNodePropertyBoolean();
    m_delete_zip_file_isSet = false;
}

void
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::cleanup() {
    if(delete_zip_file != nullptr) { 
        delete delete_zip_file;
    }
}

OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties*
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&delete_zip_file, pJson["delete.zip.file"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
}

QString
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::asJsonObject() {
    QJsonObject obj;
    if((delete_zip_file != nullptr) && (delete_zip_file->isSet())){
        toJsonValue(QString("delete.zip.file"), delete_zip_file, obj, QString("OAIConfigNodePropertyBoolean"));
    }

    return obj;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::getDeleteZipFile() {
    return delete_zip_file;
}
void
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::setDeleteZipFile(OAIConfigNodePropertyBoolean* delete_zip_file) {
    this->delete_zip_file = delete_zip_file;
    this->m_delete_zip_file_isSet = true;
}


bool
OAIComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(delete_zip_file != nullptr && delete_zip_file->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
