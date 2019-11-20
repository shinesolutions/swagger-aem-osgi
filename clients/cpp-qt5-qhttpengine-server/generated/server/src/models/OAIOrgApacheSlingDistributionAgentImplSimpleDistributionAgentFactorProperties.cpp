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


#include "OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties() {
    this->init();
}

OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::~OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties() {
    
}

void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::init() {
    m_name_isSet = false;
    m_title_isSet = false;
    m_details_isSet = false;
    m_enabled_isSet = false;
    m_service_name_isSet = false;
    m_log_level_isSet = false;
    m_queue_processing_enabled_isSet = false;
    m_package_exporter_target_isSet = false;
    m_package_importer_target_isSet = false;
    m_request_authorization_strategy_target_isSet = false;
    m_triggers_target_isSet = false;
}

void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    
    ::OpenAPI::fromJsonValue(details, json[QString("details")]);
    
    ::OpenAPI::fromJsonValue(enabled, json[QString("enabled")]);
    
    ::OpenAPI::fromJsonValue(service_name, json[QString("serviceName")]);
    
    ::OpenAPI::fromJsonValue(log_level, json[QString("log.level")]);
    
    ::OpenAPI::fromJsonValue(queue_processing_enabled, json[QString("queue.processing.enabled")]);
    
    ::OpenAPI::fromJsonValue(package_exporter_target, json[QString("packageExporter.target")]);
    
    ::OpenAPI::fromJsonValue(package_importer_target, json[QString("packageImporter.target")]);
    
    ::OpenAPI::fromJsonValue(request_authorization_strategy_target, json[QString("requestAuthorizationStrategy.target")]);
    
    ::OpenAPI::fromJsonValue(triggers_target, json[QString("triggers.target")]);
    
}

QString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::asJsonObject() const {
    QJsonObject obj;
	if(name.isSet()){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(title.isSet()){
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
	if(details.isSet()){
        obj.insert(QString("details"), ::OpenAPI::toJsonValue(details));
    }
	if(enabled.isSet()){
        obj.insert(QString("enabled"), ::OpenAPI::toJsonValue(enabled));
    }
	if(service_name.isSet()){
        obj.insert(QString("serviceName"), ::OpenAPI::toJsonValue(service_name));
    }
	if(log_level.isSet()){
        obj.insert(QString("log.level"), ::OpenAPI::toJsonValue(log_level));
    }
	if(queue_processing_enabled.isSet()){
        obj.insert(QString("queue.processing.enabled"), ::OpenAPI::toJsonValue(queue_processing_enabled));
    }
	if(package_exporter_target.isSet()){
        obj.insert(QString("packageExporter.target"), ::OpenAPI::toJsonValue(package_exporter_target));
    }
	if(package_importer_target.isSet()){
        obj.insert(QString("packageImporter.target"), ::OpenAPI::toJsonValue(package_importer_target));
    }
	if(request_authorization_strategy_target.isSet()){
        obj.insert(QString("requestAuthorizationStrategy.target"), ::OpenAPI::toJsonValue(request_authorization_strategy_target));
    }
	if(triggers_target.isSet()){
        obj.insert(QString("triggers.target"), ::OpenAPI::toJsonValue(triggers_target));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getName() const {
    return name;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setName(const OAIConfigNodePropertyString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getTitle() const {
    return title;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setTitle(const OAIConfigNodePropertyString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getDetails() const {
    return details;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setDetails(const OAIConfigNodePropertyString &details) {
    this->details = details;
    this->m_details_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getEnabled() const {
    return enabled;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setEnabled(const OAIConfigNodePropertyBoolean &enabled) {
    this->enabled = enabled;
    this->m_enabled_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getServiceName() const {
    return service_name;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setServiceName(const OAIConfigNodePropertyString &service_name) {
    this->service_name = service_name;
    this->m_service_name_isSet = true;
}

OAIConfigNodePropertyDropDown
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getLogLevel() const {
    return log_level;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setLogLevel(const OAIConfigNodePropertyDropDown &log_level) {
    this->log_level = log_level;
    this->m_log_level_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getQueueProcessingEnabled() const {
    return queue_processing_enabled;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setQueueProcessingEnabled(const OAIConfigNodePropertyBoolean &queue_processing_enabled) {
    this->queue_processing_enabled = queue_processing_enabled;
    this->m_queue_processing_enabled_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getPackageExporterTarget() const {
    return package_exporter_target;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setPackageExporterTarget(const OAIConfigNodePropertyString &package_exporter_target) {
    this->package_exporter_target = package_exporter_target;
    this->m_package_exporter_target_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getPackageImporterTarget() const {
    return package_importer_target;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setPackageImporterTarget(const OAIConfigNodePropertyString &package_importer_target) {
    this->package_importer_target = package_importer_target;
    this->m_package_importer_target_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getRequestAuthorizationStrategyTarget() const {
    return request_authorization_strategy_target;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setRequestAuthorizationStrategyTarget(const OAIConfigNodePropertyString &request_authorization_strategy_target) {
    this->request_authorization_strategy_target = request_authorization_strategy_target;
    this->m_request_authorization_strategy_target_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getTriggersTarget() const {
    return triggers_target;
}
void
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setTriggersTarget(const OAIConfigNodePropertyString &triggers_target) {
    this->triggers_target = triggers_target;
    this->m_triggers_target_isSet = true;
}


bool
OAIOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(name.isSet()){ isObjectUpdated = true; break;}
    
        if(title.isSet()){ isObjectUpdated = true; break;}
    
        if(details.isSet()){ isObjectUpdated = true; break;}
    
        if(enabled.isSet()){ isObjectUpdated = true; break;}
    
        if(service_name.isSet()){ isObjectUpdated = true; break;}
    
        if(log_level.isSet()){ isObjectUpdated = true; break;}
    
        if(queue_processing_enabled.isSet()){ isObjectUpdated = true; break;}
    
        if(package_exporter_target.isSet()){ isObjectUpdated = true; break;}
    
        if(package_importer_target.isSet()){ isObjectUpdated = true; break;}
    
        if(request_authorization_strategy_target.isSet()){ isObjectUpdated = true; break;}
    
        if(triggers_target.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
