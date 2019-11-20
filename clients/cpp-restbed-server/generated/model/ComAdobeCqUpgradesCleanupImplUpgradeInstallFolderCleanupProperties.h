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
 * ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.h
 *
 * 
 */

#ifndef ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_
#define ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_



#include "ConfigNodePropertyArray.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
{
public:
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();
    virtual ~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getDeleteNameRegexps() const;
    void setDeleteNameRegexps(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Delete_name_regexps;
};

}
}
}
}

#endif /* ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_ */