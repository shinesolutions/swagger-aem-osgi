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
 * ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_
#define ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
    : public ModelBase
{
public:
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();
    virtual ~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getLargeIndexCriticalThreshold() const;
    void setLargeIndexCriticalThreshold(ConfigNodePropertyInteger const& value);
    bool largeIndexCriticalThresholdIsSet() const;
    void unsetLarge_index_critical_threshold();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getLargeIndexWarnThreshold() const;
    void setLargeIndexWarnThreshold(ConfigNodePropertyInteger const& value);
    bool largeIndexWarnThresholdIsSet() const;
    void unsetLarge_index_warn_threshold();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getHcTags() const;
    void setHcTags(ConfigNodePropertyArray const& value);
    bool hcTagsIsSet() const;
    void unsetHc_tags();

protected:
    ConfigNodePropertyInteger m_Large_index_critical_threshold;
    bool m_Large_index_critical_thresholdIsSet;
    ConfigNodePropertyInteger m_Large_index_warn_threshold;
    bool m_Large_index_warn_thresholdIsSet;
    ConfigNodePropertyArray m_Hc_tags;
    bool m_Hc_tagsIsSet;
};

}
}
}
}

#endif /* ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_ */