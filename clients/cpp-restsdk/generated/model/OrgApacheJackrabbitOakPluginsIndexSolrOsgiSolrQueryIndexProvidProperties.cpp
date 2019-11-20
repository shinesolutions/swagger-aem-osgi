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



#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties()
{
    m_Query_aggregationIsSet = false;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties()
{
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Query_aggregationIsSet)
    {
        val[utility::conversions::to_string_t("query.aggregation")] = ModelBase::toJson(m_Query_aggregation);
    }

    return val;
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("query.aggregation")))
    {
        if(!val[utility::conversions::to_string_t("query.aggregation")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("query.aggregation")]);
            setQueryAggregation( newItem );
        }
    }
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Query_aggregationIsSet)
    {
        if (m_Query_aggregation.get())
        {
            m_Query_aggregation->toMultipart(multipart, utility::conversions::to_string_t("query.aggregation."));
        }
    }
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("query.aggregation")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("query.aggregation")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("query.aggregation."));
            setQueryAggregation( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::getQueryAggregation() const
{
    return m_Query_aggregation;
}


void OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::setQueryAggregation(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Query_aggregation = value;
    m_Query_aggregationIsSet = true;
}
bool OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::queryAggregationIsSet() const
{
    return m_Query_aggregationIsSet;
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::unsetQuery_aggregation()
{
    m_Query_aggregationIsSet = false;
}

}
}
}
}
