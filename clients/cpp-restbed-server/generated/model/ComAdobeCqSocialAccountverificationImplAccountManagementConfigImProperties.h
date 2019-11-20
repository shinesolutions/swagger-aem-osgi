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
 * ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.h
 *
 * 
 */

#ifndef ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_
#define ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_



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
class  ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
{
public:
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();
    virtual ~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getEnable() const;
    void setEnable(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getTtl1() const;
    void setTtl1(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getTtl2() const;
    void setTtl2(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Enable;
    std::shared_ptr<ConfigNodePropertyInteger> m_Ttl1;
    std::shared_ptr<ConfigNodePropertyInteger> m_Ttl2;
};

}
}
}
}

#endif /* ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_ */