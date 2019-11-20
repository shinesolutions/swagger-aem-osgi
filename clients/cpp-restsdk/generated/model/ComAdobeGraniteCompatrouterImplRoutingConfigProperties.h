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
 * ComAdobeGraniteCompatrouterImplRoutingConfigProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteCompatrouterImplRoutingConfigProperties
    : public ModelBase
{
public:
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties();
    virtual ~ComAdobeGraniteCompatrouterImplRoutingConfigProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteCompatrouterImplRoutingConfigProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getId() const;
    bool idIsSet() const;
    void unsetId();
    void setId(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getCompatPath() const;
    bool compatPathIsSet() const;
    void unsetCompatPath();
    void setCompatPath(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getNewPath() const;
    bool newPathIsSet() const;
    void unsetNewPath();
    void setNewPath(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Id;
    bool m_IdIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_CompatPath;
    bool m_CompatPathIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_NewPath;
    bool m_NewPathIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_ */