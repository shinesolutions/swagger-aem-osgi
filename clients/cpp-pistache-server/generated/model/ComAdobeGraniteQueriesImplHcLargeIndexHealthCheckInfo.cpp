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


#include "ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo()
{
    m_Pid = "";
    m_PidIsSet = false;
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo()
{
}

void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::toJson() const
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

void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::fromJson(nlohmann::json& val)
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
            ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties newItem;
            newItem.fromJson(val["properties"]);
            setProperties( newItem );
        }
        
    }
    
}


std::string ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getPid() const
{
    return m_Pid;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getTitle() const
{
    return m_Title;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getDescription() const
{
    return m_Description;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getProperties() const
{
    return m_Properties;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setProperties(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}

}
}
}
}
