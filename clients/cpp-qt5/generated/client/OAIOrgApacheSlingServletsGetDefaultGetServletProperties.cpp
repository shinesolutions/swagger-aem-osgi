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


#include "OAIOrgApacheSlingServletsGetDefaultGetServletProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingServletsGetDefaultGetServletProperties::OAIOrgApacheSlingServletsGetDefaultGetServletProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIOrgApacheSlingServletsGetDefaultGetServletProperties::OAIOrgApacheSlingServletsGetDefaultGetServletProperties() {
    init();
}

OAIOrgApacheSlingServletsGetDefaultGetServletProperties::~OAIOrgApacheSlingServletsGetDefaultGetServletProperties() {
    this->cleanup();
}

void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::init() {
    aliases = new OAIConfigNodePropertyArray();
    m_aliases_isSet = false;
    index = new OAIConfigNodePropertyBoolean();
    m_index_isSet = false;
    index_files = new OAIConfigNodePropertyArray();
    m_index_files_isSet = false;
    enable_html = new OAIConfigNodePropertyBoolean();
    m_enable_html_isSet = false;
    enable_json = new OAIConfigNodePropertyBoolean();
    m_enable_json_isSet = false;
    enable_txt = new OAIConfigNodePropertyBoolean();
    m_enable_txt_isSet = false;
    enable_xml = new OAIConfigNodePropertyBoolean();
    m_enable_xml_isSet = false;
    json_maximumresults = new OAIConfigNodePropertyInteger();
    m_json_maximumresults_isSet = false;
    ecma_suport = new OAIConfigNodePropertyBoolean();
    m_ecma_suport_isSet = false;
}

void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::cleanup() {
    if(aliases != nullptr) { 
        delete aliases;
    }
    if(index != nullptr) { 
        delete index;
    }
    if(index_files != nullptr) { 
        delete index_files;
    }
    if(enable_html != nullptr) { 
        delete enable_html;
    }
    if(enable_json != nullptr) { 
        delete enable_json;
    }
    if(enable_txt != nullptr) { 
        delete enable_txt;
    }
    if(enable_xml != nullptr) { 
        delete enable_xml;
    }
    if(json_maximumresults != nullptr) { 
        delete json_maximumresults;
    }
    if(ecma_suport != nullptr) { 
        delete ecma_suport;
    }
}

OAIOrgApacheSlingServletsGetDefaultGetServletProperties*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&aliases, pJson["aliases"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&index, pJson["index"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&index_files, pJson["index.files"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&enable_html, pJson["enable.html"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&enable_json, pJson["enable.json"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&enable_txt, pJson["enable.txt"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&enable_xml, pJson["enable.xml"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&json_maximumresults, pJson["json.maximumresults"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&ecma_suport, pJson["ecmaSuport"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
}

QString
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::asJsonObject() {
    QJsonObject obj;
    if((aliases != nullptr) && (aliases->isSet())){
        toJsonValue(QString("aliases"), aliases, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((index != nullptr) && (index->isSet())){
        toJsonValue(QString("index"), index, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((index_files != nullptr) && (index_files->isSet())){
        toJsonValue(QString("index.files"), index_files, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((enable_html != nullptr) && (enable_html->isSet())){
        toJsonValue(QString("enable.html"), enable_html, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((enable_json != nullptr) && (enable_json->isSet())){
        toJsonValue(QString("enable.json"), enable_json, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((enable_txt != nullptr) && (enable_txt->isSet())){
        toJsonValue(QString("enable.txt"), enable_txt, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((enable_xml != nullptr) && (enable_xml->isSet())){
        toJsonValue(QString("enable.xml"), enable_xml, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((json_maximumresults != nullptr) && (json_maximumresults->isSet())){
        toJsonValue(QString("json.maximumresults"), json_maximumresults, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((ecma_suport != nullptr) && (ecma_suport->isSet())){
        toJsonValue(QString("ecmaSuport"), ecma_suport, obj, QString("OAIConfigNodePropertyBoolean"));
    }

    return obj;
}

OAIConfigNodePropertyArray*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getAliases() {
    return aliases;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setAliases(OAIConfigNodePropertyArray* aliases) {
    this->aliases = aliases;
    this->m_aliases_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getIndex() {
    return index;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setIndex(OAIConfigNodePropertyBoolean* index) {
    this->index = index;
    this->m_index_isSet = true;
}

OAIConfigNodePropertyArray*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getIndexFiles() {
    return index_files;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setIndexFiles(OAIConfigNodePropertyArray* index_files) {
    this->index_files = index_files;
    this->m_index_files_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getEnableHtml() {
    return enable_html;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setEnableHtml(OAIConfigNodePropertyBoolean* enable_html) {
    this->enable_html = enable_html;
    this->m_enable_html_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getEnableJson() {
    return enable_json;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setEnableJson(OAIConfigNodePropertyBoolean* enable_json) {
    this->enable_json = enable_json;
    this->m_enable_json_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getEnableTxt() {
    return enable_txt;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setEnableTxt(OAIConfigNodePropertyBoolean* enable_txt) {
    this->enable_txt = enable_txt;
    this->m_enable_txt_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getEnableXml() {
    return enable_xml;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setEnableXml(OAIConfigNodePropertyBoolean* enable_xml) {
    this->enable_xml = enable_xml;
    this->m_enable_xml_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getJsonMaximumresults() {
    return json_maximumresults;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setJsonMaximumresults(OAIConfigNodePropertyInteger* json_maximumresults) {
    this->json_maximumresults = json_maximumresults;
    this->m_json_maximumresults_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::getEcmaSuport() {
    return ecma_suport;
}
void
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::setEcmaSuport(OAIConfigNodePropertyBoolean* ecma_suport) {
    this->ecma_suport = ecma_suport;
    this->m_ecma_suport_isSet = true;
}


bool
OAIOrgApacheSlingServletsGetDefaultGetServletProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(aliases != nullptr && aliases->isSet()){ isObjectUpdated = true; break;}
        if(index != nullptr && index->isSet()){ isObjectUpdated = true; break;}
        if(index_files != nullptr && index_files->isSet()){ isObjectUpdated = true; break;}
        if(enable_html != nullptr && enable_html->isSet()){ isObjectUpdated = true; break;}
        if(enable_json != nullptr && enable_json->isSet()){ isObjectUpdated = true; break;}
        if(enable_txt != nullptr && enable_txt->isSet()){ isObjectUpdated = true; break;}
        if(enable_xml != nullptr && enable_xml->isSet()){ isObjectUpdated = true; break;}
        if(json_maximumresults != nullptr && json_maximumresults->isSet()){ isObjectUpdated = true; break;}
        if(ecma_suport != nullptr && ecma_suport->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
