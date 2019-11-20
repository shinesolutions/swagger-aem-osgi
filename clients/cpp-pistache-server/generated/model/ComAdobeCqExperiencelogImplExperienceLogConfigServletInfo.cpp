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


#include "ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo()
{
    m_Pid = "";
    m_PidIsSet = false;
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    m_AdditionalProperties = "";
    m_AdditionalPropertiesIsSet = false;
    m_Bundle_location = "";
    m_Bundle_locationIsSet = false;
    m_Service_location = "";
    m_Service_locationIsSet = false;
    
}

ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::~ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo()
{
}

void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::toJson() const
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
    if(m_AdditionalPropertiesIsSet)
    {
        val["additionalProperties"] = ModelBase::toJson(m_AdditionalProperties);
    }
    if(m_Bundle_locationIsSet)
    {
        val["bundle_location"] = ModelBase::toJson(m_Bundle_location);
    }
    if(m_Service_locationIsSet)
    {
        val["service_location"] = ModelBase::toJson(m_Service_location);
    }
    

    return val;
}

void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::fromJson(nlohmann::json& val)
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
            ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties newItem;
            newItem.fromJson(val["properties"]);
            setProperties( newItem );
        }
        
    }
    if(val.find("additionalProperties") != val.end())
    {
        setAdditionalProperties(val.at("additionalProperties"));
    }
    if(val.find("bundle_location") != val.end())
    {
        setBundleLocation(val.at("bundle_location"));
    }
    if(val.find("service_location") != val.end())
    {
        setServiceLocation(val.at("service_location"));
    }
    
}


std::string ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getPid() const
{
    return m_Pid;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getTitle() const
{
    return m_Title;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getDescription() const
{
    return m_Description;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getProperties() const
{
    return m_Properties;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setProperties(ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}
std::string ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getAdditionalProperties() const
{
    return m_AdditionalProperties;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setAdditionalProperties(std::string const& value)
{
    m_AdditionalProperties = value;
    m_AdditionalPropertiesIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::additionalPropertiesIsSet() const
{
    return m_AdditionalPropertiesIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetAdditionalProperties()
{
    m_AdditionalPropertiesIsSet = false;
}
std::string ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getBundleLocation() const
{
    return m_Bundle_location;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setBundleLocation(std::string const& value)
{
    m_Bundle_location = value;
    m_Bundle_locationIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::bundleLocationIsSet() const
{
    return m_Bundle_locationIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetBundle_location()
{
    m_Bundle_locationIsSet = false;
}
std::string ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::getServiceLocation() const
{
    return m_Service_location;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::setServiceLocation(std::string const& value)
{
    m_Service_location = value;
    m_Service_locationIsSet = true;
}
bool ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::serviceLocationIsSet() const
{
    return m_Service_locationIsSet;
}
void ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo::unsetService_location()
{
    m_Service_locationIsSet = false;
}

}
}
}
}
