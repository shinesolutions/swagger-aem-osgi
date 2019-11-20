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
 * ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_
#define ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
    : public ModelBase
{
public:
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();
    virtual ~ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqWcmFoundationImplPageImpressionsTrackerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSlingAuthRequirements() const;
    void setSlingAuthRequirements(ConfigNodePropertyString const& value);
    bool slingAuthRequirementsIsSet() const;
    void unsetSling_auth_requirements();

protected:
    ConfigNodePropertyString m_Sling_auth_requirements;
    bool m_Sling_auth_requirementsIsSet;
};

}
}
}
}

#endif /* ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_ */