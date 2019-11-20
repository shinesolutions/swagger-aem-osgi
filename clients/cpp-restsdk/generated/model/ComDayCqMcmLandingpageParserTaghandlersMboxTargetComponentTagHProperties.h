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
 * ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties_H_


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
class  ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
    : public ModelBase
{
public:
    ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties();
    virtual ~ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getServiceRanking() const;
    bool serviceRankingIsSet() const;
    void unsetService_ranking();
    void setServiceRanking(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getTagpattern() const;
    bool tagpatternIsSet() const;
    void unsetTagpattern();
    void setTagpattern(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getComponentResourceType() const;
    bool componentResourceTypeIsSet() const;
    void unsetComponent_resourceType();
    void setComponentResourceType(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyInteger> m_Service_ranking;
    bool m_Service_rankingIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Tagpattern;
    bool m_TagpatternIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Component_resourceType;
    bool m_Component_resourceTypeIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties_H_ */