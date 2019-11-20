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


#include "OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties() {
    init();
}

OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::~OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties() {
    this->cleanup();
}

void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::init() {
    scheduler_period = new OAIConfigNodePropertyInteger();
    m_scheduler_period_isSet = false;
    scheduler_concurrent = new OAIConfigNodePropertyBoolean();
    m_scheduler_concurrent_isSet = false;
    service_bad_link_tolerance_interval = new OAIConfigNodePropertyInteger();
    m_service_bad_link_tolerance_interval_isSet = false;
    service_check_override_patterns = new OAIConfigNodePropertyArray();
    m_service_check_override_patterns_isSet = false;
    service_cache_broken_internal_links = new OAIConfigNodePropertyBoolean();
    m_service_cache_broken_internal_links_isSet = false;
    service_special_link_prefix = new OAIConfigNodePropertyArray();
    m_service_special_link_prefix_isSet = false;
    service_special_link_patterns = new OAIConfigNodePropertyArray();
    m_service_special_link_patterns_isSet = false;
}

void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::cleanup() {
    if(scheduler_period != nullptr) { 
        delete scheduler_period;
    }
    if(scheduler_concurrent != nullptr) { 
        delete scheduler_concurrent;
    }
    if(service_bad_link_tolerance_interval != nullptr) { 
        delete service_bad_link_tolerance_interval;
    }
    if(service_check_override_patterns != nullptr) { 
        delete service_check_override_patterns;
    }
    if(service_cache_broken_internal_links != nullptr) { 
        delete service_cache_broken_internal_links;
    }
    if(service_special_link_prefix != nullptr) { 
        delete service_special_link_prefix;
    }
    if(service_special_link_patterns != nullptr) { 
        delete service_special_link_patterns;
    }
}

OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&scheduler_period, pJson["scheduler.period"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&scheduler_concurrent, pJson["scheduler.concurrent"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&service_bad_link_tolerance_interval, pJson["service.bad_link_tolerance_interval"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&service_check_override_patterns, pJson["service.check_override_patterns"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&service_cache_broken_internal_links, pJson["service.cache_broken_internal_links"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&service_special_link_prefix, pJson["service.special_link_prefix"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&service_special_link_patterns, pJson["service.special_link_patterns"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
}

QString
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::asJsonObject() {
    QJsonObject obj;
    if((scheduler_period != nullptr) && (scheduler_period->isSet())){
        toJsonValue(QString("scheduler.period"), scheduler_period, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((scheduler_concurrent != nullptr) && (scheduler_concurrent->isSet())){
        toJsonValue(QString("scheduler.concurrent"), scheduler_concurrent, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((service_bad_link_tolerance_interval != nullptr) && (service_bad_link_tolerance_interval->isSet())){
        toJsonValue(QString("service.bad_link_tolerance_interval"), service_bad_link_tolerance_interval, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((service_check_override_patterns != nullptr) && (service_check_override_patterns->isSet())){
        toJsonValue(QString("service.check_override_patterns"), service_check_override_patterns, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((service_cache_broken_internal_links != nullptr) && (service_cache_broken_internal_links->isSet())){
        toJsonValue(QString("service.cache_broken_internal_links"), service_cache_broken_internal_links, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((service_special_link_prefix != nullptr) && (service_special_link_prefix->isSet())){
        toJsonValue(QString("service.special_link_prefix"), service_special_link_prefix, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((service_special_link_patterns != nullptr) && (service_special_link_patterns->isSet())){
        toJsonValue(QString("service.special_link_patterns"), service_special_link_patterns, obj, QString("OAIConfigNodePropertyArray"));
    }

    return obj;
}

OAIConfigNodePropertyInteger*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getSchedulerPeriod() {
    return scheduler_period;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setSchedulerPeriod(OAIConfigNodePropertyInteger* scheduler_period) {
    this->scheduler_period = scheduler_period;
    this->m_scheduler_period_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getSchedulerConcurrent() {
    return scheduler_concurrent;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setSchedulerConcurrent(OAIConfigNodePropertyBoolean* scheduler_concurrent) {
    this->scheduler_concurrent = scheduler_concurrent;
    this->m_scheduler_concurrent_isSet = true;
}

OAIConfigNodePropertyInteger*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServiceBadLinkToleranceInterval() {
    return service_bad_link_tolerance_interval;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServiceBadLinkToleranceInterval(OAIConfigNodePropertyInteger* service_bad_link_tolerance_interval) {
    this->service_bad_link_tolerance_interval = service_bad_link_tolerance_interval;
    this->m_service_bad_link_tolerance_interval_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServiceCheckOverridePatterns() {
    return service_check_override_patterns;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServiceCheckOverridePatterns(OAIConfigNodePropertyArray* service_check_override_patterns) {
    this->service_check_override_patterns = service_check_override_patterns;
    this->m_service_check_override_patterns_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServiceCacheBrokenInternalLinks() {
    return service_cache_broken_internal_links;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServiceCacheBrokenInternalLinks(OAIConfigNodePropertyBoolean* service_cache_broken_internal_links) {
    this->service_cache_broken_internal_links = service_cache_broken_internal_links;
    this->m_service_cache_broken_internal_links_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServiceSpecialLinkPrefix() {
    return service_special_link_prefix;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServiceSpecialLinkPrefix(OAIConfigNodePropertyArray* service_special_link_prefix) {
    this->service_special_link_prefix = service_special_link_prefix;
    this->m_service_special_link_prefix_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServiceSpecialLinkPatterns() {
    return service_special_link_patterns;
}
void
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServiceSpecialLinkPatterns(OAIConfigNodePropertyArray* service_special_link_patterns) {
    this->service_special_link_patterns = service_special_link_patterns;
    this->m_service_special_link_patterns_isSet = true;
}


bool
OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(scheduler_period != nullptr && scheduler_period->isSet()){ isObjectUpdated = true; break;}
        if(scheduler_concurrent != nullptr && scheduler_concurrent->isSet()){ isObjectUpdated = true; break;}
        if(service_bad_link_tolerance_interval != nullptr && service_bad_link_tolerance_interval->isSet()){ isObjectUpdated = true; break;}
        if(service_check_override_patterns != nullptr && service_check_override_patterns->isSet()){ isObjectUpdated = true; break;}
        if(service_cache_broken_internal_links != nullptr && service_cache_broken_internal_links->isSet()){ isObjectUpdated = true; break;}
        if(service_special_link_prefix != nullptr && service_special_link_prefix->isSet()){ isObjectUpdated = true; break;}
        if(service_special_link_patterns != nullptr && service_special_link_patterns->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
