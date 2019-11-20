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
 * ComDayCqMcmImplMCMConfigurationProperties.h
 *
 * 
 */

#ifndef ComDayCqMcmImplMCMConfigurationProperties_H_
#define ComDayCqMcmImplMCMConfigurationProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqMcmImplMCMConfigurationProperties
    : public ModelBase
{
public:
    ComDayCqMcmImplMCMConfigurationProperties();
    virtual ~ComDayCqMcmImplMCMConfigurationProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqMcmImplMCMConfigurationProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getExperienceIndirection() const;
    void setExperienceIndirection(ConfigNodePropertyArray const& value);
    bool experienceIndirectionIsSet() const;
    void unsetExperience_indirection();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getTouchpointIndirection() const;
    void setTouchpointIndirection(ConfigNodePropertyArray const& value);
    bool touchpointIndirectionIsSet() const;
    void unsetTouchpoint_indirection();

protected:
    ConfigNodePropertyArray m_Experience_indirection;
    bool m_Experience_indirectionIsSet;
    ConfigNodePropertyArray m_Touchpoint_indirection;
    bool m_Touchpoint_indirectionIsSet;
};

}
}
}
}

#endif /* ComDayCqMcmImplMCMConfigurationProperties_H_ */