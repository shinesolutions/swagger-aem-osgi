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


#include "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo()
{
    m_Pid = "";
    m_PidIsSet = false;
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo()
{
}

void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_PidIsSet)
    {
        val["pid"] = ModelBase::toJson(m_Pid);
    }
    if(m_TitleIsSet)
    {
        val["title"] = ModelBase::toJson(m_Title);
    }
    if(m_DescriptionIsSet)
    {
        val["description"] = ModelBase::toJson(m_Description);
    }
    if(m_PropertiesIsSet)
    {
        val["properties"] = ModelBase::toJson(m_Properties);
    }
    

    return val;
}

void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::fromJson(nlohmann::json& val)
{
    if(val.find("pid") != val.end())
    {
        setPid(val.at("pid"));
    }
    if(val.find("title") != val.end())
    {
        setTitle(val.at("title"));
    }
    if(val.find("description") != val.end())
    {
        setDescription(val.at("description"));
    }
    if(val.find("properties") != val.end())
    {
        if(!val["properties"].is_null())
        {
            ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties newItem;
            newItem.fromJson(val["properties"]);
            setProperties( newItem );
        }
        
    }
    
}


std::string ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getPid() const
{
    return m_Pid;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getTitle() const
{
    return m_Title;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getDescription() const
{
    return m_Description;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getProperties() const
{
    return m_Properties;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setProperties(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}

}
}
}
}
