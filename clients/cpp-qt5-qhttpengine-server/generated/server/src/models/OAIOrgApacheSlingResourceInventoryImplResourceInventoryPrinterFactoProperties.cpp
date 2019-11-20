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


#include "OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties() {
    this->init();
}

OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::~OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties() {
    
}

void
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::init() {
    m_felix_inventory_printer_name_isSet = false;
    m_felix_inventory_printer_title_isSet = false;
    m_path_isSet = false;
}

void
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(felix_inventory_printer_name, json[QString("felix.inventory.printer.name")]);
    
    ::OpenAPI::fromJsonValue(felix_inventory_printer_title, json[QString("felix.inventory.printer.title")]);
    
    ::OpenAPI::fromJsonValue(path, json[QString("path")]);
    
}

QString
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::asJsonObject() const {
    QJsonObject obj;
	if(felix_inventory_printer_name.isSet()){
        obj.insert(QString("felix.inventory.printer.name"), ::OpenAPI::toJsonValue(felix_inventory_printer_name));
    }
	if(felix_inventory_printer_title.isSet()){
        obj.insert(QString("felix.inventory.printer.title"), ::OpenAPI::toJsonValue(felix_inventory_printer_title));
    }
	if(path.isSet()){
        obj.insert(QString("path"), ::OpenAPI::toJsonValue(path));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getFelixInventoryPrinterName() const {
    return felix_inventory_printer_name;
}
void
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setFelixInventoryPrinterName(const OAIConfigNodePropertyString &felix_inventory_printer_name) {
    this->felix_inventory_printer_name = felix_inventory_printer_name;
    this->m_felix_inventory_printer_name_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getFelixInventoryPrinterTitle() const {
    return felix_inventory_printer_title;
}
void
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setFelixInventoryPrinterTitle(const OAIConfigNodePropertyString &felix_inventory_printer_title) {
    this->felix_inventory_printer_title = felix_inventory_printer_title;
    this->m_felix_inventory_printer_title_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getPath() const {
    return path;
}
void
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setPath(const OAIConfigNodePropertyString &path) {
    this->path = path;
    this->m_path_isSet = true;
}


bool
OAIOrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(felix_inventory_printer_name.isSet()){ isObjectUpdated = true; break;}
    
        if(felix_inventory_printer_title.isSet()){ isObjectUpdated = true; break;}
    
        if(path.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
