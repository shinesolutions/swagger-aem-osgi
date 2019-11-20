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
 * ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.h
 *
 * 
 */

#ifndef ComAdobeCqDtmImplServiceDTMWebServiceImplProperties_H_
#define ComAdobeCqDtmImplServiceDTMWebServiceImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
    : public ModelBase
{
public:
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties();
    virtual ~ComAdobeCqDtmImplServiceDTMWebServiceImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqDtmImplServiceDTMWebServiceImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getConnectionTimeout() const;
    void setConnectionTimeout(ConfigNodePropertyInteger const& value);
    bool connectionTimeoutIsSet() const;
    void unsetConnection_timeout();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getSocketTimeout() const;
    void setSocketTimeout(ConfigNodePropertyInteger const& value);
    bool socketTimeoutIsSet() const;
    void unsetSocket_timeout();

protected:
    ConfigNodePropertyInteger m_Connection_timeout;
    bool m_Connection_timeoutIsSet;
    ConfigNodePropertyInteger m_Socket_timeout;
    bool m_Socket_timeoutIsSet;
};

}
}
}
}

#endif /* ComAdobeCqDtmImplServiceDTMWebServiceImplProperties_H_ */