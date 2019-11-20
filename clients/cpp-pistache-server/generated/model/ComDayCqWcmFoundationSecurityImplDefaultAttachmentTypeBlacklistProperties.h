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
 * ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_
#define ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
    : public ModelBase
{
public:
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();
    virtual ~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() const;
    void setDefaultAttachmentTypeBlacklist(ConfigNodePropertyArray const& value);
    bool defaultAttachmentTypeBlacklistIsSet() const;
    void unsetDefault_attachment_type_blacklist();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getBaselineAttachmentTypeBlacklist() const;
    void setBaselineAttachmentTypeBlacklist(ConfigNodePropertyArray const& value);
    bool baselineAttachmentTypeBlacklistIsSet() const;
    void unsetBaseline_attachment_type_blacklist();

protected:
    ConfigNodePropertyArray m_Default_attachment_type_blacklist;
    bool m_Default_attachment_type_blacklistIsSet;
    ConfigNodePropertyArray m_Baseline_attachment_type_blacklist;
    bool m_Baseline_attachment_type_blacklistIsSet;
};

}
}
}
}

#endif /* ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_ */