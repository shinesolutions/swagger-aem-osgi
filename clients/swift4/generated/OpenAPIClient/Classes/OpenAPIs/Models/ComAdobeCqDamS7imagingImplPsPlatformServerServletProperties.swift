//
// ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties: Codable {

    public var cacheEnable: ConfigNodePropertyBoolean?
    public var cacheRootPaths: ConfigNodePropertyArray?
    public var cacheMaxSize: ConfigNodePropertyInteger?
    public var cacheMaxEntries: ConfigNodePropertyInteger?

    public init(cacheEnable: ConfigNodePropertyBoolean?, cacheRootPaths: ConfigNodePropertyArray?, cacheMaxSize: ConfigNodePropertyInteger?, cacheMaxEntries: ConfigNodePropertyInteger?) {
        self.cacheEnable = cacheEnable
        self.cacheRootPaths = cacheRootPaths
        self.cacheMaxSize = cacheMaxSize
        self.cacheMaxEntries = cacheMaxEntries
    }

    public enum CodingKeys: String, CodingKey { 
        case cacheEnable = "cache.enable"
        case cacheRootPaths = "cache.rootPaths"
        case cacheMaxSize = "cache.maxSize"
        case cacheMaxEntries = "cache.maxEntries"
    }


}
