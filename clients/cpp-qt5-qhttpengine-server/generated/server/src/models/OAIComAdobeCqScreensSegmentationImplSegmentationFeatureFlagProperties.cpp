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


#include "OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties() {
    this->init();
}

OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::~OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties() {
    
}

void
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::init() {
    m_enable_data_triggered_content_isSet = false;
}

void
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(enable_data_triggered_content, json[QString("enableDataTriggeredContent")]);
    
}

QString
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::asJsonObject() const {
    QJsonObject obj;
	if(enable_data_triggered_content.isSet()){
        obj.insert(QString("enableDataTriggeredContent"), ::OpenAPI::toJsonValue(enable_data_triggered_content));
    }
    return obj;
}

OAIConfigNodePropertyBoolean
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::getEnableDataTriggeredContent() const {
    return enable_data_triggered_content;
}
void
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::setEnableDataTriggeredContent(const OAIConfigNodePropertyBoolean &enable_data_triggered_content) {
    this->enable_data_triggered_content = enable_data_triggered_content;
    this->m_enable_data_triggered_content_isSet = true;
}


bool
OAIComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(enable_data_triggered_content.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
