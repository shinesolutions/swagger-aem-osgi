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
 * ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.h
 *
 * 
 */

#ifndef ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_
#define ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_


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
class  ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();
    virtual ~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getAutomoderationSequence() const;
    void setAutomoderationSequence(ConfigNodePropertyArray const& value);
    bool automoderationSequenceIsSet() const;
    void unsetAutomoderation_sequence();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getAutomoderationOnfailurestop() const;
    void setAutomoderationOnfailurestop(ConfigNodePropertyBoolean const& value);
    bool automoderationOnfailurestopIsSet() const;
    void unsetAutomoderation_onfailurestop();

protected:
    ConfigNodePropertyArray m_Automoderation_sequence;
    bool m_Automoderation_sequenceIsSet;
    ConfigNodePropertyBoolean m_Automoderation_onfailurestop;
    bool m_Automoderation_onfailurestopIsSet;
};

}
}
}
}

#endif /* ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_ */