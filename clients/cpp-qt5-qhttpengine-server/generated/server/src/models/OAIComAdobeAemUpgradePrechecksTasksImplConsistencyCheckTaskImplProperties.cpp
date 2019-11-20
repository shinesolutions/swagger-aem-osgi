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


#include "OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties() {
    this->init();
}

OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::~OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties() {
    
}

void
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::init() {
    m_root_path_isSet = false;
    m_fix_inconsistencies_isSet = false;
}

void
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(root_path, json[QString("root.path")]);
    
    ::OpenAPI::fromJsonValue(fix_inconsistencies, json[QString("fix.inconsistencies")]);
    
}

QString
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(root_path.isSet()){
        obj.insert(QString("root.path"), ::OpenAPI::toJsonValue(root_path));
    }
	if(fix_inconsistencies.isSet()){
        obj.insert(QString("fix.inconsistencies"), ::OpenAPI::toJsonValue(fix_inconsistencies));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::getRootPath() const {
    return root_path;
}
void
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::setRootPath(const OAIConfigNodePropertyString &root_path) {
    this->root_path = root_path;
    this->m_root_path_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::getFixInconsistencies() const {
    return fix_inconsistencies;
}
void
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::setFixInconsistencies(const OAIConfigNodePropertyBoolean &fix_inconsistencies) {
    this->fix_inconsistencies = fix_inconsistencies;
    this->m_fix_inconsistencies_isSet = true;
}


bool
OAIComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(root_path.isSet()){ isObjectUpdated = true; break;}
    
        if(fix_inconsistencies.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
