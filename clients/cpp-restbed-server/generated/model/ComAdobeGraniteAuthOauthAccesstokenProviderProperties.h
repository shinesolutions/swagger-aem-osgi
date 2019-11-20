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
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_
#define ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteAuthOauthAccesstokenProviderProperties
{
public:
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties();
    virtual ~ComAdobeGraniteAuthOauthAccesstokenProviderProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeGraniteAuthOauthAccesstokenProviderProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getName() const;
    void setName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthTokenProviderTitle() const;
    void setAuthTokenProviderTitle(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getAuthTokenProviderDefaultClaims() const;
    void setAuthTokenProviderDefaultClaims(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthTokenProviderEndpoint() const;
    void setAuthTokenProviderEndpoint(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthAccessTokenRequest() const;
    void setAuthAccessTokenRequest(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthTokenProviderKeypairAlias() const;
    void setAuthTokenProviderKeypairAlias(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getAuthTokenProviderConnTimeout() const;
    void setAuthTokenProviderConnTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getAuthTokenProviderSoTimeout() const;
    void setAuthTokenProviderSoTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthTokenProviderClientId() const;
    void setAuthTokenProviderClientId(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthTokenProviderScope() const;
    void setAuthTokenProviderScope(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getAuthTokenProviderReuseAccessToken() const;
    void setAuthTokenProviderReuseAccessToken(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getAuthTokenProviderRelaxedSsl() const;
    void setAuthTokenProviderRelaxedSsl(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getTokenRequestCustomizerType() const;
    void setTokenRequestCustomizerType(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthTokenValidatorType() const;
    void setAuthTokenValidatorType(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Name;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_token_provider_title;
    std::shared_ptr<ConfigNodePropertyArray> m_Auth_token_provider_default_claims;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_token_provider_endpoint;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_access_token_request;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_token_provider_keypair_alias;
    std::shared_ptr<ConfigNodePropertyInteger> m_Auth_token_provider_conn_timeout;
    std::shared_ptr<ConfigNodePropertyInteger> m_Auth_token_provider_so_timeout;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_token_provider_client_id;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_token_provider_scope;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Auth_token_provider_reuse_access_token;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Auth_token_provider_relaxed_ssl;
    std::shared_ptr<ConfigNodePropertyString> m_Token_request_customizer_type;
    std::shared_ptr<ConfigNodePropertyString> m_Auth_token_validator_type;
};

}
}
}
}

#endif /* ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_ */