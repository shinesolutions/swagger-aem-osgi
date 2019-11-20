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
 * OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_
#define OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties: public OAIObject {
public:
    OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();
    OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(QString json);
    ~OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getThreadPoolSize();
    void setThreadPoolSize(OAIConfigNodePropertyInteger* thread_pool_size);

    OAIConfigNodePropertyInteger* getDelayTime();
    void setDelayTime(OAIConfigNodePropertyInteger* delay_time);

    OAIConfigNodePropertyInteger* getWorkerSleepTime();
    void setWorkerSleepTime(OAIConfigNodePropertyInteger* worker_sleep_time);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* thread_pool_size;
    bool m_thread_pool_size_isSet;

    OAIConfigNodePropertyInteger* delay_time;
    bool m_delay_time_isSet;

    OAIConfigNodePropertyInteger* worker_sleep_time;
    bool m_worker_sleep_time_isSet;

};

}

#endif /* OAIComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_ */