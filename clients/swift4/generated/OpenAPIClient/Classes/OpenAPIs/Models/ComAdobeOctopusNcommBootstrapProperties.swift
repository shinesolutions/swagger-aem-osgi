//
// ComAdobeOctopusNcommBootstrapProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeOctopusNcommBootstrapProperties: Codable {

    public var maxConnections: ConfigNodePropertyInteger?
    public var maxRequests: ConfigNodePropertyInteger?
    public var requestTimeout: ConfigNodePropertyInteger?
    public var requestRetries: ConfigNodePropertyInteger?
    public var launchTimeout: ConfigNodePropertyInteger?

    public init(maxConnections: ConfigNodePropertyInteger?, maxRequests: ConfigNodePropertyInteger?, requestTimeout: ConfigNodePropertyInteger?, requestRetries: ConfigNodePropertyInteger?, launchTimeout: ConfigNodePropertyInteger?) {
        self.maxConnections = maxConnections
        self.maxRequests = maxRequests
        self.requestTimeout = requestTimeout
        self.requestRetries = requestRetries
        self.launchTimeout = launchTimeout
    }


}
