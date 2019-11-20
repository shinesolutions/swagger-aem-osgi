/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
    : public ModelBase
{
public:
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();
    virtual ~ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getNuiEnabled() const;
    bool nuiEnabledIsSet() const;
    void unsetNuiEnabled();
    void setNuiEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getNuiServiceUrl() const;
    bool nuiServiceUrlIsSet() const;
    void unsetNuiServiceUrl();
    void setNuiServiceUrl(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getNuiApiKey() const;
    bool nuiApiKeyIsSet() const;
    void unsetNuiApiKey();
    void setNuiApiKey(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_NuiEnabled;
    bool m_NuiEnabledIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_NuiServiceUrl;
    bool m_NuiServiceUrlIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_NuiApiKey;
    bool m_NuiApiKeyIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_ */