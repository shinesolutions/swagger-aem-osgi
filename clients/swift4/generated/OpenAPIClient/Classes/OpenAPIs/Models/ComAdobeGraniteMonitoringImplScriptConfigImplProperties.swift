//
// ComAdobeGraniteMonitoringImplScriptConfigImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeGraniteMonitoringImplScriptConfigImplProperties: Codable {

    public var scriptFilename: ConfigNodePropertyString?
    public var scriptDisplay: ConfigNodePropertyString?
    public var scriptPath: ConfigNodePropertyString?
    public var scriptPlatform: ConfigNodePropertyArray?
    public var interval: ConfigNodePropertyInteger?
    public var jmxdomain: ConfigNodePropertyString?

    public init(scriptFilename: ConfigNodePropertyString?, scriptDisplay: ConfigNodePropertyString?, scriptPath: ConfigNodePropertyString?, scriptPlatform: ConfigNodePropertyArray?, interval: ConfigNodePropertyInteger?, jmxdomain: ConfigNodePropertyString?) {
        self.scriptFilename = scriptFilename
        self.scriptDisplay = scriptDisplay
        self.scriptPath = scriptPath
        self.scriptPlatform = scriptPlatform
        self.interval = interval
        self.jmxdomain = jmxdomain
    }

    public enum CodingKeys: String, CodingKey { 
        case scriptFilename = "script.filename"
        case scriptDisplay = "script.display"
        case scriptPath = "script.path"
        case scriptPlatform = "script.platform"
        case interval
        case jmxdomain
    }


}
