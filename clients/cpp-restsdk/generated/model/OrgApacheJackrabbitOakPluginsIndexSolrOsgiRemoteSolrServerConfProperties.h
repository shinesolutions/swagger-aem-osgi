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
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_


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
class  OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
    : public ModelBase
{
public:
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();
    virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrHttpUrl() const;
    bool solrHttpUrlIsSet() const;
    void unsetSolr_http_url();
    void setSolrHttpUrl(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrZkHost() const;
    bool solrZkHostIsSet() const;
    void unsetSolr_zk_host();
    void setSolrZkHost(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrCollection() const;
    bool solrCollectionIsSet() const;
    void unsetSolr_collection();
    void setSolrCollection(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrSocketTimeout() const;
    bool solrSocketTimeoutIsSet() const;
    void unsetSolr_socket_timeout();
    void setSolrSocketTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrConnectionTimeout() const;
    bool solrConnectionTimeoutIsSet() const;
    void unsetSolr_connection_timeout();
    void setSolrConnectionTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrShardsNo() const;
    bool solrShardsNoIsSet() const;
    void unsetSolr_shards_no();
    void setSolrShardsNo(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrReplicationFactor() const;
    bool solrReplicationFactorIsSet() const;
    void unsetSolr_replication_factor();
    void setSolrReplicationFactor(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrConfDir() const;
    bool solrConfDirIsSet() const;
    void unsetSolr_conf_dir();
    void setSolrConfDir(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Solr_http_url;
    bool m_Solr_http_urlIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Solr_zk_host;
    bool m_Solr_zk_hostIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Solr_collection;
    bool m_Solr_collectionIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_socket_timeout;
    bool m_Solr_socket_timeoutIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_connection_timeout;
    bool m_Solr_connection_timeoutIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_shards_no;
    bool m_Solr_shards_noIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_replication_factor;
    bool m_Solr_replication_factorIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Solr_conf_dir;
    bool m_Solr_conf_dirIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_ */