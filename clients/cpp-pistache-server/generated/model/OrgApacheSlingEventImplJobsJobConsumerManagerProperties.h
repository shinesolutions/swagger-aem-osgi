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
/*
 * OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_
#define OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingEventImplJobsJobConsumerManagerProperties
    : public ModelBase
{
public:
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties();
    virtual ~OrgApacheSlingEventImplJobsJobConsumerManagerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingEventImplJobsJobConsumerManagerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() const;
    void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean const& value);
    bool orgApacheSlingInstallerConfigurationPersistIsSet() const;
    void unsetOrg_apache_sling_installer_configuration_persist();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getJobConsumermanagerWhitelist() const;
    void setJobConsumermanagerWhitelist(ConfigNodePropertyArray const& value);
    bool jobConsumermanagerWhitelistIsSet() const;
    void unsetJob_consumermanager_whitelist();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getJobConsumermanagerBlacklist() const;
    void setJobConsumermanagerBlacklist(ConfigNodePropertyArray const& value);
    bool jobConsumermanagerBlacklistIsSet() const;
    void unsetJob_consumermanager_blacklist();

protected:
    ConfigNodePropertyBoolean m_Org_apache_sling_installer_configuration_persist;
    bool m_Org_apache_sling_installer_configuration_persistIsSet;
    ConfigNodePropertyArray m_Job_consumermanager_whitelist;
    bool m_Job_consumermanager_whitelistIsSet;
    ConfigNodePropertyArray m_Job_consumermanager_blacklist;
    bool m_Job_consumermanager_blacklistIsSet;
};

}
}
}
}

#endif /* OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_ */