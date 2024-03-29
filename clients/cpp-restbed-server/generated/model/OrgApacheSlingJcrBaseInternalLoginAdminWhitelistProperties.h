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
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_
#define OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_



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
class  OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
{
public:
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();
    virtual ~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getWhitelistBypass() const;
    void setWhitelistBypass(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getWhitelistBundlesRegexp() const;
    void setWhitelistBundlesRegexp(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Whitelist_bypass;
    std::shared_ptr<ConfigNodePropertyString> m_Whitelist_bundles_regexp;
};

}
}
}
}

#endif /* OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_ */
