//
// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties: Codable {

    public var whitelistName: ConfigNodePropertyString?
    public var whitelistBundles: ConfigNodePropertyArray?

    public init(whitelistName: ConfigNodePropertyString?, whitelistBundles: ConfigNodePropertyArray?) {
        self.whitelistName = whitelistName
        self.whitelistBundles = whitelistBundles
    }

    public enum CodingKeys: String, CodingKey { 
        case whitelistName = "whitelist.name"
        case whitelistBundles = "whitelist.bundles"
    }


}
