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
 * ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
    : public ModelBase
{
public:
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();
    virtual ~ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getTranslationFactory() const;
    bool translationFactoryIsSet() const;
    void unsetTranslationFactory();
    void setTranslationFactory(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultConnectorLabel() const;
    bool defaultConnectorLabelIsSet() const;
    void unsetDefaultConnectorLabel();
    void setDefaultConnectorLabel(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultConnectorAttribution() const;
    bool defaultConnectorAttributionIsSet() const;
    void unsetDefaultConnectorAttribution();
    void setDefaultConnectorAttribution(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultConnectorWorkspaceId() const;
    bool defaultConnectorWorkspaceIdIsSet() const;
    void unsetDefaultConnectorWorkspaceId();
    void setDefaultConnectorWorkspaceId(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultConnectorSubscriptionKey() const;
    bool defaultConnectorSubscriptionKeyIsSet() const;
    void unsetDefaultConnectorSubscriptionKey();
    void setDefaultConnectorSubscriptionKey(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getLanguageMapLocation() const;
    bool languageMapLocationIsSet() const;
    void unsetLanguageMapLocation();
    void setLanguageMapLocation(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getCategoryMapLocation() const;
    bool categoryMapLocationIsSet() const;
    void unsetCategoryMapLocation();
    void setCategoryMapLocation(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getRetryAttempts() const;
    bool retryAttemptsIsSet() const;
    void unsetRetryAttempts();
    void setRetryAttempts(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getTimeoutCount() const;
    bool timeoutCountIsSet() const;
    void unsetTimeoutCount();
    void setTimeoutCount(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_TranslationFactory;
    bool m_TranslationFactoryIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_DefaultConnectorLabel;
    bool m_DefaultConnectorLabelIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_DefaultConnectorAttribution;
    bool m_DefaultConnectorAttributionIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_DefaultConnectorWorkspaceId;
    bool m_DefaultConnectorWorkspaceIdIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_DefaultConnectorSubscriptionKey;
    bool m_DefaultConnectorSubscriptionKeyIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_LanguageMapLocation;
    bool m_LanguageMapLocationIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_CategoryMapLocation;
    bool m_CategoryMapLocationIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_RetryAttempts;
    bool m_RetryAttemptsIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_TimeoutCount;
    bool m_TimeoutCountIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_ */
