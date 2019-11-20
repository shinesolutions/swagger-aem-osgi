//
// ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties: Codable {

    public var solrZkTimeout: ConfigNodePropertyString?
    public var solrCommit: ConfigNodePropertyString?
    public var cacheOn: ConfigNodePropertyBoolean?
    public var concurrencyLevel: ConfigNodePropertyInteger?
    public var cacheStartSize: ConfigNodePropertyInteger?
    public var cacheTtl: ConfigNodePropertyInteger?
    public var cacheSize: ConfigNodePropertyInteger?

    public init(solrZkTimeout: ConfigNodePropertyString?, solrCommit: ConfigNodePropertyString?, cacheOn: ConfigNodePropertyBoolean?, concurrencyLevel: ConfigNodePropertyInteger?, cacheStartSize: ConfigNodePropertyInteger?, cacheTtl: ConfigNodePropertyInteger?, cacheSize: ConfigNodePropertyInteger?) {
        self.solrZkTimeout = solrZkTimeout
        self.solrCommit = solrCommit
        self.cacheOn = cacheOn
        self.concurrencyLevel = concurrencyLevel
        self.cacheStartSize = cacheStartSize
        self.cacheTtl = cacheTtl
        self.cacheSize = cacheSize
    }

    public enum CodingKeys: String, CodingKey { 
        case solrZkTimeout = "solr.zk.timeout"
        case solrCommit = "solr.commit"
        case cacheOn = "cache.on"
        case concurrencyLevel = "concurrency.level"
        case cacheStartSize = "cache.start.size"
        case cacheTtl = "cache.ttl"
        case cacheSize = "cache.size"
    }


}
