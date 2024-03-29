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
 * OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_
#define OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
    : public ModelBase
{
public:
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
    virtual ~OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() const;
    void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown const& value);
    bool orgApacheSlingCommonsLogLevelIsSet() const;
    void unsetOrg_apache_sling_commons_log_level();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() const;
    void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString const& value);
    bool orgApacheSlingCommonsLogFileIsSet() const;
    void unsetOrg_apache_sling_commons_log_file();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() const;
    void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString const& value);
    bool orgApacheSlingCommonsLogPatternIsSet() const;
    void unsetOrg_apache_sling_commons_log_pattern();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getOrgApacheSlingCommonsLogNames() const;
    void setOrgApacheSlingCommonsLogNames(ConfigNodePropertyArray const& value);
    bool orgApacheSlingCommonsLogNamesIsSet() const;
    void unsetOrg_apache_sling_commons_log_names();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogAdditiv() const;
    void setOrgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean const& value);
    bool orgApacheSlingCommonsLogAdditivIsSet() const;
    void unsetOrg_apache_sling_commons_log_additiv();

protected:
    ConfigNodePropertyDropDown m_Org_apache_sling_commons_log_level;
    bool m_Org_apache_sling_commons_log_levelIsSet;
    ConfigNodePropertyString m_Org_apache_sling_commons_log_file;
    bool m_Org_apache_sling_commons_log_fileIsSet;
    ConfigNodePropertyString m_Org_apache_sling_commons_log_pattern;
    bool m_Org_apache_sling_commons_log_patternIsSet;
    ConfigNodePropertyArray m_Org_apache_sling_commons_log_names;
    bool m_Org_apache_sling_commons_log_namesIsSet;
    ConfigNodePropertyBoolean m_Org_apache_sling_commons_log_additiv;
    bool m_Org_apache_sling_commons_log_additivIsSet;
};

}
}
}
}

#endif /* OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_ */
