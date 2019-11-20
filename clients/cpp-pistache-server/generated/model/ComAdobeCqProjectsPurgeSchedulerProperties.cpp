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


#include "ComAdobeCqProjectsPurgeSchedulerProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqProjectsPurgeSchedulerProperties::ComAdobeCqProjectsPurgeSchedulerProperties()
{
    m_Scheduledpurge_nameIsSet = false;
    m_Scheduledpurge_purgeActiveIsSet = false;
    m_Scheduledpurge_templatesIsSet = false;
    m_Scheduledpurge_purgeGroupsIsSet = false;
    m_Scheduledpurge_purgeAssetsIsSet = false;
    m_Scheduledpurge_terminateRunningWorkflowsIsSet = false;
    m_Scheduledpurge_daysoldIsSet = false;
    m_Scheduledpurge_saveThresholdIsSet = false;
    
}

ComAdobeCqProjectsPurgeSchedulerProperties::~ComAdobeCqProjectsPurgeSchedulerProperties()
{
}

void ComAdobeCqProjectsPurgeSchedulerProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqProjectsPurgeSchedulerProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Scheduledpurge_nameIsSet)
    {
        val["scheduledpurge.name"] = ModelBase::toJson(m_Scheduledpurge_name);
    }
    if(m_Scheduledpurge_purgeActiveIsSet)
    {
        val["scheduledpurge.purgeActive"] = ModelBase::toJson(m_Scheduledpurge_purgeActive);
    }
    if(m_Scheduledpurge_templatesIsSet)
    {
        val["scheduledpurge.templates"] = ModelBase::toJson(m_Scheduledpurge_templates);
    }
    if(m_Scheduledpurge_purgeGroupsIsSet)
    {
        val["scheduledpurge.purgeGroups"] = ModelBase::toJson(m_Scheduledpurge_purgeGroups);
    }
    if(m_Scheduledpurge_purgeAssetsIsSet)
    {
        val["scheduledpurge.purgeAssets"] = ModelBase::toJson(m_Scheduledpurge_purgeAssets);
    }
    if(m_Scheduledpurge_terminateRunningWorkflowsIsSet)
    {
        val["scheduledpurge.terminateRunningWorkflows"] = ModelBase::toJson(m_Scheduledpurge_terminateRunningWorkflows);
    }
    if(m_Scheduledpurge_daysoldIsSet)
    {
        val["scheduledpurge.daysold"] = ModelBase::toJson(m_Scheduledpurge_daysold);
    }
    if(m_Scheduledpurge_saveThresholdIsSet)
    {
        val["scheduledpurge.saveThreshold"] = ModelBase::toJson(m_Scheduledpurge_saveThreshold);
    }
    

    return val;
}

void ComAdobeCqProjectsPurgeSchedulerProperties::fromJson(nlohmann::json& val)
{
    if(val.find("scheduledpurge.name") != val.end())
    {
        if(!val["scheduledpurge.name"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["scheduledpurge.name"]);
            setScheduledpurgeName( newItem );
        }
        
    }
    if(val.find("scheduledpurge.purgeActive") != val.end())
    {
        if(!val["scheduledpurge.purgeActive"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["scheduledpurge.purgeActive"]);
            setScheduledpurgePurgeActive( newItem );
        }
        
    }
    if(val.find("scheduledpurge.templates") != val.end())
    {
        if(!val["scheduledpurge.templates"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["scheduledpurge.templates"]);
            setScheduledpurgeTemplates( newItem );
        }
        
    }
    if(val.find("scheduledpurge.purgeGroups") != val.end())
    {
        if(!val["scheduledpurge.purgeGroups"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["scheduledpurge.purgeGroups"]);
            setScheduledpurgePurgeGroups( newItem );
        }
        
    }
    if(val.find("scheduledpurge.purgeAssets") != val.end())
    {
        if(!val["scheduledpurge.purgeAssets"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["scheduledpurge.purgeAssets"]);
            setScheduledpurgePurgeAssets( newItem );
        }
        
    }
    if(val.find("scheduledpurge.terminateRunningWorkflows") != val.end())
    {
        if(!val["scheduledpurge.terminateRunningWorkflows"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["scheduledpurge.terminateRunningWorkflows"]);
            setScheduledpurgeTerminateRunningWorkflows( newItem );
        }
        
    }
    if(val.find("scheduledpurge.daysold") != val.end())
    {
        if(!val["scheduledpurge.daysold"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["scheduledpurge.daysold"]);
            setScheduledpurgeDaysold( newItem );
        }
        
    }
    if(val.find("scheduledpurge.saveThreshold") != val.end())
    {
        if(!val["scheduledpurge.saveThreshold"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["scheduledpurge.saveThreshold"]);
            setScheduledpurgeSaveThreshold( newItem );
        }
        
    }
    
}


ConfigNodePropertyString ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeName() const
{
    return m_Scheduledpurge_name;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeName(ConfigNodePropertyString const& value)
{
    m_Scheduledpurge_name = value;
    m_Scheduledpurge_nameIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgeNameIsSet() const
{
    return m_Scheduledpurge_nameIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_name()
{
    m_Scheduledpurge_nameIsSet = false;
}
ConfigNodePropertyBoolean ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgePurgeActive() const
{
    return m_Scheduledpurge_purgeActive;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgePurgeActive(ConfigNodePropertyBoolean const& value)
{
    m_Scheduledpurge_purgeActive = value;
    m_Scheduledpurge_purgeActiveIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgePurgeActiveIsSet() const
{
    return m_Scheduledpurge_purgeActiveIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_purgeActive()
{
    m_Scheduledpurge_purgeActiveIsSet = false;
}
ConfigNodePropertyArray ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeTemplates() const
{
    return m_Scheduledpurge_templates;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeTemplates(ConfigNodePropertyArray const& value)
{
    m_Scheduledpurge_templates = value;
    m_Scheduledpurge_templatesIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgeTemplatesIsSet() const
{
    return m_Scheduledpurge_templatesIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_templates()
{
    m_Scheduledpurge_templatesIsSet = false;
}
ConfigNodePropertyBoolean ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgePurgeGroups() const
{
    return m_Scheduledpurge_purgeGroups;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean const& value)
{
    m_Scheduledpurge_purgeGroups = value;
    m_Scheduledpurge_purgeGroupsIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgePurgeGroupsIsSet() const
{
    return m_Scheduledpurge_purgeGroupsIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_purgeGroups()
{
    m_Scheduledpurge_purgeGroupsIsSet = false;
}
ConfigNodePropertyBoolean ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgePurgeAssets() const
{
    return m_Scheduledpurge_purgeAssets;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean const& value)
{
    m_Scheduledpurge_purgeAssets = value;
    m_Scheduledpurge_purgeAssetsIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgePurgeAssetsIsSet() const
{
    return m_Scheduledpurge_purgeAssetsIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_purgeAssets()
{
    m_Scheduledpurge_purgeAssetsIsSet = false;
}
ConfigNodePropertyBoolean ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeTerminateRunningWorkflows() const
{
    return m_Scheduledpurge_terminateRunningWorkflows;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean const& value)
{
    m_Scheduledpurge_terminateRunningWorkflows = value;
    m_Scheduledpurge_terminateRunningWorkflowsIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgeTerminateRunningWorkflowsIsSet() const
{
    return m_Scheduledpurge_terminateRunningWorkflowsIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_terminateRunningWorkflows()
{
    m_Scheduledpurge_terminateRunningWorkflowsIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeDaysold() const
{
    return m_Scheduledpurge_daysold;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeDaysold(ConfigNodePropertyInteger const& value)
{
    m_Scheduledpurge_daysold = value;
    m_Scheduledpurge_daysoldIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgeDaysoldIsSet() const
{
    return m_Scheduledpurge_daysoldIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_daysold()
{
    m_Scheduledpurge_daysoldIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeSaveThreshold() const
{
    return m_Scheduledpurge_saveThreshold;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeSaveThreshold(ConfigNodePropertyInteger const& value)
{
    m_Scheduledpurge_saveThreshold = value;
    m_Scheduledpurge_saveThresholdIsSet = true;
}
bool ComAdobeCqProjectsPurgeSchedulerProperties::scheduledpurgeSaveThresholdIsSet() const
{
    return m_Scheduledpurge_saveThresholdIsSet;
}
void ComAdobeCqProjectsPurgeSchedulerProperties::unsetScheduledpurge_saveThreshold()
{
    m_Scheduledpurge_saveThresholdIsSet = false;
}

}
}
}
}
