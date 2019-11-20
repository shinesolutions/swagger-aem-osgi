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


#include "OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties() {
    this->init();
}

OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::~OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties() {
    
}

void
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::init() {
    m_max_quartz_job_duration_acceptable_isSet = false;
}

void
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(max_quartz_job_duration_acceptable, json[QString("max.quartzJob.duration.acceptable")]);
    
}

QString
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::asJsonObject() const {
    QJsonObject obj;
	if(max_quartz_job_duration_acceptable.isSet()){
        obj.insert(QString("max.quartzJob.duration.acceptable"), ::OpenAPI::toJsonValue(max_quartz_job_duration_acceptable));
    }
    return obj;
}

OAIConfigNodePropertyInteger
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::getMaxQuartzJobDurationAcceptable() const {
    return max_quartz_job_duration_acceptable;
}
void
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::setMaxQuartzJobDurationAcceptable(const OAIConfigNodePropertyInteger &max_quartz_job_duration_acceptable) {
    this->max_quartz_job_duration_acceptable = max_quartz_job_duration_acceptable;
    this->m_max_quartz_job_duration_acceptable_isSet = true;
}


bool
OAIOrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(max_quartz_job_duration_acceptable.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
