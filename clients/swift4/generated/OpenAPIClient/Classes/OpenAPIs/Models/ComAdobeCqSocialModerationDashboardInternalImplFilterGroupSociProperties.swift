//
// ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties: Codable {

    public var resourceTypeFilters: ConfigNodePropertyArray?
    public var priority: ConfigNodePropertyInteger?

    public init(resourceTypeFilters: ConfigNodePropertyArray?, priority: ConfigNodePropertyInteger?) {
        self.resourceTypeFilters = resourceTypeFilters
        self.priority = priority
    }

    public enum CodingKeys: String, CodingKey { 
        case resourceTypeFilters = "resourceType.filters"
        case priority
    }


}
