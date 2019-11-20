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
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_
#define ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_


#include "ModelBase.h"

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
class  ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
    : public ModelBase
{
public:
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();
    virtual ~ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getPath() const;
    void setPath(ConfigNodePropertyString const& value);
    bool pathIsSet() const;
    void unsetPath();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getServiceRanking() const;
    void setServiceRanking(ConfigNodePropertyInteger const& value);
    bool serviceRankingIsSet() const;
    void unsetService_ranking();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getJaasControlFlag() const;
    void setJaasControlFlag(ConfigNodePropertyString const& value);
    bool jaasControlFlagIsSet() const;
    void unsetJaas_controlFlag();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getJaasRealmName() const;
    void setJaasRealmName(ConfigNodePropertyString const& value);
    bool jaasRealmNameIsSet() const;
    void unsetJaas_realmName();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getJaasRanking() const;
    void setJaasRanking(ConfigNodePropertyInteger const& value);
    bool jaasRankingIsSet() const;
    void unsetJaas_ranking();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getHeaders() const;
    void setHeaders(ConfigNodePropertyArray const& value);
    bool headersIsSet() const;
    void unsetHeaders();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCookies() const;
    void setCookies(ConfigNodePropertyArray const& value);
    bool cookiesIsSet() const;
    void unsetCookies();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getParameters() const;
    void setParameters(ConfigNodePropertyArray const& value);
    bool parametersIsSet() const;
    void unsetParameters();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getUsermap() const;
    void setUsermap(ConfigNodePropertyArray const& value);
    bool usermapIsSet() const;
    void unsetUsermap();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getFormat() const;
    void setFormat(ConfigNodePropertyString const& value);
    bool formatIsSet() const;
    void unsetFormat();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getTrustedCredentialsAttribute() const;
    void setTrustedCredentialsAttribute(ConfigNodePropertyString const& value);
    bool trustedCredentialsAttributeIsSet() const;
    void unsetTrustedCredentialsAttribute();

protected:
    ConfigNodePropertyString m_Path;
    bool m_PathIsSet;
    ConfigNodePropertyInteger m_Service_ranking;
    bool m_Service_rankingIsSet;
    ConfigNodePropertyString m_Jaas_controlFlag;
    bool m_Jaas_controlFlagIsSet;
    ConfigNodePropertyString m_Jaas_realmName;
    bool m_Jaas_realmNameIsSet;
    ConfigNodePropertyInteger m_Jaas_ranking;
    bool m_Jaas_rankingIsSet;
    ConfigNodePropertyArray m_Headers;
    bool m_HeadersIsSet;
    ConfigNodePropertyArray m_Cookies;
    bool m_CookiesIsSet;
    ConfigNodePropertyArray m_Parameters;
    bool m_ParametersIsSet;
    ConfigNodePropertyArray m_Usermap;
    bool m_UsermapIsSet;
    ConfigNodePropertyString m_Format;
    bool m_FormatIsSet;
    ConfigNodePropertyString m_TrustedCredentialsAttribute;
    bool m_TrustedCredentialsAttributeIsSet;
};

}
}
}
}

#endif /* ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_ */