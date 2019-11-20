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



#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
{
    m_Solr_home_pathIsSet = false;
    m_Solr_core_nameIsSet = false;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
{
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Solr_home_pathIsSet)
    {
        val[utility::conversions::to_string_t("solr.home.path")] = ModelBase::toJson(m_Solr_home_path);
    }
    if(m_Solr_core_nameIsSet)
    {
        val[utility::conversions::to_string_t("solr.core.name")] = ModelBase::toJson(m_Solr_core_name);
    }

    return val;
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("solr.home.path")))
    {
        if(!val[utility::conversions::to_string_t("solr.home.path")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("solr.home.path")]);
            setSolrHomePath( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("solr.core.name")))
    {
        if(!val[utility::conversions::to_string_t("solr.core.name")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("solr.core.name")]);
            setSolrCoreName( newItem );
        }
    }
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Solr_home_pathIsSet)
    {
        if (m_Solr_home_path.get())
        {
            m_Solr_home_path->toMultipart(multipart, utility::conversions::to_string_t("solr.home.path."));
        }
    }
    if(m_Solr_core_nameIsSet)
    {
        if (m_Solr_core_name.get())
        {
            m_Solr_core_name->toMultipart(multipart, utility::conversions::to_string_t("solr.core.name."));
        }
    }
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("solr.home.path")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("solr.home.path")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("solr.home.path."));
            setSolrHomePath( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("solr.core.name")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("solr.core.name")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("solr.core.name."));
            setSolrCoreName( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::getSolrHomePath() const
{
    return m_Solr_home_path;
}


void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::setSolrHomePath(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Solr_home_path = value;
    m_Solr_home_pathIsSet = true;
}
bool OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::solrHomePathIsSet() const
{
    return m_Solr_home_pathIsSet;
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::unsetSolr_home_path()
{
    m_Solr_home_pathIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::getSolrCoreName() const
{
    return m_Solr_core_name;
}


void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::setSolrCoreName(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Solr_core_name = value;
    m_Solr_core_nameIsSet = true;
}
bool OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::solrCoreNameIsSet() const
{
    return m_Solr_core_nameIsSet;
}

void OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::unsetSolr_core_name()
{
    m_Solr_core_nameIsSet = false;
}

}
}
}
}
