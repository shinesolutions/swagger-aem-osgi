//
// OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties: Codable {

    public var name: ConfigNodePropertyString?
    public var endpoint: ConfigNodePropertyString?
    public var transportSecretProviderTarget: ConfigNodePropertyString?

    public init(name: ConfigNodePropertyString?, endpoint: ConfigNodePropertyString?, transportSecretProviderTarget: ConfigNodePropertyString?) {
        self.name = name
        self.endpoint = endpoint
        self.transportSecretProviderTarget = transportSecretProviderTarget
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case endpoint
        case transportSecretProviderTarget = "transportSecretProvider.target"
    }


}
