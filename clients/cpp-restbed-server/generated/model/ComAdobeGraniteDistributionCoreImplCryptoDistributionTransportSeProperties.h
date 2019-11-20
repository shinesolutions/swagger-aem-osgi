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
 * ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_
#define ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_



#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
{
public:
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();
    virtual ~ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getName() const;
    void setName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getUsername() const;
    void setUsername(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getEncryptedPassword() const;
    void setEncryptedPassword(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Name;
    std::shared_ptr<ConfigNodePropertyString> m_Username;
    std::shared_ptr<ConfigNodePropertyString> m_EncryptedPassword;
};

}
}
}
}

#endif /* ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_ */