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


#include "OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties() {
    this->init();
}

OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::~OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties() {
    
}

void
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::init() {
    m_effective_bundle_list_path_isSet = false;
}

void
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(effective_bundle_list_path, json[QString("effectiveBundleListPath")]);
    
}

QString
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::asJsonObject() const {
    QJsonObject obj;
	if(effective_bundle_list_path.isSet()){
        obj.insert(QString("effectiveBundleListPath"), ::OpenAPI::toJsonValue(effective_bundle_list_path));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::getEffectiveBundleListPath() const {
    return effective_bundle_list_path;
}
void
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::setEffectiveBundleListPath(const OAIConfigNodePropertyString &effective_bundle_list_path) {
    this->effective_bundle_list_path = effective_bundle_list_path;
    this->m_effective_bundle_list_path_isSet = true;
}


bool
OAIComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(effective_bundle_list_path.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
