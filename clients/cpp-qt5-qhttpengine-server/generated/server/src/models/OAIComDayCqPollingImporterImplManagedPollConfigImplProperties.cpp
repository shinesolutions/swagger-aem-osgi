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


#include "OAIComDayCqPollingImporterImplManagedPollConfigImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::OAIComDayCqPollingImporterImplManagedPollConfigImplProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::OAIComDayCqPollingImporterImplManagedPollConfigImplProperties() {
    this->init();
}

OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::~OAIComDayCqPollingImporterImplManagedPollConfigImplProperties() {
    
}

void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::init() {
    m_id_isSet = false;
    m_enabled_isSet = false;
    m_reference_isSet = false;
    m_interval_isSet = false;
    m_expression_isSet = false;
    m_source_isSet = false;
    m_target_isSet = false;
    m_login_isSet = false;
    m_password_isSet = false;
}

void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    ::OpenAPI::fromJsonValue(enabled, json[QString("enabled")]);
    
    ::OpenAPI::fromJsonValue(reference, json[QString("reference")]);
    
    ::OpenAPI::fromJsonValue(interval, json[QString("interval")]);
    
    ::OpenAPI::fromJsonValue(expression, json[QString("expression")]);
    
    ::OpenAPI::fromJsonValue(source, json[QString("source")]);
    
    ::OpenAPI::fromJsonValue(target, json[QString("target")]);
    
    ::OpenAPI::fromJsonValue(login, json[QString("login")]);
    
    ::OpenAPI::fromJsonValue(password, json[QString("password")]);
    
}

QString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(id.isSet()){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(enabled.isSet()){
        obj.insert(QString("enabled"), ::OpenAPI::toJsonValue(enabled));
    }
	if(reference.isSet()){
        obj.insert(QString("reference"), ::OpenAPI::toJsonValue(reference));
    }
	if(interval.isSet()){
        obj.insert(QString("interval"), ::OpenAPI::toJsonValue(interval));
    }
	if(expression.isSet()){
        obj.insert(QString("expression"), ::OpenAPI::toJsonValue(expression));
    }
	if(source.isSet()){
        obj.insert(QString("source"), ::OpenAPI::toJsonValue(source));
    }
	if(target.isSet()){
        obj.insert(QString("target"), ::OpenAPI::toJsonValue(target));
    }
	if(login.isSet()){
        obj.insert(QString("login"), ::OpenAPI::toJsonValue(login));
    }
	if(password.isSet()){
        obj.insert(QString("password"), ::OpenAPI::toJsonValue(password));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getId() const {
    return id;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setId(const OAIConfigNodePropertyString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getEnabled() const {
    return enabled;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setEnabled(const OAIConfigNodePropertyBoolean &enabled) {
    this->enabled = enabled;
    this->m_enabled_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getReference() const {
    return reference;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setReference(const OAIConfigNodePropertyBoolean &reference) {
    this->reference = reference;
    this->m_reference_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getInterval() const {
    return interval;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setInterval(const OAIConfigNodePropertyInteger &interval) {
    this->interval = interval;
    this->m_interval_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getExpression() const {
    return expression;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setExpression(const OAIConfigNodePropertyString &expression) {
    this->expression = expression;
    this->m_expression_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getSource() const {
    return source;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setSource(const OAIConfigNodePropertyString &source) {
    this->source = source;
    this->m_source_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getTarget() const {
    return target;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setTarget(const OAIConfigNodePropertyString &target) {
    this->target = target;
    this->m_target_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getLogin() const {
    return login;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setLogin(const OAIConfigNodePropertyString &login) {
    this->login = login;
    this->m_login_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::getPassword() const {
    return password;
}
void
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::setPassword(const OAIConfigNodePropertyString &password) {
    this->password = password;
    this->m_password_isSet = true;
}


bool
OAIComDayCqPollingImporterImplManagedPollConfigImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(id.isSet()){ isObjectUpdated = true; break;}
    
        if(enabled.isSet()){ isObjectUpdated = true; break;}
    
        if(reference.isSet()){ isObjectUpdated = true; break;}
    
        if(interval.isSet()){ isObjectUpdated = true; break;}
    
        if(expression.isSet()){ isObjectUpdated = true; break;}
    
        if(source.isSet()){ isObjectUpdated = true; break;}
    
        if(target.isSet()){ isObjectUpdated = true; break;}
    
        if(login.isSet()){ isObjectUpdated = true; break;}
    
        if(password.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
