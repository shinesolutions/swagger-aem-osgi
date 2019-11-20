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
 * ComDayCqReportingImplCacheCacheImplProperties.h
 *
 * 
 */

#ifndef ComDayCqReportingImplCacheCacheImplProperties_H_
#define ComDayCqReportingImplCacheCacheImplProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqReportingImplCacheCacheImplProperties
{
public:
    ComDayCqReportingImplCacheCacheImplProperties();
    virtual ~ComDayCqReportingImplCacheCacheImplProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqReportingImplCacheCacheImplProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getRepcacheEnable() const;
    void setRepcacheEnable(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getRepcacheTtl() const;
    void setRepcacheTtl(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getRepcacheMax() const;
    void setRepcacheMax(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Repcache_enable;
    std::shared_ptr<ConfigNodePropertyInteger> m_Repcache_ttl;
    std::shared_ptr<ConfigNodePropertyInteger> m_Repcache_max;
};

}
}
}
}

#endif /* ComDayCqReportingImplCacheCacheImplProperties_H_ */