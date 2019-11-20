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
 * ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.h
 *
 * 
 */

#ifndef ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_
#define ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_



#include "ConfigNodePropertyInteger.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
{
public:
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();
    virtual ~ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getComAdobeAemScreensImplRemoteRequestTimeout() const;
    void setComAdobeAemScreensImplRemoteRequestTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyInteger> m_Com_adobe_aem_screens_impl_remote_request_timeout;
};

}
}
}
}

#endif /* ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_ */