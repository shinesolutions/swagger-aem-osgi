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
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.h
 *
 * 
 */

#ifndef AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_
#define AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
    : public ModelBase
{
public:
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();
    virtual ~AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getFontList() const;
    void setFontList(ConfigNodePropertyArray const& value);
    bool fontListIsSet() const;
    void unsetFontList();

protected:
    ConfigNodePropertyArray m_FontList;
    bool m_FontListIsSet;
};

}
}
}
}

#endif /* AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_ */