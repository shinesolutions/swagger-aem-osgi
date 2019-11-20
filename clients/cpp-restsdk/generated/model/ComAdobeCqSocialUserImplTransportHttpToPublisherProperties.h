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
 * ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties();
    virtual ~ComAdobeCqSocialUserImplTransportHttpToPublisherProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialUserImplTransportHttpToPublisherProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getEnable() const;
    bool enableIsSet() const;
    void unsetEnable();
    void setEnable(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getAgentConfiguration() const;
    bool agentConfigurationIsSet() const;
    void unsetAgent_configuration();
    void setAgentConfiguration(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getContextPath() const;
    bool contextPathIsSet() const;
    void unsetContext_path();
    void setContextPath(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getDisabledCipherSuites() const;
    bool disabledCipherSuitesIsSet() const;
    void unsetDisabled_cipher_suites();
    void setDisabledCipherSuites(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getEnabledCipherSuites() const;
    bool enabledCipherSuitesIsSet() const;
    void unsetEnabled_cipher_suites();
    void setEnabledCipherSuites(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Enable;
    bool m_EnableIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Agent_configuration;
    bool m_Agent_configurationIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Context_path;
    bool m_Context_pathIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Disabled_cipher_suites;
    bool m_Disabled_cipher_suitesIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Enabled_cipher_suites;
    bool m_Enabled_cipher_suitesIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_ */