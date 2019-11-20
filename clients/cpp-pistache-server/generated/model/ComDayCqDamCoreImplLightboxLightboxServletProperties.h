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
 * ComDayCqDamCoreImplLightboxLightboxServletProperties.h
 *
 * 
 */

#ifndef ComDayCqDamCoreImplLightboxLightboxServletProperties_H_
#define ComDayCqDamCoreImplLightboxLightboxServletProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamCoreImplLightboxLightboxServletProperties
    : public ModelBase
{
public:
    ComDayCqDamCoreImplLightboxLightboxServletProperties();
    virtual ~ComDayCqDamCoreImplLightboxLightboxServletProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqDamCoreImplLightboxLightboxServletProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSlingServletPaths() const;
    void setSlingServletPaths(ConfigNodePropertyString const& value);
    bool slingServletPathsIsSet() const;
    void unsetSling_servlet_paths();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getSlingServletMethods() const;
    void setSlingServletMethods(ConfigNodePropertyArray const& value);
    bool slingServletMethodsIsSet() const;
    void unsetSling_servlet_methods();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getCqDamEnableAnonymous() const;
    void setCqDamEnableAnonymous(ConfigNodePropertyBoolean const& value);
    bool cqDamEnableAnonymousIsSet() const;
    void unsetCq_dam_enable_anonymous();

protected:
    ConfigNodePropertyString m_Sling_servlet_paths;
    bool m_Sling_servlet_pathsIsSet;
    ConfigNodePropertyArray m_Sling_servlet_methods;
    bool m_Sling_servlet_methodsIsSet;
    ConfigNodePropertyBoolean m_Cq_dam_enable_anonymous;
    bool m_Cq_dam_enable_anonymousIsSet;
};

}
}
}
}

#endif /* ComDayCqDamCoreImplLightboxLightboxServletProperties_H_ */