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


#include "OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties() {
    this->init();
}

OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::~OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties() {
    
}

void
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::init() {
    m_threshold_isSet = false;
    m_job_topic_name_isSet = false;
    m_email_enabled_isSet = false;
}

void
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(threshold, json[QString("threshold")]);
    
    ::OpenAPI::fromJsonValue(job_topic_name, json[QString("jobTopicName")]);
    
    ::OpenAPI::fromJsonValue(email_enabled, json[QString("emailEnabled")]);
    
}

QString
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::asJsonObject() const {
    QJsonObject obj;
	if(threshold.isSet()){
        obj.insert(QString("threshold"), ::OpenAPI::toJsonValue(threshold));
    }
	if(job_topic_name.isSet()){
        obj.insert(QString("jobTopicName"), ::OpenAPI::toJsonValue(job_topic_name));
    }
	if(email_enabled.isSet()){
        obj.insert(QString("emailEnabled"), ::OpenAPI::toJsonValue(email_enabled));
    }
    return obj;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::getThreshold() const {
    return threshold;
}
void
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::setThreshold(const OAIConfigNodePropertyInteger &threshold) {
    this->threshold = threshold;
    this->m_threshold_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::getJobTopicName() const {
    return job_topic_name;
}
void
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::setJobTopicName(const OAIConfigNodePropertyString &job_topic_name) {
    this->job_topic_name = job_topic_name;
    this->m_job_topic_name_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::getEmailEnabled() const {
    return email_enabled;
}
void
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::setEmailEnabled(const OAIConfigNodePropertyBoolean &email_enabled) {
    this->email_enabled = email_enabled;
    this->m_email_enabled_isSet = true;
}


bool
OAIComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(threshold.isSet()){ isObjectUpdated = true; break;}
    
        if(job_topic_name.isSet()){ isObjectUpdated = true; break;}
    
        if(email_enabled.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
