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
 * ComAdobeGraniteFragsImplRandomFeatureProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteFragsImplRandomFeatureProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteFragsImplRandomFeatureProperties_H_


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
class  ComAdobeGraniteFragsImplRandomFeatureProperties
    : public ModelBase
{
public:
    ComAdobeGraniteFragsImplRandomFeatureProperties();
    virtual ~ComAdobeGraniteFragsImplRandomFeatureProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteFragsImplRandomFeatureProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getFeatureName() const;
    bool featureNameIsSet() const;
    void unsetFeature_name();
    void setFeatureName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getFeatureDescription() const;
    bool featureDescriptionIsSet() const;
    void unsetFeature_description();
    void setFeatureDescription(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getActivePercentage() const;
    bool activePercentageIsSet() const;
    void unsetActive_percentage();
    void setActivePercentage(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getCookieName() const;
    bool cookieNameIsSet() const;
    void unsetCookie_name();
    void setCookieName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getCookieMaxAge() const;
    bool cookieMaxAgeIsSet() const;
    void unsetCookie_maxAge();
    void setCookieMaxAge(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Feature_name;
    bool m_Feature_nameIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Feature_description;
    bool m_Feature_descriptionIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Active_percentage;
    bool m_Active_percentageIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Cookie_name;
    bool m_Cookie_nameIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Cookie_maxAge;
    bool m_Cookie_maxAgeIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteFragsImplRandomFeatureProperties_H_ */