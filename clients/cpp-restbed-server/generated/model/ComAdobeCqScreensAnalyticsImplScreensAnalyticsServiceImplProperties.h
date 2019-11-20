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
 * ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h
 *
 * 
 */

#ifndef ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_
#define ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_



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
class  ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
{
public:
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();
    virtual ~ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getComAdobeCqScreensAnalyticsImplUrl() const;
    void setComAdobeCqScreensAnalyticsImplUrl(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getComAdobeCqScreensAnalyticsImplApikey() const;
    void setComAdobeCqScreensAnalyticsImplApikey(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getComAdobeCqScreensAnalyticsImplProject() const;
    void setComAdobeCqScreensAnalyticsImplProject(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getComAdobeCqScreensAnalyticsImplEnvironment() const;
    void setComAdobeCqScreensAnalyticsImplEnvironment(std::shared_ptr<ConfigNodePropertyDropDown> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getComAdobeCqScreensAnalyticsImplSendFrequency() const;
    void setComAdobeCqScreensAnalyticsImplSendFrequency(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Com_adobe_cq_screens_analytics_impl_url;
    std::shared_ptr<ConfigNodePropertyString> m_Com_adobe_cq_screens_analytics_impl_apikey;
    std::shared_ptr<ConfigNodePropertyString> m_Com_adobe_cq_screens_analytics_impl_project;
    std::shared_ptr<ConfigNodePropertyDropDown> m_Com_adobe_cq_screens_analytics_impl_environment;
    std::shared_ptr<ConfigNodePropertyInteger> m_Com_adobe_cq_screens_analytics_impl_sendFrequency;
};

}
}
}
}

#endif /* ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_ */