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


#include "ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
{
    m_NameIsSet = false;
    m_ServiceNameIsSet = false;
    m_UserIdIsSet = false;
    m_AccessTokenProvider_targetIsSet = false;
    
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::~ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
{
}

void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_NameIsSet)
    {
        val["name"] = ModelBase::toJson(m_Name);
    }
    if(m_ServiceNameIsSet)
    {
        val["serviceName"] = ModelBase::toJson(m_ServiceName);
    }
    if(m_UserIdIsSet)
    {
        val["userId"] = ModelBase::toJson(m_UserId);
    }
    if(m_AccessTokenProvider_targetIsSet)
    {
        val["accessTokenProvider.target"] = ModelBase::toJson(m_AccessTokenProvider_target);
    }
    

    return val;
}

void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::fromJson(nlohmann::json& val)
{
    if(val.find("name") != val.end())
    {
        if(!val["name"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["name"]);
            setName( newItem );
        }
        
    }
    if(val.find("serviceName") != val.end())
    {
        if(!val["serviceName"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["serviceName"]);
            setServiceName( newItem );
        }
        
    }
    if(val.find("userId") != val.end())
    {
        if(!val["userId"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["userId"]);
            setUserId( newItem );
        }
        
    }
    if(val.find("accessTokenProvider.target") != val.end())
    {
        if(!val["accessTokenProvider.target"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["accessTokenProvider.target"]);
            setAccessTokenProviderTarget( newItem );
        }
        
    }
    
}


ConfigNodePropertyString ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getName() const
{
    return m_Name;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setName(ConfigNodePropertyString const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::nameIsSet() const
{
    return m_NameIsSet;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::unsetName()
{
    m_NameIsSet = false;
}
ConfigNodePropertyString ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getServiceName() const
{
    return m_ServiceName;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setServiceName(ConfigNodePropertyString const& value)
{
    m_ServiceName = value;
    m_ServiceNameIsSet = true;
}
bool ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::serviceNameIsSet() const
{
    return m_ServiceNameIsSet;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::unsetServiceName()
{
    m_ServiceNameIsSet = false;
}
ConfigNodePropertyString ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getUserId() const
{
    return m_UserId;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setUserId(ConfigNodePropertyString const& value)
{
    m_UserId = value;
    m_UserIdIsSet = true;
}
bool ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::userIdIsSet() const
{
    return m_UserIdIsSet;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::unsetUserId()
{
    m_UserIdIsSet = false;
}
ConfigNodePropertyString ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getAccessTokenProviderTarget() const
{
    return m_AccessTokenProvider_target;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setAccessTokenProviderTarget(ConfigNodePropertyString const& value)
{
    m_AccessTokenProvider_target = value;
    m_AccessTokenProvider_targetIsSet = true;
}
bool ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::accessTokenProviderTargetIsSet() const
{
    return m_AccessTokenProvider_targetIsSet;
}
void ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::unsetAccessTokenProvider_target()
{
    m_AccessTokenProvider_targetIsSet = false;
}

}
}
}
}
