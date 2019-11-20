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


#include "OAIOrgApacheSlingCommonsLogLogManagerProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingCommonsLogLogManagerProperties::OAIOrgApacheSlingCommonsLogLogManagerProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheSlingCommonsLogLogManagerProperties::OAIOrgApacheSlingCommonsLogLogManagerProperties() {
    this->init();
}

OAIOrgApacheSlingCommonsLogLogManagerProperties::~OAIOrgApacheSlingCommonsLogLogManagerProperties() {
    
}

void
OAIOrgApacheSlingCommonsLogLogManagerProperties::init() {
    m_org_apache_sling_commons_log_level_isSet = false;
    m_org_apache_sling_commons_log_file_isSet = false;
    m_org_apache_sling_commons_log_file_number_isSet = false;
    m_org_apache_sling_commons_log_file_size_isSet = false;
    m_org_apache_sling_commons_log_pattern_isSet = false;
    m_org_apache_sling_commons_log_configuration_file_isSet = false;
    m_org_apache_sling_commons_log_packaging_data_enabled_isSet = false;
    m_org_apache_sling_commons_log_max_caller_data_depth_isSet = false;
    m_org_apache_sling_commons_log_max_old_file_count_in_dump_isSet = false;
    m_org_apache_sling_commons_log_num_of_lines_isSet = false;
}

void
OAIOrgApacheSlingCommonsLogLogManagerProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheSlingCommonsLogLogManagerProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_level, json[QString("org.apache.sling.commons.log.level")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_file, json[QString("org.apache.sling.commons.log.file")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_file_number, json[QString("org.apache.sling.commons.log.file.number")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_file_size, json[QString("org.apache.sling.commons.log.file.size")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_pattern, json[QString("org.apache.sling.commons.log.pattern")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_configuration_file, json[QString("org.apache.sling.commons.log.configurationFile")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_packaging_data_enabled, json[QString("org.apache.sling.commons.log.packagingDataEnabled")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_max_caller_data_depth, json[QString("org.apache.sling.commons.log.maxCallerDataDepth")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_max_old_file_count_in_dump, json[QString("org.apache.sling.commons.log.maxOldFileCountInDump")]);
    
    ::OpenAPI::fromJsonValue(org_apache_sling_commons_log_num_of_lines, json[QString("org.apache.sling.commons.log.numOfLines")]);
    
}

QString
OAIOrgApacheSlingCommonsLogLogManagerProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingCommonsLogLogManagerProperties::asJsonObject() const {
    QJsonObject obj;
	if(org_apache_sling_commons_log_level.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.level"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_level));
    }
	if(org_apache_sling_commons_log_file.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.file"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_file));
    }
	if(org_apache_sling_commons_log_file_number.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.file.number"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_file_number));
    }
	if(org_apache_sling_commons_log_file_size.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.file.size"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_file_size));
    }
	if(org_apache_sling_commons_log_pattern.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.pattern"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_pattern));
    }
	if(org_apache_sling_commons_log_configuration_file.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.configurationFile"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_configuration_file));
    }
	if(org_apache_sling_commons_log_packaging_data_enabled.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.packagingDataEnabled"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_packaging_data_enabled));
    }
	if(org_apache_sling_commons_log_max_caller_data_depth.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.maxCallerDataDepth"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_max_caller_data_depth));
    }
	if(org_apache_sling_commons_log_max_old_file_count_in_dump.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.maxOldFileCountInDump"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_max_old_file_count_in_dump));
    }
	if(org_apache_sling_commons_log_num_of_lines.isSet()){
        obj.insert(QString("org.apache.sling.commons.log.numOfLines"), ::OpenAPI::toJsonValue(org_apache_sling_commons_log_num_of_lines));
    }
    return obj;
}

OAIConfigNodePropertyDropDown
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogLevel() const {
    return org_apache_sling_commons_log_level;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogLevel(const OAIConfigNodePropertyDropDown &org_apache_sling_commons_log_level) {
    this->org_apache_sling_commons_log_level = org_apache_sling_commons_log_level;
    this->m_org_apache_sling_commons_log_level_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogFile() const {
    return org_apache_sling_commons_log_file;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogFile(const OAIConfigNodePropertyString &org_apache_sling_commons_log_file) {
    this->org_apache_sling_commons_log_file = org_apache_sling_commons_log_file;
    this->m_org_apache_sling_commons_log_file_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogFileNumber() const {
    return org_apache_sling_commons_log_file_number;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogFileNumber(const OAIConfigNodePropertyInteger &org_apache_sling_commons_log_file_number) {
    this->org_apache_sling_commons_log_file_number = org_apache_sling_commons_log_file_number;
    this->m_org_apache_sling_commons_log_file_number_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogFileSize() const {
    return org_apache_sling_commons_log_file_size;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogFileSize(const OAIConfigNodePropertyString &org_apache_sling_commons_log_file_size) {
    this->org_apache_sling_commons_log_file_size = org_apache_sling_commons_log_file_size;
    this->m_org_apache_sling_commons_log_file_size_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogPattern() const {
    return org_apache_sling_commons_log_pattern;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogPattern(const OAIConfigNodePropertyString &org_apache_sling_commons_log_pattern) {
    this->org_apache_sling_commons_log_pattern = org_apache_sling_commons_log_pattern;
    this->m_org_apache_sling_commons_log_pattern_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogConfigurationFile() const {
    return org_apache_sling_commons_log_configuration_file;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogConfigurationFile(const OAIConfigNodePropertyString &org_apache_sling_commons_log_configuration_file) {
    this->org_apache_sling_commons_log_configuration_file = org_apache_sling_commons_log_configuration_file;
    this->m_org_apache_sling_commons_log_configuration_file_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogPackagingDataEnabled() const {
    return org_apache_sling_commons_log_packaging_data_enabled;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogPackagingDataEnabled(const OAIConfigNodePropertyBoolean &org_apache_sling_commons_log_packaging_data_enabled) {
    this->org_apache_sling_commons_log_packaging_data_enabled = org_apache_sling_commons_log_packaging_data_enabled;
    this->m_org_apache_sling_commons_log_packaging_data_enabled_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogMaxCallerDataDepth() const {
    return org_apache_sling_commons_log_max_caller_data_depth;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogMaxCallerDataDepth(const OAIConfigNodePropertyInteger &org_apache_sling_commons_log_max_caller_data_depth) {
    this->org_apache_sling_commons_log_max_caller_data_depth = org_apache_sling_commons_log_max_caller_data_depth;
    this->m_org_apache_sling_commons_log_max_caller_data_depth_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogMaxOldFileCountInDump() const {
    return org_apache_sling_commons_log_max_old_file_count_in_dump;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogMaxOldFileCountInDump(const OAIConfigNodePropertyInteger &org_apache_sling_commons_log_max_old_file_count_in_dump) {
    this->org_apache_sling_commons_log_max_old_file_count_in_dump = org_apache_sling_commons_log_max_old_file_count_in_dump;
    this->m_org_apache_sling_commons_log_max_old_file_count_in_dump_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogNumOfLines() const {
    return org_apache_sling_commons_log_num_of_lines;
}
void
OAIOrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogNumOfLines(const OAIConfigNodePropertyInteger &org_apache_sling_commons_log_num_of_lines) {
    this->org_apache_sling_commons_log_num_of_lines = org_apache_sling_commons_log_num_of_lines;
    this->m_org_apache_sling_commons_log_num_of_lines_isSet = true;
}


bool
OAIOrgApacheSlingCommonsLogLogManagerProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(org_apache_sling_commons_log_level.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_file.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_file_number.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_file_size.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_pattern.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_configuration_file.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_packaging_data_enabled.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_max_caller_data_depth.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_max_old_file_count_in_dump.isSet()){ isObjectUpdated = true; break;}
    
        if(org_apache_sling_commons_log_num_of_lines.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
