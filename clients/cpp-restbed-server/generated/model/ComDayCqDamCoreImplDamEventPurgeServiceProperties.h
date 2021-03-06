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
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties.h
 *
 * 
 */

#ifndef ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_
#define ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamCoreImplDamEventPurgeServiceProperties
{
public:
    ComDayCqDamCoreImplDamEventPurgeServiceProperties();
    virtual ~ComDayCqDamCoreImplDamEventPurgeServiceProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqDamCoreImplDamEventPurgeServiceProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSchedulerExpression() const;
    void setSchedulerExpression(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMaxSavedActivities() const;
    void setMaxSavedActivities(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSaveInterval() const;
    void setSaveInterval(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getEnableActivityPurge() const;
    void setEnableActivityPurge(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getEventTypes() const;
    void setEventTypes(std::shared_ptr<ConfigNodePropertyDropDown> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Scheduler_expression;
    std::shared_ptr<ConfigNodePropertyInteger> m_MaxSavedActivities;
    std::shared_ptr<ConfigNodePropertyInteger> m_SaveInterval;
    std::shared_ptr<ConfigNodePropertyBoolean> m_EnableActivityPurge;
    std::shared_ptr<ConfigNodePropertyDropDown> m_EventTypes;
};

}
}
}
}

#endif /* ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_ */
