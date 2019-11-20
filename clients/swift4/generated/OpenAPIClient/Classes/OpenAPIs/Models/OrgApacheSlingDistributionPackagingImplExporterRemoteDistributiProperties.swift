//
// OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties: Codable {

    public var name: ConfigNodePropertyString?
    public var endpoints: ConfigNodePropertyArray?
    public var pullItems: ConfigNodePropertyInteger?
    public var packageBuilderTarget: ConfigNodePropertyString?
    public var transportSecretProviderTarget: ConfigNodePropertyString?

    public init(name: ConfigNodePropertyString?, endpoints: ConfigNodePropertyArray?, pullItems: ConfigNodePropertyInteger?, packageBuilderTarget: ConfigNodePropertyString?, transportSecretProviderTarget: ConfigNodePropertyString?) {
        self.name = name
        self.endpoints = endpoints
        self.pullItems = pullItems
        self.packageBuilderTarget = packageBuilderTarget
        self.transportSecretProviderTarget = transportSecretProviderTarget
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case endpoints
        case pullItems = "pull.items"
        case packageBuilderTarget = "packageBuilder.target"
        case transportSecretProviderTarget = "transportSecretProvider.target"
    }


}
