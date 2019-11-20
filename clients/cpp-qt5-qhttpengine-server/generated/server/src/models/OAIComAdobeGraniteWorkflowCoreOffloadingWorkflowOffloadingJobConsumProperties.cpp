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


#include "OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties() {
    this->init();
}

OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::~OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties() {
    
}

void
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::init() {
    m_job_topics_isSet = false;
}

void
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(job_topics, json[QString("job.topics")]);
    
}

QString
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::asJsonObject() const {
    QJsonObject obj;
	if(job_topics.isSet()){
        obj.insert(QString("job.topics"), ::OpenAPI::toJsonValue(job_topics));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::getJobTopics() const {
    return job_topics;
}
void
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::setJobTopics(const OAIConfigNodePropertyString &job_topics) {
    this->job_topics = job_topics;
    this->m_job_topics_isSet = true;
}


bool
OAIComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(job_topics.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
