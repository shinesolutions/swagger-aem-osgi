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


#include "OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo()
{
    m_Pid = "";
    m_PidIsSet = false;
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::~OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo()
{
}

void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::toJson() const
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

void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::fromJson(nlohmann::json& val)
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
            OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties newItem;
            newItem.fromJson(val["properties"]);
            setProperties( newItem );
        }
        
    }
    
}


std::string OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getPid() const
{
    return m_Pid;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setPid(std::string const& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::pidIsSet() const
{
    return m_PidIsSet;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::unsetPid()
{
    m_PidIsSet = false;
}
std::string OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getTitle() const
{
    return m_Title;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::titleIsSet() const
{
    return m_TitleIsSet;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getDescription() const
{
    return m_Description;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getProperties() const
{
    return m_Properties;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setProperties(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties const& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}
void OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}

}
}
}
}
