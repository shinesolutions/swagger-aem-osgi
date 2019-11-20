//
// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties: Codable {

    public var solrHttpUrl: ConfigNodePropertyString?
    public var solrZkHost: ConfigNodePropertyString?
    public var solrCollection: ConfigNodePropertyString?
    public var solrSocketTimeout: ConfigNodePropertyInteger?
    public var solrConnectionTimeout: ConfigNodePropertyInteger?
    public var solrShardsNo: ConfigNodePropertyInteger?
    public var solrReplicationFactor: ConfigNodePropertyInteger?
    public var solrConfDir: ConfigNodePropertyString?

    public init(solrHttpUrl: ConfigNodePropertyString?, solrZkHost: ConfigNodePropertyString?, solrCollection: ConfigNodePropertyString?, solrSocketTimeout: ConfigNodePropertyInteger?, solrConnectionTimeout: ConfigNodePropertyInteger?, solrShardsNo: ConfigNodePropertyInteger?, solrReplicationFactor: ConfigNodePropertyInteger?, solrConfDir: ConfigNodePropertyString?) {
        self.solrHttpUrl = solrHttpUrl
        self.solrZkHost = solrZkHost
        self.solrCollection = solrCollection
        self.solrSocketTimeout = solrSocketTimeout
        self.solrConnectionTimeout = solrConnectionTimeout
        self.solrShardsNo = solrShardsNo
        self.solrReplicationFactor = solrReplicationFactor
        self.solrConfDir = solrConfDir
    }

    public enum CodingKeys: String, CodingKey { 
        case solrHttpUrl = "solr.http.url"
        case solrZkHost = "solr.zk.host"
        case solrCollection = "solr.collection"
        case solrSocketTimeout = "solr.socket.timeout"
        case solrConnectionTimeout = "solr.connection.timeout"
        case solrShardsNo = "solr.shards.no"
        case solrReplicationFactor = "solr.replication.factor"
        case solrConfDir = "solr.conf.dir"
    }


}
