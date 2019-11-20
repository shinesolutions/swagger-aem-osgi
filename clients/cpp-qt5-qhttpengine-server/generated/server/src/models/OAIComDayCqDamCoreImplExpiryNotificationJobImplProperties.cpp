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


#include "OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties() {
    this->init();
}

OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::~OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties() {
    
}

void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::init() {
    m_cq_dam_expiry_notification_scheduler_istimebased_isSet = false;
    m_cq_dam_expiry_notification_scheduler_timebased_rule_isSet = false;
    m_cq_dam_expiry_notification_scheduler_period_rule_isSet = false;
    m_send_email_isSet = false;
    m_asset_expired_limit_isSet = false;
    m_prior_notification_seconds_isSet = false;
    m_cq_dam_expiry_notification_url_protocol_isSet = false;
}

void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(cq_dam_expiry_notification_scheduler_istimebased, json[QString("cq.dam.expiry.notification.scheduler.istimebased")]);
    
    ::OpenAPI::fromJsonValue(cq_dam_expiry_notification_scheduler_timebased_rule, json[QString("cq.dam.expiry.notification.scheduler.timebased.rule")]);
    
    ::OpenAPI::fromJsonValue(cq_dam_expiry_notification_scheduler_period_rule, json[QString("cq.dam.expiry.notification.scheduler.period.rule")]);
    
    ::OpenAPI::fromJsonValue(send_email, json[QString("send_email")]);
    
    ::OpenAPI::fromJsonValue(asset_expired_limit, json[QString("asset_expired_limit")]);
    
    ::OpenAPI::fromJsonValue(prior_notification_seconds, json[QString("prior_notification_seconds")]);
    
    ::OpenAPI::fromJsonValue(cq_dam_expiry_notification_url_protocol, json[QString("cq.dam.expiry.notification.url.protocol")]);
    
}

QString
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::asJsonObject() const {
    QJsonObject obj;
	if(cq_dam_expiry_notification_scheduler_istimebased.isSet()){
        obj.insert(QString("cq.dam.expiry.notification.scheduler.istimebased"), ::OpenAPI::toJsonValue(cq_dam_expiry_notification_scheduler_istimebased));
    }
	if(cq_dam_expiry_notification_scheduler_timebased_rule.isSet()){
        obj.insert(QString("cq.dam.expiry.notification.scheduler.timebased.rule"), ::OpenAPI::toJsonValue(cq_dam_expiry_notification_scheduler_timebased_rule));
    }
	if(cq_dam_expiry_notification_scheduler_period_rule.isSet()){
        obj.insert(QString("cq.dam.expiry.notification.scheduler.period.rule"), ::OpenAPI::toJsonValue(cq_dam_expiry_notification_scheduler_period_rule));
    }
	if(send_email.isSet()){
        obj.insert(QString("send_email"), ::OpenAPI::toJsonValue(send_email));
    }
	if(asset_expired_limit.isSet()){
        obj.insert(QString("asset_expired_limit"), ::OpenAPI::toJsonValue(asset_expired_limit));
    }
	if(prior_notification_seconds.isSet()){
        obj.insert(QString("prior_notification_seconds"), ::OpenAPI::toJsonValue(prior_notification_seconds));
    }
	if(cq_dam_expiry_notification_url_protocol.isSet()){
        obj.insert(QString("cq.dam.expiry.notification.url.protocol"), ::OpenAPI::toJsonValue(cq_dam_expiry_notification_url_protocol));
    }
    return obj;
}

OAIConfigNodePropertyBoolean
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqDamExpiryNotificationSchedulerIstimebased() const {
    return cq_dam_expiry_notification_scheduler_istimebased;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqDamExpiryNotificationSchedulerIstimebased(const OAIConfigNodePropertyBoolean &cq_dam_expiry_notification_scheduler_istimebased) {
    this->cq_dam_expiry_notification_scheduler_istimebased = cq_dam_expiry_notification_scheduler_istimebased;
    this->m_cq_dam_expiry_notification_scheduler_istimebased_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqDamExpiryNotificationSchedulerTimebasedRule() const {
    return cq_dam_expiry_notification_scheduler_timebased_rule;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqDamExpiryNotificationSchedulerTimebasedRule(const OAIConfigNodePropertyString &cq_dam_expiry_notification_scheduler_timebased_rule) {
    this->cq_dam_expiry_notification_scheduler_timebased_rule = cq_dam_expiry_notification_scheduler_timebased_rule;
    this->m_cq_dam_expiry_notification_scheduler_timebased_rule_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqDamExpiryNotificationSchedulerPeriodRule() const {
    return cq_dam_expiry_notification_scheduler_period_rule;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqDamExpiryNotificationSchedulerPeriodRule(const OAIConfigNodePropertyInteger &cq_dam_expiry_notification_scheduler_period_rule) {
    this->cq_dam_expiry_notification_scheduler_period_rule = cq_dam_expiry_notification_scheduler_period_rule;
    this->m_cq_dam_expiry_notification_scheduler_period_rule_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getSendEmail() const {
    return send_email;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setSendEmail(const OAIConfigNodePropertyBoolean &send_email) {
    this->send_email = send_email;
    this->m_send_email_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getAssetExpiredLimit() const {
    return asset_expired_limit;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setAssetExpiredLimit(const OAIConfigNodePropertyInteger &asset_expired_limit) {
    this->asset_expired_limit = asset_expired_limit;
    this->m_asset_expired_limit_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getPriorNotificationSeconds() const {
    return prior_notification_seconds;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setPriorNotificationSeconds(const OAIConfigNodePropertyInteger &prior_notification_seconds) {
    this->prior_notification_seconds = prior_notification_seconds;
    this->m_prior_notification_seconds_isSet = true;
}

OAIConfigNodePropertyString
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqDamExpiryNotificationUrlProtocol() const {
    return cq_dam_expiry_notification_url_protocol;
}
void
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqDamExpiryNotificationUrlProtocol(const OAIConfigNodePropertyString &cq_dam_expiry_notification_url_protocol) {
    this->cq_dam_expiry_notification_url_protocol = cq_dam_expiry_notification_url_protocol;
    this->m_cq_dam_expiry_notification_url_protocol_isSet = true;
}


bool
OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(cq_dam_expiry_notification_scheduler_istimebased.isSet()){ isObjectUpdated = true; break;}
    
        if(cq_dam_expiry_notification_scheduler_timebased_rule.isSet()){ isObjectUpdated = true; break;}
    
        if(cq_dam_expiry_notification_scheduler_period_rule.isSet()){ isObjectUpdated = true; break;}
    
        if(send_email.isSet()){ isObjectUpdated = true; break;}
    
        if(asset_expired_limit.isSet()){ isObjectUpdated = true; break;}
    
        if(prior_notification_seconds.isSet()){ isObjectUpdated = true; break;}
    
        if(cq_dam_expiry_notification_url_protocol.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
