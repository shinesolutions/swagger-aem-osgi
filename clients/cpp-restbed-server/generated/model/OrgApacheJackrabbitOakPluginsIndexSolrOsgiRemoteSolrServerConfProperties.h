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

#ifndef OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_
#define OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_



#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
{
public:
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();
    virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrHttpUrl() const;
    void setSolrHttpUrl(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrZkHost() const;
    void setSolrZkHost(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrCollection() const;
    void setSolrCollection(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrSocketTimeout() const;
    void setSolrSocketTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrConnectionTimeout() const;
    void setSolrConnectionTimeout(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrShardsNo() const;
    void setSolrShardsNo(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getSolrReplicationFactor() const;
    void setSolrReplicationFactor(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSolrConfDir() const;
    void setSolrConfDir(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Solr_http_url;
    std::shared_ptr<ConfigNodePropertyString> m_Solr_zk_host;
    std::shared_ptr<ConfigNodePropertyString> m_Solr_collection;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_socket_timeout;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_connection_timeout;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_shards_no;
    std::shared_ptr<ConfigNodePropertyInteger> m_Solr_replication_factor;
    std::shared_ptr<ConfigNodePropertyString> m_Solr_conf_dir;
};

}
}
}
}

#endif /* OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_ */