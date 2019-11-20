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
 * ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.h
 *
 * 
 */

#ifndef ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_
#define ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
    : public ModelBase
{
public:
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();
    virtual ~ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getName() const;
    void setName(ConfigNodePropertyString const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getLocale() const;
    void setLocale(ConfigNodePropertyString const& value);
    bool localeIsSet() const;
    void unsetLocale();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getImsConfig() const;
    void setImsConfig(ConfigNodePropertyString const& value);
    bool imsConfigIsSet() const;
    void unsetImsConfig();

protected:
    ConfigNodePropertyString m_Name;
    bool m_NameIsSet;
    ConfigNodePropertyString m_Locale;
    bool m_LocaleIsSet;
    ConfigNodePropertyString m_ImsConfig;
    bool m_ImsConfigIsSet;
};

}
}
}
}

#endif /* ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_ */