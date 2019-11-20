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
 * ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.h
 *
 * 
 */

#ifndef ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties_H_
#define ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties();
    virtual ~ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getFieldWhitelist() const;
    void setFieldWhitelist(ConfigNodePropertyArray const& value);
    bool fieldWhitelistIsSet() const;
    void unsetFieldWhitelist();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getAttachmentTypeBlacklist() const;
    void setAttachmentTypeBlacklist(ConfigNodePropertyArray const& value);
    bool attachmentTypeBlacklistIsSet() const;
    void unsetAttachmentTypeBlacklist();

protected:
    ConfigNodePropertyArray m_FieldWhitelist;
    bool m_FieldWhitelistIsSet;
    ConfigNodePropertyArray m_AttachmentTypeBlacklist;
    bool m_AttachmentTypeBlacklistIsSet;
};

}
}
}
}

#endif /* ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties_H_ */