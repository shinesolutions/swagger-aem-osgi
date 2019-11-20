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
 * ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties_H_
#define ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
    : public ModelBase
{
public:
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties();
    virtual ~ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getPageInfoProviderPropertyRegexDefault() const;
    void setPageInfoProviderPropertyRegexDefault(ConfigNodePropertyString const& value);
    bool pageInfoProviderPropertyRegexDefaultIsSet() const;
    void unsetPage_info_provider_property_regex_default();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getPageInfoProviderPropertyName() const;
    void setPageInfoProviderPropertyName(ConfigNodePropertyString const& value);
    bool pageInfoProviderPropertyNameIsSet() const;
    void unsetPage_info_provider_property_name();

protected:
    ConfigNodePropertyString m_Page_info_provider_property_regex_default;
    bool m_Page_info_provider_property_regex_defaultIsSet;
    ConfigNodePropertyString m_Page_info_provider_property_name;
    bool m_Page_info_provider_property_nameIsSet;
};

}
}
}
}

#endif /* ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties_H_ */