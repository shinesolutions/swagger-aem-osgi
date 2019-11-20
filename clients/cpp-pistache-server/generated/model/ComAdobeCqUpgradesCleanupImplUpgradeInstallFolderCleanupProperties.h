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
 * ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.h
 *
 * 
 */

#ifndef ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_
#define ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
    : public ModelBase
{
public:
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();
    virtual ~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getDeleteNameRegexps() const;
    void setDeleteNameRegexps(ConfigNodePropertyArray const& value);
    bool deleteNameRegexpsIsSet() const;
    void unsetDelete_name_regexps();

protected:
    ConfigNodePropertyArray m_Delete_name_regexps;
    bool m_Delete_name_regexpsIsSet;
};

}
}
}
}

#endif /* ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_ */