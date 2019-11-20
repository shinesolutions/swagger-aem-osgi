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
 * ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties();
    virtual ~ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getEventTopics() const;
    bool eventTopicsIsSet() const;
    void unsetEvent_topics();
    void setEventTopics(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getEventFilter() const;
    bool eventFilterIsSet() const;
    void unsetEvent_filter();
    void setEventFilter(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getVerbs() const;
    bool verbsIsSet() const;
    void unsetVerbs();
    void setVerbs(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Event_topics;
    bool m_Event_topicsIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Event_filter;
    bool m_Event_filterIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Verbs;
    bool m_VerbsIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_ */