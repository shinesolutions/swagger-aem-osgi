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


#include "OrgApacheSlingServletsResolverSlingServletResolverInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingServletsResolverSlingServletResolverInfo::OrgApacheSlingServletsResolverSlingServletResolverInfo()
{
    m_Pid = "";
    m_PidIsSet = false;
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    m_Bundle_location = "";
    m_Bundle_locationIsSet = false;
    m_Service_location = "";
    m_Service_locationIsSet = false;
    
}

OrgApacheSlingServletsResolverSlingServletResolverInfo::~OrgApacheSlingServletsResolverSlingServletResolverInfo()
{
}

void OrgApacheSlingServletsResolverSlingServletResolverInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingServletsResolverSlingServletResolverInfo::toJson() const
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

void OrgApacheSlingServletsResolverSlingServletResolverInfo::fromJson(nlohmann::json& val)
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
            OrgApacheSlingServletsResolverSlingServletResolverProperties newItem;
            newItem.fromJson(val["properties"]);
            setProperties( newItem );
        }
        
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


std::string OrgApacheSlingServletsResolverSlingServletResolverInfo::getPid() const
{
    return m_Pid;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string OrgApacheSlingServletsResolverSlingServletResolverInfo::getTitle() const
{
    return m_Title;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string OrgApacheSlingServletsResolverSlingServletResolverInfo::getDescription() const
{
    return m_Description;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
OrgApacheSlingServletsResolverSlingServletResolverProperties OrgApacheSlingServletsResolverSlingServletResolverInfo::getProperties() const
{
    return m_Properties;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::setProperties(OrgApacheSlingServletsResolverSlingServletResolverProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}
std::string OrgApacheSlingServletsResolverSlingServletResolverInfo::getBundleLocation() const
{
    return m_Bundle_location;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::setBundleLocation(std::string const& value)
{
    m_Bundle_location = value;
    m_Bundle_locationIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverInfo::bundleLocationIsSet() const
{
    return m_Bundle_locationIsSet;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::unsetBundle_location()
{
    m_Bundle_locationIsSet = false;
}
std::string OrgApacheSlingServletsResolverSlingServletResolverInfo::getServiceLocation() const
{
    return m_Service_location;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::setServiceLocation(std::string const& value)
{
    m_Service_location = value;
    m_Service_locationIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverInfo::serviceLocationIsSet() const
{
    return m_Service_locationIsSet;
}
void OrgApacheSlingServletsResolverSlingServletResolverInfo::unsetService_location()
{
    m_Service_locationIsSet = false;
}

}
}
}
}
