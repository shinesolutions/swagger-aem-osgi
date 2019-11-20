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


#include "ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
{
    m_Oauth_issuerIsSet = false;
    m_Oauth_access_token_expires_inIsSet = false;
    m_Osgi_http_whiteboard_servlet_patternIsSet = false;
    m_Osgi_http_whiteboard_context_selectIsSet = false;
    
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::~ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
{
}

void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Oauth_issuerIsSet)
    {
        val["oauth.issuer"] = ModelBase::toJson(m_Oauth_issuer);
    }
    if(m_Oauth_access_token_expires_inIsSet)
    {
        val["oauth.access.token.expires.in"] = ModelBase::toJson(m_Oauth_access_token_expires_in);
    }
    if(m_Osgi_http_whiteboard_servlet_patternIsSet)
    {
        val["osgi.http.whiteboard.servlet.pattern"] = ModelBase::toJson(m_Osgi_http_whiteboard_servlet_pattern);
    }
    if(m_Osgi_http_whiteboard_context_selectIsSet)
    {
        val["osgi.http.whiteboard.context.select"] = ModelBase::toJson(m_Osgi_http_whiteboard_context_select);
    }
    

    return val;
}

void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::fromJson(nlohmann::json& val)
{
    if(val.find("oauth.issuer") != val.end())
    {
        if(!val["oauth.issuer"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["oauth.issuer"]);
            setOauthIssuer( newItem );
        }
        
    }
    if(val.find("oauth.access.token.expires.in") != val.end())
    {
        if(!val["oauth.access.token.expires.in"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["oauth.access.token.expires.in"]);
            setOauthAccessTokenExpiresIn( newItem );
        }
        
    }
    if(val.find("osgi.http.whiteboard.servlet.pattern") != val.end())
    {
        if(!val["osgi.http.whiteboard.servlet.pattern"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["osgi.http.whiteboard.servlet.pattern"]);
            setOsgiHttpWhiteboardServletPattern( newItem );
        }
        
    }
    if(val.find("osgi.http.whiteboard.context.select") != val.end())
    {
        if(!val["osgi.http.whiteboard.context.select"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["osgi.http.whiteboard.context.select"]);
            setOsgiHttpWhiteboardContextSelect( newItem );
        }
        
    }
    
}


ConfigNodePropertyString ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOauthIssuer() const
{
    return m_Oauth_issuer;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOauthIssuer(ConfigNodePropertyString const& value)
{
    m_Oauth_issuer = value;
    m_Oauth_issuerIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::oauthIssuerIsSet() const
{
    return m_Oauth_issuerIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::unsetOauth_issuer()
{
    m_Oauth_issuerIsSet = false;
}
ConfigNodePropertyString ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOauthAccessTokenExpiresIn() const
{
    return m_Oauth_access_token_expires_in;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOauthAccessTokenExpiresIn(ConfigNodePropertyString const& value)
{
    m_Oauth_access_token_expires_in = value;
    m_Oauth_access_token_expires_inIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::oauthAccessTokenExpiresInIsSet() const
{
    return m_Oauth_access_token_expires_inIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::unsetOauth_access_token_expires_in()
{
    m_Oauth_access_token_expires_inIsSet = false;
}
ConfigNodePropertyString ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOsgiHttpWhiteboardServletPattern() const
{
    return m_Osgi_http_whiteboard_servlet_pattern;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString const& value)
{
    m_Osgi_http_whiteboard_servlet_pattern = value;
    m_Osgi_http_whiteboard_servlet_patternIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::osgiHttpWhiteboardServletPatternIsSet() const
{
    return m_Osgi_http_whiteboard_servlet_patternIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::unsetOsgi_http_whiteboard_servlet_pattern()
{
    m_Osgi_http_whiteboard_servlet_patternIsSet = false;
}
ConfigNodePropertyString ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOsgiHttpWhiteboardContextSelect() const
{
    return m_Osgi_http_whiteboard_context_select;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString const& value)
{
    m_Osgi_http_whiteboard_context_select = value;
    m_Osgi_http_whiteboard_context_selectIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::osgiHttpWhiteboardContextSelectIsSet() const
{
    return m_Osgi_http_whiteboard_context_selectIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::unsetOsgi_http_whiteboard_context_select()
{
    m_Osgi_http_whiteboard_context_selectIsSet = false;
}

}
}
}
}
