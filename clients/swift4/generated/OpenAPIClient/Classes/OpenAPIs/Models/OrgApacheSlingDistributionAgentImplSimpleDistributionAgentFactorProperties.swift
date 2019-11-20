//
// OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties: Codable {

    public var name: ConfigNodePropertyString?
    public var title: ConfigNodePropertyString?
    public var details: ConfigNodePropertyString?
    public var enabled: ConfigNodePropertyBoolean?
    public var serviceName: ConfigNodePropertyString?
    public var logLevel: ConfigNodePropertyDropDown?
    public var queueProcessingEnabled: ConfigNodePropertyBoolean?
    public var packageExporterTarget: ConfigNodePropertyString?
    public var packageImporterTarget: ConfigNodePropertyString?
    public var requestAuthorizationStrategyTarget: ConfigNodePropertyString?
    public var triggersTarget: ConfigNodePropertyString?

    public init(name: ConfigNodePropertyString?, title: ConfigNodePropertyString?, details: ConfigNodePropertyString?, enabled: ConfigNodePropertyBoolean?, serviceName: ConfigNodePropertyString?, logLevel: ConfigNodePropertyDropDown?, queueProcessingEnabled: ConfigNodePropertyBoolean?, packageExporterTarget: ConfigNodePropertyString?, packageImporterTarget: ConfigNodePropertyString?, requestAuthorizationStrategyTarget: ConfigNodePropertyString?, triggersTarget: ConfigNodePropertyString?) {
        self.name = name
        self.title = title
        self.details = details
        self.enabled = enabled
        self.serviceName = serviceName
        self.logLevel = logLevel
        self.queueProcessingEnabled = queueProcessingEnabled
        self.packageExporterTarget = packageExporterTarget
        self.packageImporterTarget = packageImporterTarget
        self.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget
        self.triggersTarget = triggersTarget
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case title
        case details
        case enabled
        case serviceName
        case logLevel = "log.level"
        case queueProcessingEnabled = "queue.processing.enabled"
        case packageExporterTarget = "packageExporter.target"
        case packageImporterTarget = "packageImporter.target"
        case requestAuthorizationStrategyTarget = "requestAuthorizationStrategy.target"
        case triggersTarget = "triggers.target"
    }


}
