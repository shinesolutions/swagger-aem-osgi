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


#include "OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties() {
    this->init();
}

OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::~OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties() {
    
}

void
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::init() {
    m_mime_types_isSet = false;
    m_max_extract_isSet = false;
}

void
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(mime_types, json[QString("mimeTypes")]);
    
    ::OpenAPI::fromJsonValue(max_extract, json[QString("maxExtract")]);
    
}

QString
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::asJsonObject() const {
    QJsonObject obj;
	if(mime_types.isSet()){
        obj.insert(QString("mimeTypes"), ::OpenAPI::toJsonValue(mime_types));
    }
	if(max_extract.isSet()){
        obj.insert(QString("maxExtract"), ::OpenAPI::toJsonValue(max_extract));
    }
    return obj;
}

OAIConfigNodePropertyArray
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::getMimeTypes() const {
    return mime_types;
}
void
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::setMimeTypes(const OAIConfigNodePropertyArray &mime_types) {
    this->mime_types = mime_types;
    this->m_mime_types_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::getMaxExtract() const {
    return max_extract;
}
void
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::setMaxExtract(const OAIConfigNodePropertyInteger &max_extract) {
    this->max_extract = max_extract;
    this->m_max_extract_isSet = true;
}


bool
OAIComDayCqDamCoreImplProcessTextExtractionProcessProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(mime_types.isSet()){ isObjectUpdated = true; break;}
    
        if(max_extract.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
