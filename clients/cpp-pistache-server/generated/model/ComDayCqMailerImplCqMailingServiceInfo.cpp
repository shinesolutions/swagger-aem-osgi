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


#include "ComDayCqMailerImplCqMailingServiceInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqMailerImplCqMailingServiceInfo::ComDayCqMailerImplCqMailingServiceInfo()
{
    m_Pid = "";
    m_PidIsSet = false;
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    
}

ComDayCqMailerImplCqMailingServiceInfo::~ComDayCqMailerImplCqMailingServiceInfo()
{
}

void ComDayCqMailerImplCqMailingServiceInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqMailerImplCqMailingServiceInfo::toJson() const
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

void ComDayCqMailerImplCqMailingServiceInfo::fromJson(nlohmann::json& val)
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
            ComDayCqMailerImplCqMailingServiceProperties newItem;
            newItem.fromJson(val["properties"]);
            setProperties( newItem );
        }
        
    }
    
}


std::string ComDayCqMailerImplCqMailingServiceInfo::getPid() const
{
    return m_Pid;
}
void ComDayCqMailerImplCqMailingServiceInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool ComDayCqMailerImplCqMailingServiceInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void ComDayCqMailerImplCqMailingServiceInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string ComDayCqMailerImplCqMailingServiceInfo::getTitle() const
{
    return m_Title;
}
void ComDayCqMailerImplCqMailingServiceInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool ComDayCqMailerImplCqMailingServiceInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void ComDayCqMailerImplCqMailingServiceInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string ComDayCqMailerImplCqMailingServiceInfo::getDescription() const
{
    return m_Description;
}
void ComDayCqMailerImplCqMailingServiceInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ComDayCqMailerImplCqMailingServiceInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void ComDayCqMailerImplCqMailingServiceInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
ComDayCqMailerImplCqMailingServiceProperties ComDayCqMailerImplCqMailingServiceInfo::getProperties() const
{
    return m_Properties;
}
void ComDayCqMailerImplCqMailingServiceInfo::setProperties(ComDayCqMailerImplCqMailingServiceProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool ComDayCqMailerImplCqMailingServiceInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void ComDayCqMailerImplCqMailingServiceInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}

}
}
}
}
