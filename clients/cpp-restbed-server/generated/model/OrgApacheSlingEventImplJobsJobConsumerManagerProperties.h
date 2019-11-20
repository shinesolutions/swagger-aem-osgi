/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_
#define OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyArray.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingEventImplJobsJobConsumerManagerProperties
{
public:
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties();
    virtual ~OrgApacheSlingEventImplJobsJobConsumerManagerProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheSlingEventImplJobsJobConsumerManagerProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getOrgApacheSlingInstallerConfigurationPersist() const;
    void setOrgApacheSlingInstallerConfigurationPersist(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getJobConsumermanagerWhitelist() const;
    void setJobConsumermanagerWhitelist(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getJobConsumermanagerBlacklist() const;
    void setJobConsumermanagerBlacklist(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Org_apache_sling_installer_configuration_persist;
    std::shared_ptr<ConfigNodePropertyArray> m_Job_consumermanager_whitelist;
    std::shared_ptr<ConfigNodePropertyArray> m_Job_consumermanager_blacklist;
};

}
}
}
}

#endif /* OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_ */