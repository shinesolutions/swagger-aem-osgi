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
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_
#define OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
    : public ModelBase
{
public:
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();
    virtual ~OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getPoolName() const;
    void setPoolName(ConfigNodePropertyString const& value);
    bool poolNameIsSet() const;
    void unsetPoolName();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getAllowedPoolNames() const;
    void setAllowedPoolNames(ConfigNodePropertyArray const& value);
    bool allowedPoolNamesIsSet() const;
    void unsetAllowedPoolNames();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() const;
    void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean const& value);
    bool schedulerUseleaderforsingleIsSet() const;
    void unsetScheduler_useleaderforsingle();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getMetricsFilters() const;
    void setMetricsFilters(ConfigNodePropertyArray const& value);
    bool metricsFiltersIsSet() const;
    void unsetMetrics_filters();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getSlowThresholdMillis() const;
    void setSlowThresholdMillis(ConfigNodePropertyInteger const& value);
    bool slowThresholdMillisIsSet() const;
    void unsetSlowThresholdMillis();

protected:
    ConfigNodePropertyString m_PoolName;
    bool m_PoolNameIsSet;
    ConfigNodePropertyArray m_AllowedPoolNames;
    bool m_AllowedPoolNamesIsSet;
    ConfigNodePropertyBoolean m_Scheduler_useleaderforsingle;
    bool m_Scheduler_useleaderforsingleIsSet;
    ConfigNodePropertyArray m_Metrics_filters;
    bool m_Metrics_filtersIsSet;
    ConfigNodePropertyInteger m_SlowThresholdMillis;
    bool m_SlowThresholdMillisIsSet;
};

}
}
}
}

#endif /* OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_ */