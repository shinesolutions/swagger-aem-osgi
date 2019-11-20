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
 * OrgApacheHttpProxyconfiguratorProperties.h
 *
 * 
 */

#ifndef OrgApacheHttpProxyconfiguratorProperties_H_
#define OrgApacheHttpProxyconfiguratorProperties_H_


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
class  OrgApacheHttpProxyconfiguratorProperties
    : public ModelBase
{
public:
    OrgApacheHttpProxyconfiguratorProperties();
    virtual ~OrgApacheHttpProxyconfiguratorProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheHttpProxyconfiguratorProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getProxyEnabled() const;
    void setProxyEnabled(ConfigNodePropertyBoolean const& value);
    bool proxyEnabledIsSet() const;
    void unsetProxy_enabled();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getProxyHost() const;
    void setProxyHost(ConfigNodePropertyString const& value);
    bool proxyHostIsSet() const;
    void unsetProxy_host();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getProxyPort() const;
    void setProxyPort(ConfigNodePropertyInteger const& value);
    bool proxyPortIsSet() const;
    void unsetProxy_port();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getProxyUser() const;
    void setProxyUser(ConfigNodePropertyString const& value);
    bool proxyUserIsSet() const;
    void unsetProxy_user();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getProxyPassword() const;
    void setProxyPassword(ConfigNodePropertyString const& value);
    bool proxyPasswordIsSet() const;
    void unsetProxy_password();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getProxyExceptions() const;
    void setProxyExceptions(ConfigNodePropertyArray const& value);
    bool proxyExceptionsIsSet() const;
    void unsetProxy_exceptions();

protected:
    ConfigNodePropertyBoolean m_Proxy_enabled;
    bool m_Proxy_enabledIsSet;
    ConfigNodePropertyString m_Proxy_host;
    bool m_Proxy_hostIsSet;
    ConfigNodePropertyInteger m_Proxy_port;
    bool m_Proxy_portIsSet;
    ConfigNodePropertyString m_Proxy_user;
    bool m_Proxy_userIsSet;
    ConfigNodePropertyString m_Proxy_password;
    bool m_Proxy_passwordIsSet;
    ConfigNodePropertyArray m_Proxy_exceptions;
    bool m_Proxy_exceptionsIsSet;
};

}
}
}
}

#endif /* OrgApacheHttpProxyconfiguratorProperties_H_ */