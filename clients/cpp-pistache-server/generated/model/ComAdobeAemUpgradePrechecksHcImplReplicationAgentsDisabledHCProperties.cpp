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


#include "ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties()
{
    m_Hc_nameIsSet = false;
    m_Hc_tagsIsSet = false;
    m_Hc_mbean_nameIsSet = false;
    
}

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::~ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties()
{
}

void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::toJson() const
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
    

    return val;
}

void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::fromJson(nlohmann::json& val)
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
    
}


ConfigNodePropertyString ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::getHcName() const
{
    return m_Hc_name;
}
void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::setHcName(ConfigNodePropertyString const& value)
{
    m_Hc_name = value;
    m_Hc_nameIsSet = true;
}
bool ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::hcNameIsSet() const
{
    return m_Hc_nameIsSet;
}
void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::unsetHc_name()
{
    m_Hc_nameIsSet = false;
}
ConfigNodePropertyArray ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::getHcTags() const
{
    return m_Hc_tags;
}
void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::setHcTags(ConfigNodePropertyArray const& value)
{
    m_Hc_tags = value;
    m_Hc_tagsIsSet = true;
}
bool ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::hcTagsIsSet() const
{
    return m_Hc_tagsIsSet;
}
void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::unsetHc_tags()
{
    m_Hc_tagsIsSet = false;
}
ConfigNodePropertyString ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::getHcMbeanName() const
{
    return m_Hc_mbean_name;
}
void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::setHcMbeanName(ConfigNodePropertyString const& value)
{
    m_Hc_mbean_name = value;
    m_Hc_mbean_nameIsSet = true;
}
bool ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::hcMbeanNameIsSet() const
{
    return m_Hc_mbean_nameIsSet;
}
void ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::unsetHc_mbean_name()
{
    m_Hc_mbean_nameIsSet = false;
}

}
}
}
}
