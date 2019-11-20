//
// OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingI18nImplJcrResourceBundleProviderProperties: Codable {

    public var localeDefault: ConfigNodePropertyString?
    public var preloadBundles: ConfigNodePropertyBoolean?
    public var invalidationDelay: ConfigNodePropertyInteger?

    public init(localeDefault: ConfigNodePropertyString?, preloadBundles: ConfigNodePropertyBoolean?, invalidationDelay: ConfigNodePropertyInteger?) {
        self.localeDefault = localeDefault
        self.preloadBundles = preloadBundles
        self.invalidationDelay = invalidationDelay
    }

    public enum CodingKeys: String, CodingKey { 
        case localeDefault = "locale.default"
        case preloadBundles = "preload.bundles"
        case invalidationDelay = "invalidation.delay"
    }


}
