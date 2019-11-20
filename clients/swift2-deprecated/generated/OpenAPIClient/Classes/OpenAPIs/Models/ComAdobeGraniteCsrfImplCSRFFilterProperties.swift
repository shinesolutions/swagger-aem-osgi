//
// ComAdobeGraniteCsrfImplCSRFFilterProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteCsrfImplCSRFFilterProperties: JSONEncodable {
    public var filterMethods: ConfigNodePropertyArray?
    public var filterEnableSafeUserAgents: ConfigNodePropertyBoolean?
    public var filterSafeUserAgents: ConfigNodePropertyArray?
    public var filterExcludedPaths: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["filter.methods"] = self.filterMethods?.encodeToJSON()
        nillableDictionary["filter.enable.safe.user.agents"] = self.filterEnableSafeUserAgents?.encodeToJSON()
        nillableDictionary["filter.safe.user.agents"] = self.filterSafeUserAgents?.encodeToJSON()
        nillableDictionary["filter.excluded.paths"] = self.filterExcludedPaths?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}