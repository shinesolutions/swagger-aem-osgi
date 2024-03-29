/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OrgApacheSlingEventImplJobsDefaultJobManagerProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingEventImplJobsDefaultJobManagerProperties
    : public ModelBase
{
public:
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
    virtual ~OrgApacheSlingEventImplJobsDefaultJobManagerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingEventImplJobsDefaultJobManagerProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getQueuePriority() const;
    bool queuePriorityIsSet() const;
    void unsetQueue_priority();
    void setQueuePriority(std::shared_ptr<ConfigNodePropertyDropDown> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getQueueRetries() const;
    bool queueRetriesIsSet() const;
    void unsetQueue_retries();
    void setQueueRetries(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getQueueRetrydelay() const;
    bool queueRetrydelayIsSet() const;
    void unsetQueue_retrydelay();
    void setQueueRetrydelay(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getQueueMaxparallel() const;
    bool queueMaxparallelIsSet() const;
    void unsetQueue_maxparallel();
    void setQueueMaxparallel(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyDropDown> m_Queue_priority;
    bool m_Queue_priorityIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Queue_retries;
    bool m_Queue_retriesIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Queue_retrydelay;
    bool m_Queue_retrydelayIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Queue_maxparallel;
    bool m_Queue_maxparallelIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_ */
