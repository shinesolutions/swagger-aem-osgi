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


#include "OAIComDayCqDamInddImplServletSnippetCreationServletProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamInddImplServletSnippetCreationServletProperties::OAIComDayCqDamInddImplServletSnippetCreationServletProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqDamInddImplServletSnippetCreationServletProperties::OAIComDayCqDamInddImplServletSnippetCreationServletProperties() {
    init();
}

OAIComDayCqDamInddImplServletSnippetCreationServletProperties::~OAIComDayCqDamInddImplServletSnippetCreationServletProperties() {
    this->cleanup();
}

void
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::init() {
    snippetcreation_maxcollections = new OAIConfigNodePropertyInteger();
    m_snippetcreation_maxcollections_isSet = false;
}

void
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::cleanup() {
    if(snippetcreation_maxcollections != nullptr) { 
        delete snippetcreation_maxcollections;
    }
}

OAIComDayCqDamInddImplServletSnippetCreationServletProperties*
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&snippetcreation_maxcollections, pJson["snippetcreation.maxcollections"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
}

QString
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::asJsonObject() {
    QJsonObject obj;
    if((snippetcreation_maxcollections != nullptr) && (snippetcreation_maxcollections->isSet())){
        toJsonValue(QString("snippetcreation.maxcollections"), snippetcreation_maxcollections, obj, QString("OAIConfigNodePropertyInteger"));
    }

    return obj;
}

OAIConfigNodePropertyInteger*
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::getSnippetcreationMaxcollections() {
    return snippetcreation_maxcollections;
}
void
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::setSnippetcreationMaxcollections(OAIConfigNodePropertyInteger* snippetcreation_maxcollections) {
    this->snippetcreation_maxcollections = snippetcreation_maxcollections;
    this->m_snippetcreation_maxcollections_isSet = true;
}


bool
OAIComDayCqDamInddImplServletSnippetCreationServletProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(snippetcreation_maxcollections != nullptr && snippetcreation_maxcollections->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
