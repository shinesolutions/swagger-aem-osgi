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


#include "OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties() {
    init();
}

OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::~OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties() {
    this->cleanup();
}

void
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::init() {
    search_pattern = new OAIConfigNodePropertyString();
    m_search_pattern_isSet = false;
    replace_pattern = new OAIConfigNodePropertyString();
    m_replace_pattern_isSet = false;
}

void
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::cleanup() {
    if(search_pattern != nullptr) { 
        delete search_pattern;
    }
    if(replace_pattern != nullptr) { 
        delete replace_pattern;
    }
}

OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties*
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&search_pattern, pJson["search.pattern"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&replace_pattern, pJson["replace.pattern"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::asJsonObject() {
    QJsonObject obj;
    if((search_pattern != nullptr) && (search_pattern->isSet())){
        toJsonValue(QString("search.pattern"), search_pattern, obj, QString("OAIConfigNodePropertyString"));
    }
    if((replace_pattern != nullptr) && (replace_pattern->isSet())){
        toJsonValue(QString("replace.pattern"), replace_pattern, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::getSearchPattern() {
    return search_pattern;
}
void
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::setSearchPattern(OAIConfigNodePropertyString* search_pattern) {
    this->search_pattern = search_pattern;
    this->m_search_pattern_isSet = true;
}

OAIConfigNodePropertyString*
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::getReplacePattern() {
    return replace_pattern;
}
void
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::setReplacePattern(OAIConfigNodePropertyString* replace_pattern) {
    this->replace_pattern = replace_pattern;
    this->m_replace_pattern_isSet = true;
}


bool
OAIComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(search_pattern != nullptr && search_pattern->isSet()){ isObjectUpdated = true; break;}
        if(replace_pattern != nullptr && replace_pattern->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
