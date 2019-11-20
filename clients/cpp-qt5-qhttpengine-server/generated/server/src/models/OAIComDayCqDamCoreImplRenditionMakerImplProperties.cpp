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


#include "OAIComDayCqDamCoreImplRenditionMakerImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplRenditionMakerImplProperties::OAIComDayCqDamCoreImplRenditionMakerImplProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqDamCoreImplRenditionMakerImplProperties::OAIComDayCqDamCoreImplRenditionMakerImplProperties() {
    this->init();
}

OAIComDayCqDamCoreImplRenditionMakerImplProperties::~OAIComDayCqDamCoreImplRenditionMakerImplProperties() {
    
}

void
OAIComDayCqDamCoreImplRenditionMakerImplProperties::init() {
    m_xmp_propagate_isSet = false;
    m_xmp_excludes_isSet = false;
}

void
OAIComDayCqDamCoreImplRenditionMakerImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqDamCoreImplRenditionMakerImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(xmp_propagate, json[QString("xmp.propagate")]);
    
    ::OpenAPI::fromJsonValue(xmp_excludes, json[QString("xmp.excludes")]);
    
}

QString
OAIComDayCqDamCoreImplRenditionMakerImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplRenditionMakerImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(xmp_propagate.isSet()){
        obj.insert(QString("xmp.propagate"), ::OpenAPI::toJsonValue(xmp_propagate));
    }
	if(xmp_excludes.isSet()){
        obj.insert(QString("xmp.excludes"), ::OpenAPI::toJsonValue(xmp_excludes));
    }
    return obj;
}

OAIConfigNodePropertyBoolean
OAIComDayCqDamCoreImplRenditionMakerImplProperties::getXmpPropagate() const {
    return xmp_propagate;
}
void
OAIComDayCqDamCoreImplRenditionMakerImplProperties::setXmpPropagate(const OAIConfigNodePropertyBoolean &xmp_propagate) {
    this->xmp_propagate = xmp_propagate;
    this->m_xmp_propagate_isSet = true;
}

OAIConfigNodePropertyArray
OAIComDayCqDamCoreImplRenditionMakerImplProperties::getXmpExcludes() const {
    return xmp_excludes;
}
void
OAIComDayCqDamCoreImplRenditionMakerImplProperties::setXmpExcludes(const OAIConfigNodePropertyArray &xmp_excludes) {
    this->xmp_excludes = xmp_excludes;
    this->m_xmp_excludes_isSet = true;
}


bool
OAIComDayCqDamCoreImplRenditionMakerImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(xmp_propagate.isSet()){ isObjectUpdated = true; break;}
    
        if(xmp_excludes.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
