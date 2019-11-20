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
 * ComDayCqContentsyncImplContentSyncManagerImplProperties.h
 *
 * 
 */

#ifndef ComDayCqContentsyncImplContentSyncManagerImplProperties_H_
#define ComDayCqContentsyncImplContentSyncManagerImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqContentsyncImplContentSyncManagerImplProperties
    : public ModelBase
{
public:
    ComDayCqContentsyncImplContentSyncManagerImplProperties();
    virtual ~ComDayCqContentsyncImplContentSyncManagerImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqContentsyncImplContentSyncManagerImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getContentsyncFallbackAuthorizable() const;
    void setContentsyncFallbackAuthorizable(ConfigNodePropertyString const& value);
    bool contentsyncFallbackAuthorizableIsSet() const;
    void unsetContentsync_fallback_authorizable();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getContentsyncFallbackUpdateuser() const;
    void setContentsyncFallbackUpdateuser(ConfigNodePropertyString const& value);
    bool contentsyncFallbackUpdateuserIsSet() const;
    void unsetContentsync_fallback_updateuser();

protected:
    ConfigNodePropertyString m_Contentsync_fallback_authorizable;
    bool m_Contentsync_fallback_authorizableIsSet;
    ConfigNodePropertyString m_Contentsync_fallback_updateuser;
    bool m_Contentsync_fallback_updateuserIsSet;
};

}
}
}
}

#endif /* ComDayCqContentsyncImplContentSyncManagerImplProperties_H_ */