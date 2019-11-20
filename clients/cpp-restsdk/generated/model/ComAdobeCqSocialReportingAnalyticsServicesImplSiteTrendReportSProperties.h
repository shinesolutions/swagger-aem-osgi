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
 * ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_


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
class  ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();
    virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCqSocialConsoleAnalyticsSitesMapping() const;
    bool cqSocialConsoleAnalyticsSitesMappingIsSet() const;
    void unsetCq_social_console_analytics_sites_mapping();
    void setCqSocialConsoleAnalyticsSitesMapping(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getPriority() const;
    bool priorityIsSet() const;
    void unsetPriority();
    void setPriority(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Cq_social_console_analytics_sites_mapping;
    bool m_Cq_social_console_analytics_sites_mappingIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Priority;
    bool m_PriorityIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_ */