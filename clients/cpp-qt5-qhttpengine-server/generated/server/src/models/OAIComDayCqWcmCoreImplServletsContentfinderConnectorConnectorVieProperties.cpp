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


#include "OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties() {
    this->init();
}

OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::~OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties() {
    
}

void
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::init() {
    m_item_resource_types_isSet = false;
}

void
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(item_resource_types, json[QString("item.resource.types")]);
    
}

QString
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::asJsonObject() const {
    QJsonObject obj;
	if(item_resource_types.isSet()){
        obj.insert(QString("item.resource.types"), ::OpenAPI::toJsonValue(item_resource_types));
    }
    return obj;
}

OAIConfigNodePropertyArray
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::getItemResourceTypes() const {
    return item_resource_types;
}
void
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::setItemResourceTypes(const OAIConfigNodePropertyArray &item_resource_types) {
    this->item_resource_types = item_resource_types;
    this->m_item_resource_types_isSet = true;
}


bool
OAIComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(item_resource_types.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
