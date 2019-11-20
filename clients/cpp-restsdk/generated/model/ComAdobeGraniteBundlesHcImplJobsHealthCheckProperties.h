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
 * ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
    : public ModelBase
{
public:
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();
    virtual ~ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getHcTags() const;
    bool hcTagsIsSet() const;
    void unsetHc_tags();
    void setHcTags(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMaxQueuedJobs() const;
    bool maxQueuedJobsIsSet() const;
    void unsetMax_queued_jobs();
    void setMaxQueuedJobs(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Hc_tags;
    bool m_Hc_tagsIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Max_queued_jobs;
    bool m_Max_queued_jobsIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_ */