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


#include "OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties() {
    init();
}

OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::~OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties() {
    this->cleanup();
}

void
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::init() {
    jmx_objectname = new OAIConfigNodePropertyString();
    m_jmx_objectname_isSet = false;
}

void
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::cleanup() {
    if(jmx_objectname != nullptr) { 
        delete jmx_objectname;
    }
}

OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties*
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&jmx_objectname, pJson["jmx.objectname"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::asJsonObject() {
    QJsonObject obj;
    if((jmx_objectname != nullptr) && (jmx_objectname->isSet())){
        toJsonValue(QString("jmx.objectname"), jmx_objectname, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::getJmxObjectname() {
    return jmx_objectname;
}
void
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::setJmxObjectname(OAIConfigNodePropertyString* jmx_objectname) {
    this->jmx_objectname = jmx_objectname;
    this->m_jmx_objectname_isSet = true;
}


bool
OAIComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(jmx_objectname != nullptr && jmx_objectname->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
