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


#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo()
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

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo()
{
}

void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::toJson() const
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

void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::fromJson(nlohmann::json& val)
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
            OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties newItem;
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


std::string OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getPid() const
{
    return m_Pid;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getTitle() const
{
    return m_Title;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getDescription() const
{
    return m_Description;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getProperties() const
{
    return m_Properties;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setProperties(OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}
std::string OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getAdditionalProperties() const
{
    return m_AdditionalProperties;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setAdditionalProperties(std::string const& value)
{
    m_AdditionalProperties = value;
    m_AdditionalPropertiesIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::additionalPropertiesIsSet() const
{
    return m_AdditionalPropertiesIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetAdditionalProperties()
{
    m_AdditionalPropertiesIsSet = false;
}
std::string OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getBundleLocation() const
{
    return m_Bundle_location;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setBundleLocation(std::string const& value)
{
    m_Bundle_location = value;
    m_Bundle_locationIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::bundleLocationIsSet() const
{
    return m_Bundle_locationIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetBundle_location()
{
    m_Bundle_locationIsSet = false;
}
std::string OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getServiceLocation() const
{
    return m_Service_location;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setServiceLocation(std::string const& value)
{
    m_Service_location = value;
    m_Service_locationIsSet = true;
}
bool OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::serviceLocationIsSet() const
{
    return m_Service_locationIsSet;
}
void OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::unsetService_location()
{
    m_Service_locationIsSet = false;
}

}
}
}
}

