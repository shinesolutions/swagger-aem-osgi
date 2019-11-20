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
 * OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_
#define OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
{
public:
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties();
    virtual ~OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getEnabled() const;
    void setEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getConfigRefResourceNames() const;
    void setConfigRefResourceNames(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getConfigRefPropertyNames() const;
    void setConfigRefPropertyNames(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getServiceRanking() const;
    void setServiceRanking(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Enabled;
    std::shared_ptr<ConfigNodePropertyArray> m_ConfigRefResourceNames;
    std::shared_ptr<ConfigNodePropertyArray> m_ConfigRefPropertyNames;
    std::shared_ptr<ConfigNodePropertyInteger> m_Service_ranking;
};

}
}
}
}

#endif /* OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_ */