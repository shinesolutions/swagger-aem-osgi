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
 * ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.h
 *
 * 
 */

#ifndef ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_
#define ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
{
public:
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();
    virtual ~ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSchedulerExpression() const;
    void setSchedulerExpression(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getSchedulerConcurrent() const;
    void setSchedulerConcurrent(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Scheduler_expression;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Scheduler_concurrent;
};

}
}
}
}

#endif /* ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_ */