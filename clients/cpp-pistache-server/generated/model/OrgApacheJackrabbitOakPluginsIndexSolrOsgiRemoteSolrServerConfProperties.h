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
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h
 *
 * 
 */

#ifndef OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_
#define OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
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

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSolrHttpUrl() const;
    void setSolrHttpUrl(ConfigNodePropertyString const& value);
    bool solrHttpUrlIsSet() const;
    void unsetSolr_http_url();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSolrZkHost() const;
    void setSolrZkHost(ConfigNodePropertyString const& value);
    bool solrZkHostIsSet() const;
    void unsetSolr_zk_host();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSolrCollection() const;
    void setSolrCollection(ConfigNodePropertyString const& value);
    bool solrCollectionIsSet() const;
    void unsetSolr_collection();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getSolrSocketTimeout() const;
    void setSolrSocketTimeout(ConfigNodePropertyInteger const& value);
    bool solrSocketTimeoutIsSet() const;
    void unsetSolr_socket_timeout();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getSolrConnectionTimeout() const;
    void setSolrConnectionTimeout(ConfigNodePropertyInteger const& value);
    bool solrConnectionTimeoutIsSet() const;
    void unsetSolr_connection_timeout();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getSolrShardsNo() const;
    void setSolrShardsNo(ConfigNodePropertyInteger const& value);
    bool solrShardsNoIsSet() const;
    void unsetSolr_shards_no();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getSolrReplicationFactor() const;
    void setSolrReplicationFactor(ConfigNodePropertyInteger const& value);
    bool solrReplicationFactorIsSet() const;
    void unsetSolr_replication_factor();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSolrConfDir() const;
    void setSolrConfDir(ConfigNodePropertyString const& value);
    bool solrConfDirIsSet() const;
    void unsetSolr_conf_dir();

protected:
    ConfigNodePropertyString m_Solr_http_url;
    bool m_Solr_http_urlIsSet;
    ConfigNodePropertyString m_Solr_zk_host;
    bool m_Solr_zk_hostIsSet;
    ConfigNodePropertyString m_Solr_collection;
    bool m_Solr_collectionIsSet;
    ConfigNodePropertyInteger m_Solr_socket_timeout;
    bool m_Solr_socket_timeoutIsSet;
    ConfigNodePropertyInteger m_Solr_connection_timeout;
    bool m_Solr_connection_timeoutIsSet;
    ConfigNodePropertyInteger m_Solr_shards_no;
    bool m_Solr_shards_noIsSet;
    ConfigNodePropertyInteger m_Solr_replication_factor;
    bool m_Solr_replication_factorIsSet;
    ConfigNodePropertyString m_Solr_conf_dir;
    bool m_Solr_conf_dirIsSet;
};

}
}
}
}

#endif /* OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_ */