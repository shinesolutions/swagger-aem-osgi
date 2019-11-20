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


#include "OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
{
    m_Org_apache_sling_installer_configuration_persistIsSet = false;
    m_Job_consumermanager_whitelistIsSet = false;
    m_Job_consumermanager_blacklistIsSet = false;
    
}

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::~OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
{
}

void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingEventImplJobsJobConsumerManagerProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Org_apache_sling_installer_configuration_persistIsSet)
    {
        val["org.apache.sling.installer.configuration.persist"] = ModelBase::toJson(m_Org_apache_sling_installer_configuration_persist);
    }
    if(m_Job_consumermanager_whitelistIsSet)
    {
        val["job.consumermanager.whitelist"] = ModelBase::toJson(m_Job_consumermanager_whitelist);
    }
    if(m_Job_consumermanager_blacklistIsSet)
    {
        val["job.consumermanager.blacklist"] = ModelBase::toJson(m_Job_consumermanager_blacklist);
    }
    

    return val;
}

void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::fromJson(nlohmann::json& val)
{
    if(val.find("org.apache.sling.installer.configuration.persist") != val.end())
    {
        if(!val["org.apache.sling.installer.configuration.persist"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["org.apache.sling.installer.configuration.persist"]);
            setOrgApacheSlingInstallerConfigurationPersist( newItem );
        }
        
    }
    if(val.find("job.consumermanager.whitelist") != val.end())
    {
        if(!val["job.consumermanager.whitelist"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["job.consumermanager.whitelist"]);
            setJobConsumermanagerWhitelist( newItem );
        }
        
    }
    if(val.find("job.consumermanager.blacklist") != val.end())
    {
        if(!val["job.consumermanager.blacklist"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["job.consumermanager.blacklist"]);
            setJobConsumermanagerBlacklist( newItem );
        }
        
    }
    
}


ConfigNodePropertyBoolean OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getOrgApacheSlingInstallerConfigurationPersist() const
{
    return m_Org_apache_sling_installer_configuration_persist;
}
void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean const& value)
{
    m_Org_apache_sling_installer_configuration_persist = value;
    m_Org_apache_sling_installer_configuration_persistIsSet = true;
}
bool OrgApacheSlingEventImplJobsJobConsumerManagerProperties::orgApacheSlingInstallerConfigurationPersistIsSet() const
{
    return m_Org_apache_sling_installer_configuration_persistIsSet;
}
void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::unsetOrg_apache_sling_installer_configuration_persist()
{
    m_Org_apache_sling_installer_configuration_persistIsSet = false;
}
ConfigNodePropertyArray OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getJobConsumermanagerWhitelist() const
{
    return m_Job_consumermanager_whitelist;
}
void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setJobConsumermanagerWhitelist(ConfigNodePropertyArray const& value)
{
    m_Job_consumermanager_whitelist = value;
    m_Job_consumermanager_whitelistIsSet = true;
}
bool OrgApacheSlingEventImplJobsJobConsumerManagerProperties::jobConsumermanagerWhitelistIsSet() const
{
    return m_Job_consumermanager_whitelistIsSet;
}
void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::unsetJob_consumermanager_whitelist()
{
    m_Job_consumermanager_whitelistIsSet = false;
}
ConfigNodePropertyArray OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getJobConsumermanagerBlacklist() const
{
    return m_Job_consumermanager_blacklist;
}
void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setJobConsumermanagerBlacklist(ConfigNodePropertyArray const& value)
{
    m_Job_consumermanager_blacklist = value;
    m_Job_consumermanager_blacklistIsSet = true;
}
bool OrgApacheSlingEventImplJobsJobConsumerManagerProperties::jobConsumermanagerBlacklistIsSet() const
{
    return m_Job_consumermanager_blacklistIsSet;
}
void OrgApacheSlingEventImplJobsJobConsumerManagerProperties::unsetJob_consumermanager_blacklist()
{
    m_Job_consumermanager_blacklistIsSet = false;
}

}
}
}
}
