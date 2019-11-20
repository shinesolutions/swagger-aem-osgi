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


#include "OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties() {
    init();
}

OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::~OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties() {
    this->cleanup();
}

void
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::init() {
    upgrade_task_ignore_list = new OAIConfigNodePropertyArray();
    m_upgrade_task_ignore_list_isSet = false;
}

void
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::cleanup() {
    if(upgrade_task_ignore_list != nullptr) { 
        delete upgrade_task_ignore_list;
    }
}

OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties*
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&upgrade_task_ignore_list, pJson["upgradeTaskIgnoreList"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
}

QString
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::asJsonObject() {
    QJsonObject obj;
    if((upgrade_task_ignore_list != nullptr) && (upgrade_task_ignore_list->isSet())){
        toJsonValue(QString("upgradeTaskIgnoreList"), upgrade_task_ignore_list, obj, QString("OAIConfigNodePropertyArray"));
    }

    return obj;
}

OAIConfigNodePropertyArray*
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::getUpgradeTaskIgnoreList() {
    return upgrade_task_ignore_list;
}
void
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::setUpgradeTaskIgnoreList(OAIConfigNodePropertyArray* upgrade_task_ignore_list) {
    this->upgrade_task_ignore_list = upgrade_task_ignore_list;
    this->m_upgrade_task_ignore_list_isSet = true;
}


bool
OAIComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(upgrade_task_ignore_list != nullptr && upgrade_task_ignore_list->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
