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


#include "OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties() {
    this->init();
}

OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::~OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties() {
    
}

void
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::init() {
    m_process_label_isSet = false;
}

void
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(process_label, json[QString("process.label")]);
    
}

QString
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::asJsonObject() const {
    QJsonObject obj;
	if(process_label.isSet()){
        obj.insert(QString("process.label"), ::OpenAPI::toJsonValue(process_label));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::getProcessLabel() const {
    return process_label;
}
void
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::setProcessLabel(const OAIConfigNodePropertyString &process_label) {
    this->process_label = process_label;
    this->m_process_label_isSet = true;
}


bool
OAIComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(process_label.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
