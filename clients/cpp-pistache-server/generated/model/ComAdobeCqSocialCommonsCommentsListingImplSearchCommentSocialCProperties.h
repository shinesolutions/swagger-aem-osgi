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
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.h
 *
 * 
 */

#ifndef ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_
#define ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();
    virtual ~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getNumUserLimit() const;
    void setNumUserLimit(ConfigNodePropertyInteger const& value);
    bool numUserLimitIsSet() const;
    void unsetNumUserLimit();

protected:
    ConfigNodePropertyInteger m_NumUserLimit;
    bool m_NumUserLimitIsSet;
};

}
}
}
}

#endif /* ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_ */