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
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.h
 *
 * 
 */

#ifndef ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_
#define ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
    : public ModelBase
{
public:
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();
    virtual ~ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyDropDown getGetCacheExpirationUnit() const;
    void setGetCacheExpirationUnit(ConfigNodePropertyDropDown const& value);
    bool getCacheExpirationUnitIsSet() const;
    void unsetGetCacheExpirationUnit();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getGetCacheExpirationValue() const;
    void setGetCacheExpirationValue(ConfigNodePropertyInteger const& value);
    bool getCacheExpirationValueIsSet() const;
    void unsetGetCacheExpirationValue();

protected:
    ConfigNodePropertyDropDown m_GetCacheExpirationUnit;
    bool m_GetCacheExpirationUnitIsSet;
    ConfigNodePropertyInteger m_GetCacheExpirationValue;
    bool m_GetCacheExpirationValueIsSet;
};

}
}
}
}

#endif /* ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_ */