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
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
    : public ModelBase
{
public:
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties();
    virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getQueryAggregation() const;
    bool queryAggregationIsSet() const;
    void unsetQuery_aggregation();
    void setQueryAggregation(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Query_aggregation;
    bool m_Query_aggregationIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties_H_ */