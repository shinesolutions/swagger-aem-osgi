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
 * ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.h
 *
 * 
 */

#ifndef ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_
#define ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
    : public ModelBase
{
public:
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();
    virtual ~ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getFormportalInterval() const;
    void setFormportalInterval(ConfigNodePropertyString const& value);
    bool formportalIntervalIsSet() const;
    void unsetFormportal_interval();

protected:
    ConfigNodePropertyString m_Formportal_interval;
    bool m_Formportal_intervalIsSet;
};

}
}
}
}

#endif /* ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_ */