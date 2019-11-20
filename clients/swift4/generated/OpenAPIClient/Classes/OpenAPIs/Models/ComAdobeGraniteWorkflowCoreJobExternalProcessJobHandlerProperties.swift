//
// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties: Codable {

    public var defaultTimeout: ConfigNodePropertyInteger?
    public var maxTimeout: ConfigNodePropertyInteger?
    public var defaultPeriod: ConfigNodePropertyInteger?

    public init(defaultTimeout: ConfigNodePropertyInteger?, maxTimeout: ConfigNodePropertyInteger?, defaultPeriod: ConfigNodePropertyInteger?) {
        self.defaultTimeout = defaultTimeout
        self.maxTimeout = maxTimeout
        self.defaultPeriod = defaultPeriod
    }

    public enum CodingKeys: String, CodingKey { 
        case defaultTimeout = "default.timeout"
        case maxTimeout = "max.timeout"
        case defaultPeriod = "default.period"
    }


}
