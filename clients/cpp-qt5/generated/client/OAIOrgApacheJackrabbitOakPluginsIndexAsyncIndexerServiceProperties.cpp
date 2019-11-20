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


#include "OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties() {
    init();
}

OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::~OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties() {
    this->cleanup();
}

void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::init() {
    async_configs = new OAIConfigNodePropertyArray();
    m_async_configs_isSet = false;
    lease_time_out_minutes = new OAIConfigNodePropertyInteger();
    m_lease_time_out_minutes_isSet = false;
    failing_index_timeout_seconds = new OAIConfigNodePropertyInteger();
    m_failing_index_timeout_seconds_isSet = false;
    error_warn_interval_seconds = new OAIConfigNodePropertyInteger();
    m_error_warn_interval_seconds_isSet = false;
}

void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::cleanup() {
    if(async_configs != nullptr) { 
        delete async_configs;
    }
    if(lease_time_out_minutes != nullptr) { 
        delete lease_time_out_minutes;
    }
    if(failing_index_timeout_seconds != nullptr) { 
        delete failing_index_timeout_seconds;
    }
    if(error_warn_interval_seconds != nullptr) { 
        delete error_warn_interval_seconds;
    }
}

OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties*
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&async_configs, pJson["asyncConfigs"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&lease_time_out_minutes, pJson["leaseTimeOutMinutes"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&failing_index_timeout_seconds, pJson["failingIndexTimeoutSeconds"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&error_warn_interval_seconds, pJson["errorWarnIntervalSeconds"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
}

QString
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::asJsonObject() {
    QJsonObject obj;
    if((async_configs != nullptr) && (async_configs->isSet())){
        toJsonValue(QString("asyncConfigs"), async_configs, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((lease_time_out_minutes != nullptr) && (lease_time_out_minutes->isSet())){
        toJsonValue(QString("leaseTimeOutMinutes"), lease_time_out_minutes, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((failing_index_timeout_seconds != nullptr) && (failing_index_timeout_seconds->isSet())){
        toJsonValue(QString("failingIndexTimeoutSeconds"), failing_index_timeout_seconds, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((error_warn_interval_seconds != nullptr) && (error_warn_interval_seconds->isSet())){
        toJsonValue(QString("errorWarnIntervalSeconds"), error_warn_interval_seconds, obj, QString("OAIConfigNodePropertyInteger"));
    }

    return obj;
}

OAIConfigNodePropertyArray*
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getAsyncConfigs() {
    return async_configs;
}
void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setAsyncConfigs(OAIConfigNodePropertyArray* async_configs) {
    this->async_configs = async_configs;
    this->m_async_configs_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getLeaseTimeOutMinutes() {
    return lease_time_out_minutes;
}
void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setLeaseTimeOutMinutes(OAIConfigNodePropertyInteger* lease_time_out_minutes) {
    this->lease_time_out_minutes = lease_time_out_minutes;
    this->m_lease_time_out_minutes_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getFailingIndexTimeoutSeconds() {
    return failing_index_timeout_seconds;
}
void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setFailingIndexTimeoutSeconds(OAIConfigNodePropertyInteger* failing_index_timeout_seconds) {
    this->failing_index_timeout_seconds = failing_index_timeout_seconds;
    this->m_failing_index_timeout_seconds_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getErrorWarnIntervalSeconds() {
    return error_warn_interval_seconds;
}
void
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setErrorWarnIntervalSeconds(OAIConfigNodePropertyInteger* error_warn_interval_seconds) {
    this->error_warn_interval_seconds = error_warn_interval_seconds;
    this->m_error_warn_interval_seconds_isSet = true;
}


bool
OAIOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(async_configs != nullptr && async_configs->isSet()){ isObjectUpdated = true; break;}
        if(lease_time_out_minutes != nullptr && lease_time_out_minutes->isSet()){ isObjectUpdated = true; break;}
        if(failing_index_timeout_seconds != nullptr && failing_index_timeout_seconds->isSet()){ isObjectUpdated = true; break;}
        if(error_warn_interval_seconds != nullptr && error_warn_interval_seconds->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
