//
// ComDayCqWcmFoundationFormsImplMailServletProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqWcmFoundationFormsImplMailServletProperties: Codable {

    public var slingServletResourceTypes: ConfigNodePropertyString?
    public var slingServletSelectors: ConfigNodePropertyString?
    public var resourceWhitelist: ConfigNodePropertyArray?
    public var resourceBlacklist: ConfigNodePropertyString?

    public init(slingServletResourceTypes: ConfigNodePropertyString?, slingServletSelectors: ConfigNodePropertyString?, resourceWhitelist: ConfigNodePropertyArray?, resourceBlacklist: ConfigNodePropertyString?) {
        self.slingServletResourceTypes = slingServletResourceTypes
        self.slingServletSelectors = slingServletSelectors
        self.resourceWhitelist = resourceWhitelist
        self.resourceBlacklist = resourceBlacklist
    }

    public enum CodingKeys: String, CodingKey { 
        case slingServletResourceTypes = "sling.servlet.resourceTypes"
        case slingServletSelectors = "sling.servlet.selectors"
        case resourceWhitelist = "resource.whitelist"
        case resourceBlacklist = "resource.blacklist"
    }


}
