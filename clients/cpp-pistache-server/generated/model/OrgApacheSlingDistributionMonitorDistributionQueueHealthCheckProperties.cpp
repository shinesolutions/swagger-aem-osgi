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


#include "OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
{
    m_Hc_nameIsSet = false;
    m_Hc_tagsIsSet = false;
    m_Hc_mbean_nameIsSet = false;
    m_NumberOfRetriesAllowedIsSet = false;
    
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::~OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
{
}

void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Hc_nameIsSet)
    {
        val["hc.name"] = ModelBase::toJson(m_Hc_name);
    }
    if(m_Hc_tagsIsSet)
    {
        val["hc.tags"] = ModelBase::toJson(m_Hc_tags);
    }
    if(m_Hc_mbean_nameIsSet)
    {
        val["hc.mbean.name"] = ModelBase::toJson(m_Hc_mbean_name);
    }
    if(m_NumberOfRetriesAllowedIsSet)
    {
        val["numberOfRetriesAllowed"] = ModelBase::toJson(m_NumberOfRetriesAllowed);
    }
    

    return val;
}

void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::fromJson(nlohmann::json& val)
{
    if(val.find("hc.name") != val.end())
    {
        if(!val["hc.name"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["hc.name"]);
            setHcName( newItem );
        }
        
    }
    if(val.find("hc.tags") != val.end())
    {
        if(!val["hc.tags"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["hc.tags"]);
            setHcTags( newItem );
        }
        
    }
    if(val.find("hc.mbean.name") != val.end())
    {
        if(!val["hc.mbean.name"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["hc.mbean.name"]);
            setHcMbeanName( newItem );
        }
        
    }
    if(val.find("numberOfRetriesAllowed") != val.end())
    {
        if(!val["numberOfRetriesAllowed"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["numberOfRetriesAllowed"]);
            setNumberOfRetriesAllowed( newItem );
        }
        
    }
    
}


ConfigNodePropertyString OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcName() const
{
    return m_Hc_name;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcName(ConfigNodePropertyString const& value)
{
    m_Hc_name = value;
    m_Hc_nameIsSet = true;
}
bool OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::hcNameIsSet() const
{
    return m_Hc_nameIsSet;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::unsetHc_name()
{
    m_Hc_nameIsSet = false;
}
ConfigNodePropertyArray OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcTags() const
{
    return m_Hc_tags;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcTags(ConfigNodePropertyArray const& value)
{
    m_Hc_tags = value;
    m_Hc_tagsIsSet = true;
}
bool OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::hcTagsIsSet() const
{
    return m_Hc_tagsIsSet;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::unsetHc_tags()
{
    m_Hc_tagsIsSet = false;
}
ConfigNodePropertyString OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcMbeanName() const
{
    return m_Hc_mbean_name;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcMbeanName(ConfigNodePropertyString const& value)
{
    m_Hc_mbean_name = value;
    m_Hc_mbean_nameIsSet = true;
}
bool OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::hcMbeanNameIsSet() const
{
    return m_Hc_mbean_nameIsSet;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::unsetHc_mbean_name()
{
    m_Hc_mbean_nameIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getNumberOfRetriesAllowed() const
{
    return m_NumberOfRetriesAllowed;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setNumberOfRetriesAllowed(ConfigNodePropertyInteger const& value)
{
    m_NumberOfRetriesAllowed = value;
    m_NumberOfRetriesAllowedIsSet = true;
}
bool OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::numberOfRetriesAllowedIsSet() const
{
    return m_NumberOfRetriesAllowedIsSet;
}
void OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::unsetNumberOfRetriesAllowed()
{
    m_NumberOfRetriesAllowedIsSet = false;
}

}
}
}
}
