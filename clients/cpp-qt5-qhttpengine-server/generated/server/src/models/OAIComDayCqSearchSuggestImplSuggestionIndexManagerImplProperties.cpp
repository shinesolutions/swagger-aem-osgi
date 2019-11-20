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


#include "OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties() {
    this->init();
}

OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::~OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties() {
    
}

void
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::init() {
    m_path_builder_target_isSet = false;
    m_suggest_basepath_isSet = false;
}

void
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(path_builder_target, json[QString("pathBuilder.target")]);
    
    ::OpenAPI::fromJsonValue(suggest_basepath, json[QString("suggest.basepath")]);
    
}

QString
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(path_builder_target.isSet()){
        obj.insert(QString("pathBuilder.target"), ::OpenAPI::toJsonValue(path_builder_target));
    }
	if(suggest_basepath.isSet()){
        obj.insert(QString("suggest.basepath"), ::OpenAPI::toJsonValue(suggest_basepath));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::getPathBuilderTarget() const {
    return path_builder_target;
}
void
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::setPathBuilderTarget(const OAIConfigNodePropertyString &path_builder_target) {
    this->path_builder_target = path_builder_target;
    this->m_path_builder_target_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::getSuggestBasepath() const {
    return suggest_basepath;
}
void
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::setSuggestBasepath(const OAIConfigNodePropertyString &suggest_basepath) {
    this->suggest_basepath = suggest_basepath;
    this->m_suggest_basepath_isSet = true;
}


bool
OAIComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(path_builder_target.isSet()){ isObjectUpdated = true; break;}
    
        if(suggest_basepath.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
