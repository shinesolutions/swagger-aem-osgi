//
// ComAdobeGraniteMonitoringImplScriptConfigImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties: JSONEncodable {
    public var scriptFilename: ConfigNodePropertyString?
    public var scriptDisplay: ConfigNodePropertyString?
    public var scriptPath: ConfigNodePropertyString?
    public var scriptPlatform: ConfigNodePropertyArray?
    public var interval: ConfigNodePropertyInteger?
    public var jmxdomain: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["script.filename"] = self.scriptFilename?.encodeToJSON()
        nillableDictionary["script.display"] = self.scriptDisplay?.encodeToJSON()
        nillableDictionary["script.path"] = self.scriptPath?.encodeToJSON()
        nillableDictionary["script.platform"] = self.scriptPlatform?.encodeToJSON()
        nillableDictionary["interval"] = self.interval?.encodeToJSON()
        nillableDictionary["jmxdomain"] = self.jmxdomain?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}