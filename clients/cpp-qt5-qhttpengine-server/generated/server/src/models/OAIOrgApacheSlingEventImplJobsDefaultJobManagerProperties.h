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

/*
 * OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties_H
#define OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyDropDown.h"
#include "OAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties: public OAIObject {
public:
    OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties();
    OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties(QString json);
    ~OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyDropDown getQueuePriority() const;
    void setQueuePriority(const OAIConfigNodePropertyDropDown &queue_priority);

    OAIConfigNodePropertyInteger getQueueRetries() const;
    void setQueueRetries(const OAIConfigNodePropertyInteger &queue_retries);

    OAIConfigNodePropertyInteger getQueueRetrydelay() const;
    void setQueueRetrydelay(const OAIConfigNodePropertyInteger &queue_retrydelay);

    OAIConfigNodePropertyInteger getQueueMaxparallel() const;
    void setQueueMaxparallel(const OAIConfigNodePropertyInteger &queue_maxparallel);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyDropDown queue_priority;
    bool m_queue_priority_isSet;

    OAIConfigNodePropertyInteger queue_retries;
    bool m_queue_retries_isSet;

    OAIConfigNodePropertyInteger queue_retrydelay;
    bool m_queue_retrydelay_isSet;

    OAIConfigNodePropertyInteger queue_maxparallel;
    bool m_queue_maxparallel_isSet;

};

}

#endif // OAIOrgApacheSlingEventImplJobsDefaultJobManagerProperties_H