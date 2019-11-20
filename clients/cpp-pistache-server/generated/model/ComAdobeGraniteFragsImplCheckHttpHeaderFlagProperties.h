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
 * ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_
#define ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
    : public ModelBase
{
public:
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();
    virtual ~ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getFeatureName() const;
    void setFeatureName(ConfigNodePropertyString const& value);
    bool featureNameIsSet() const;
    void unsetFeature_name();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getFeatureDescription() const;
    void setFeatureDescription(ConfigNodePropertyString const& value);
    bool featureDescriptionIsSet() const;
    void unsetFeature_description();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getHttpHeaderName() const;
    void setHttpHeaderName(ConfigNodePropertyString const& value);
    bool httpHeaderNameIsSet() const;
    void unsetHttp_header_name();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getHttpHeaderValuepattern() const;
    void setHttpHeaderValuepattern(ConfigNodePropertyString const& value);
    bool httpHeaderValuepatternIsSet() const;
    void unsetHttp_header_valuepattern();

protected:
    ConfigNodePropertyString m_Feature_name;
    bool m_Feature_nameIsSet;
    ConfigNodePropertyString m_Feature_description;
    bool m_Feature_descriptionIsSet;
    ConfigNodePropertyString m_Http_header_name;
    bool m_Http_header_nameIsSet;
    ConfigNodePropertyString m_Http_header_valuepattern;
    bool m_Http_header_valuepatternIsSet;
};

}
}
}
}

#endif /* ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_ */